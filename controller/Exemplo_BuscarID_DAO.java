package EX;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BuscarId_DAO implements DAO2 {

    @Override
    public void inserir(Object o) {
        ClasseModel C = (ClasseModel) o;
        int ID_Exemplo = -1;
        String CPF = JOptionPane.showInputDialog("Informe o CPF");
        String sql2 = "SELECT ID_tabela FROM Tabela WHERE CPF= ?";
        
        try {
            PreparedStatement ps = Conn1.getConexao().prepareStatement(sql2);
            ps.setString(1, CPF);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                ID_Exemplo = rs.getInt("ID_tabela");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção: " + ex.getMessage());
        }
        
        String sql = "INSERT INTO Tabela (coluna1, Coluna2, ID_tabela);VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = Conn1.getConexao().prepareStatement(sql);
            ps.setInt(1, C.getcoluna1());
            ps.setInt(2, CO.getColuna2());
            ps.setInt(3, ID_Cliente);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção: " + ex.getMessage());
        }
    }

}