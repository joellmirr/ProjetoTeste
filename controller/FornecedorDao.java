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
import model.Fornecedor;

/**
 *
 * @author joelmir
 */
public class FornecedorDao implements Dao{
    public conn con = new conn();
    @Override
    public void inserir(Object o) {
        Fornecedor f = (Fornecedor) o;
         String sql = "INSERT INTO Fornecedor(nome,cnpj,email,telefone,produto,endereco) VALUES(?,?,?,?,?,?)";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,f.getNome());
           ps.setString(2,f.getCnpj());
           ps.setString(3,f.getEmail());
           ps.setString(4, f.getTelefone());
           ps.setString(5,f.getProduto());
           ps.setString(6, f.getEndereco());
           ps.execute();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void atualizar(Object o) {
        Fornecedor f = (Fornecedor) o;
        String sql = "UPDATE Fornecedor SET nome=?,cnpj=?,email=?,telefone=?,produto=?,endereco=? WHERE id=?";
        try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,f.getNome());
           ps.setString(2,f.getCnpj());
           ps.setString(3,f.getEmail());
           ps.setString(4, f.getTelefone());
           ps.setString(5,f.getProduto());
           ps.setString(6, f.getEndereco());
           ps.setString(7, f.getCodigo());
           ps.execute();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Fornecedor WHERE id="+o;
          try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro SQL...");  
       } 
    }

    @Override
    public ArrayList<Fornecedor>  Buscar(Object o) {
      ArrayList<Fornecedor> ListaFo = new ArrayList<>();
      String sql = "SELECT * FROM Fornecedor WHERE nome LIKE ?";
      try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    // Continuação do sql pesquisar, utilizando LIKE,
                    //objeto % digitado da tabela
                    ps.setString(1, "%"+o+"%");
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            Fornecedor f = new Fornecedor();
                            f.setCodigo(rs.getString("id"));
                            f.setNome(rs.getString("nome"));
                            f.setCnpj(rs.getString("cnpj"));
                            f.setEmail(rs.getString("email"));
                            f.setTelefone(rs.getString("telefone"));
                            f.setProduto(rs.getString("produto"));
                            f.setEndereco(rs.getString("endereco"));
                            ListaFo.add(f);
                        }
                        }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaFo;
    }

    @Override
    public ArrayList<Fornecedor> ProcurarTudo() {
        ArrayList<Fornecedor> ListaFo = new ArrayList<>();
        String sql = "SELECT * FROM Fornecedor";
        try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            Fornecedor f = new Fornecedor();
                            f.setCodigo(rs.getString("id"));
                            f.setNome(rs.getString("nome"));
                            f.setCnpj(rs.getString("cnpj"));
                            f.setEmail(rs.getString("email"));
                            f.setTelefone(rs.getString("telefone"));
                            f.setProduto(rs.getString("produto"));
                            f.setEndereco(rs.getString("endereco"));
                            ListaFo.add(f);
                        }
                        }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaFo;
    }
}
    
