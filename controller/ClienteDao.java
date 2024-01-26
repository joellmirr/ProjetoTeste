/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public abstract class ClienteDao implements Dao{
    public conn con = new conn();
    public void inserir(Object o) {
       Cliente c = (Cliente) o;
       //JOptionPane.showMessageDialog(null,"teste 1");
       String sql = "INSERT INTO Cliente(nome,cpf,email,telefone,endereco) VALUES(?,?,?,?,?)";
     //  JOptionPane.showMessageDialog(null,"teste 2");
       try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,c.getNome());
           ps.setString(2,c.getCpf());
           ps.setString(3,c.getEmail());
           ps.setString(4, c.getTelefone());
           ps.setString(5, c.getEndereco());
           ps.execute();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
       
    }

    @Override
    public void atualizar(Object o) {
         Cliente c = (Cliente) o;
         String sql = "UPDATE Cliente SET nome=?,cpf=?,email=?,telefone=?,endereco=? WHERE id=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,c.getNome());
           ps.setString(2,c.getCpf());
           ps.setString(3, c.getEmail());
           ps.setString(4, c.getTelefone());
           ps.setString(5, c.getEndereco());
           ps.setString(6, c.getCodigo());
           ps.execute();
           ps.close(); 
         } catch(SQLException ex){
         System.out.println("");  
       } 
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Cliente WHERE id=" + o;
        try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro SQL...");  
       } 
    }
    @Override
    public ArrayList<Cliente> Buscar(Object o){
        ArrayList<Cliente> ListaC = new ArrayList<>();
        String sql = "SELECT * FROM Cliente WHERE nome LIKE ?";
        try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    // Continuação do sql pesquisar, utilizando LIKE,
                    //objeto % digitado da tabela 
                    ps.setString(1, o+"%");

                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            Cliente c = new Cliente();
                            c.setCodigo(rs.getString("id"));
                            c.setNome(rs.getString("nome"));
                            c.setCpf(rs.getString("cpf"));
                            c.setEmail(rs.getString("email"));
                            c.setTelefone(rs.getString("telefone"));
                            c.setEndereco(rs.getString("Endereco"));
                            ListaC.add(c);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaC;
    }

    
    @Override
    public ArrayList<Cliente> ProcurarTudo() {
        ArrayList<Cliente> ListaC = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            Cliente c = new Cliente();
                            c.setCodigo(rs.getString("id"));
                            c.setNome(rs.getString("nome"));
                            c.setCpf(rs.getString("cpf"));
                            c.setEmail(rs.getString("email"));
                            c.setTelefone(rs.getString("telefone"));
                            c.setEndereco(rs.getString("Endereco"));
                            ListaC.add(c);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaC;
    }
}
