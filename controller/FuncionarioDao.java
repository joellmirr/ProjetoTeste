/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class FuncionarioDao implements Dao{
    public conn con = new conn();
    @Override
    public void inserir(Object o) {
        Funcionario f = (Funcionario) o;
        String sql = "INSERT INTO Funcionario(nome,cargo,cpf,email,telefone,endereco,nivelascesso)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,f.getNome());
           ps.setString(2,f.getCargo());
           ps.setString(3,f.getCpf());
           ps.setString(4,f.getEmail());
           ps.setString(5,f.getTelefone());
           ps.setString(6,f.getEndereco());
           ps.setString(7,f.getNivelAscesso());
           ps.execute();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void atualizar(Object o) {
        Funcionario f = (Funcionario) o;
        String sql = "UPDATE Funcionario SET nome=?,cargo=?,cpf=?,email=?,telefone=?,endereco=?,"
                + "nivelascesso=? WHERE id=?";
         try{
           PreparedStatement ps = conn.getConexao().prepareStatement(sql);
           ps.setString(1,f.getNome());
           ps.setString(2,f.getCargo());
           ps.setString(3,f.getCpf());
           ps.setString(4,f.getEmail());
           ps.setString(5,f.getTelefone());
           ps.setString(6,f.getEndereco());
           ps.setString(7,f.getNivelAscesso());
           ps.setString(8, f.getCodigo());
           ps.executeUpdate();
           ps.close();
          // con.FecharConexao();
       }catch(SQLException ex){
         System.out.println("Erro SQL...");  
       }
    }

    @Override
    public void excluir(int o) {
        String sql = "DELETE FROM Funcionario WHERE id="+o;
         try{
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ps.execute();
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro SQL...");  
       }
    }

    @Override
    public ArrayList<Funcionario>  Buscar(Object o) {
       ArrayList<Funcionario> ListaFu = new ArrayList<>();
      String sql = "SELECT * FROM Funcionario WHERE nome LIKE ?";
            try {
                try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                    // Continuação do sql pesquisar, utilizando LIKE,
                    //objeto % digitado da tabela
                    ps.setString(1, "%"+o+"%");
                try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                           Funcionario f = new Funcionario();
                           f.setCodigo(rs.getString("id"));
                           f.setNome(rs.getString("nome"));
                           f.setCargo(rs.getString("cargo"));
                           f.setCpf(rs.getString("cpf"));
                           f.setEmail(rs.getString("email"));
                           f.setTelefone(rs.getString("telefone"));
                           f.setEndereco(rs.getString("endereco"));
                           f.setNivelAscesso(rs.getString("nivelascesso"));
                           ListaFu.add(f);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaFu;
    }

@Override
    public ArrayList<Funcionario> ProcurarTudo() {
            ArrayList<Funcionario> ListaFu = new ArrayList<>();
            String sql = "SELECT * FROM Funcionario";
            try (PreparedStatement ps = conn.getConexao().prepareStatement(sql)) {
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                           Funcionario f = new Funcionario();
                           f.setCodigo(rs.getString("id"));
                           f.setNome(rs.getString("nome"));
                           f.setCargo(rs.getString("cargo"));
                           f.setCpf(rs.getString("cpf"));
                           f.setEmail(rs.getString("email"));
                           f.setTelefone(rs.getString("telefone"));
                           f.setEndereco(rs.getString("endereco"));
                           f.setNivelAscesso(rs.getString("nivelascesso"));
                           ListaFu.add(f);
                        }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro Sql!\n\n" + ex);
            }
            return ListaFu;
        }

}
    
    
