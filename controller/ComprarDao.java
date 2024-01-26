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
import model.Comprar;

/**
 *
 * @author joelmir
 */
public class ComprarDao implements Dao{
    public conn con = new conn();
    @Override
    public void inserir(Object o) {
            Comprar c = (Comprar) o;
            String sql = "INSERT INTO Comprar(produto,valor,quantidade,nomecliente,funcionario,datacompra) VALUES(?,?,?,?,?,?)";
            try{
                PreparedStatement ps = conn.getConexao().prepareStatement(sql);
                ps.setString(1,c.getProduto());
                ps.setFloat(2,c.getValor());
                ps.setInt(3,c.getQuantidade());
                ps.setString(4,c.getNomeCliente());
                ps.setString(5,c.getFuncionario());
                ps.setString(6,c.getDatacompra());
                ps.execute();
                ps.close();
            }
            catch(SQLException ex){
                System.out.println("Erro SQL...!"+ex);
            }
    }

    @Override
    public void atualizar(Object o) {
            Comprar c = (Comprar) o;
            String sql = "UPDATE Comprar SET produto=?,quantidade=?,valor=?,nomecliente=?,funcionario=?,datacompra=? WHERE id=?";
            try{
                PreparedStatement ps = conn.getConexao().prepareStatement(sql);
                ps.setString(1, c.getProduto());
                ps.setInt(2,c.getQuantidade());
                ps.setFloat(3,c.getValor());
                ps.setString(4,c.getNomeCliente());
                ps.setString(5,c.getFuncionario());
                ps.setString(6,c.getDatacompra());
                ps.setString(7, c.getCodigo());
                ps.executeUpdate();
                ps.close();
            }
            catch(SQLException ex){
                System.out.println("Erro SQL...!"+ex);
            }
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Comprar WHERE id="+o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro SQL...!"+ex);  
       } 
    }

    @Override
    public ArrayList<Comprar> Buscar(Object o) {
        ArrayList<Comprar> ListaCo = new ArrayList<>();
        String sql = "SELECT * FROM Comprar WHERE nomecliente LIKE ?";
        try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    // Continuação do sql pesquisar, utilizando LIKE,
                    //objeto % digitado da tabela 
                    ps.setString(1, o+"%");

                        try (ResultSet rs = ps.executeQuery()) {
                            while (rs.next()) {
                                Comprar c = new Comprar();
                                c.setCodigo(rs.getString("id"));
                                c.setProduto(rs.getString("produto"));
                                c.setQuantidade(rs.getInt("quantidade"));
                                c.setValor(rs.getFloat("valor"));
                                c.setNomeCliente(rs.getString("nomecliente"));
                                c.setFuncionario(rs.getString("funcionario"));
                                c.setDatacompra(rs.getString("datacompra"));
                                ListaCo.add(c);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
                }
            return ListaCo;
    }

    @Override
    public ArrayList<Comprar> ProcurarTudo() {
        ArrayList<Comprar> ListaCo = new ArrayList<>();
        String sql = "SELECT * FROM Comprar";
        try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                                Comprar c = new Comprar();
                                c.setCodigo(rs.getString("id"));
                                c.setProduto(rs.getString("produto"));
                                c.setQuantidade(rs.getInt("quantidade"));
                                c.setValor(rs.getFloat("valor"));
                                c.setNomeCliente(rs.getString("nomecliente"));
                                c.setFuncionario(rs.getString("funcionario"));
                                c.setDatacompra(rs.getString("datacompra"));
                                ListaCo.add(c);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
                }
            return ListaCo;
    }
    
}
