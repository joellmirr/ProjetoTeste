package controller;




import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GerarTabelaDao {
    
    public void generatabela(String sql){
        DefaultTableModel ModeloTabela = new DefaultTableModel();
        // Conectar ao banco de dados e obter dados da tabela
        
        try {
            //JOptionPane.showMessageDialog(null,sql);
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                        
            // Obter informações sobre as colunas
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();

            // Adicionar colunas ao modelo
            for (int i = 1; i <= colCount; i++) {
                ModeloTabela.addColumn(metaData.getColumnName(i));
            }

            // Adicionar linhas ao modelo com dados do banco de dados
            while (rs.next()) {
                Object[] rowData = new Object[colCount];
                for (int i = 1; i <= colCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                ModeloTabela.addRow(rowData);
            }
        } 
        
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados");
        }
        
        

        JTable tabela = new JTable(ModeloTabela);
        JFrame frame = new JFrame("Consultar");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new JScrollPane(tabela));
        frame.pack();
        
        //Definir tamanho do frame
        frame.setSize(1000, 600);
        
        //Comando para centralizar o frame
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
        

    }
}
    

