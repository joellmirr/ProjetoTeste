/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author joelmir
 */
public class ProdutoDao implements Dao{
    public conn con = new conn();
    
    @Override
    public void inserir(Object o) {
        Produto p = (Produto) o;
        String sql = "INSERT INTO Produto(nome,preco,quantidade,descricao) VALUES(?,?,?,?)";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,p.getNome());
           ps.setFloat(2,p.getPreco());
           ps.setInt(3,p.getQuantidade());
           ps.setString(4, p.getDescricao());
           ps.execute();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void atualizar(Object o) {
        Produto p = (Produto) o;
        String sql = "UPDATE Produto SET nome=?,preco=?,quantidade=?,descricao=? WHERE id=? ";
        try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,p.getNome());
           ps.setFloat(2,p.getPreco());
           ps.setInt(3,p.getQuantidade());
           ps.setString(4, p.getDescricao());
           ps.setString(5,p.getCodigo());
           ps.executeUpdate();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Produto WHERE id="+o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro SQL...");  
       }
    }
    
    public ArrayList<Produto> Buscar(Object o) {
      ArrayList<Produto> ListaP = new ArrayList<>();
      String sql = "SELECT * FROM Produto WHERE nome LIKE ?";
            try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    // Continuação do sql pesquisar, utilizando LIKE,
                    //objeto % digitado da tabela Consultar Produto
                    ps.setString(1,"%"+o+"%");

                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            Produto p = new Produto(); 
                            p.setCodigo(rs.getString("id"));
                            p.setNome(rs.getString("nome"));
                            p.setPreco(rs.getFloat("preco"));
                            p.setQuantidade(rs.getInt("quantidade"));
                            p.setDescricao(rs.getString("descricao"));
                            ListaP.add(p);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaP;
    }

    @Override
    public ArrayList<Produto> ProcurarTudo() {
        ArrayList<Produto> ListaP = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try {
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigo(rs.getString("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setDescricao(rs.getString("descricao"));
                ListaP.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Sql!\n\n"+ ex);
        }
        return ListaP;
    }
 }

 