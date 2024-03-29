/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Comprar;
import controller.ComprarDao;
import javax.swing.JOptionPane;

/**
 *
 * @author joelmir
 */
public class ConsultarCompra extends javax.swing.JInternalFrame {
    ComprarDao cdao = new ComprarDao();
    /**
     * Creates new form Consultar
     */
    public ConsultarCompra() {
        initComponents();
          //Comando para centralizar janela
        // Obtém as dimensões da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcula a posição para centralizar a janela
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Define a posição da janela
        setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_datacompra = new javax.swing.JLabel();
        jTextField_nomecliente_ = new javax.swing.JTextField();
        jButton_buscar_ = new javax.swing.JButton();
        jButton_sair_ = new javax.swing.JButton();
        jButton_limpar_ = new javax.swing.JButton();
        jButton_buscaCompleta_ = new javax.swing.JButton();
        jButton_atualizar_ = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jPanel_tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_comprar = new javax.swing.JTable();
        jTextField_setarCodigo = new javax.swing.JTextField();
        jTextField_setarProduto = new javax.swing.JTextField();
        jTextField_setarQuantidade = new javax.swing.JTextField();
        jTextField_setarValor = new javax.swing.JTextField();
        jTextField_setarNomeCli = new javax.swing.JTextField();
        jTextField_setarFuncionario = new javax.swing.JTextField();
        jTextField_setarData = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Compra");

        jLabel_titulo.setText("Consultar Compra:");

        jLabel_datacompra.setText("Nome Cliente:");

        jButton_buscar_.setText("Buscar");
        jButton_buscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_ActionPerformed(evt);
            }
        });

        jButton_sair_.setText("Sair");
        jButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sair_ActionPerformed(evt);
            }
        });

        jButton_limpar_.setText("Limpar");
        jButton_limpar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpar_ActionPerformed(evt);
            }
        });

        jButton_buscaCompleta_.setText("Busca Completa");
        jButton_buscaCompleta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscaCompleta_ActionPerformed(evt);
            }
        });

        jButton_atualizar_.setText("Ataulizar");
        jButton_atualizar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atualizar_ActionPerformed(evt);
            }
        });

        jButton_excluir.setText("Excluir");
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_datacompra)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField_nomecliente_, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton_buscar_, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_atualizar_)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_limpar_))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_sair_)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_buscaCompleta_, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_datacompra)
                                    .addComponent(jTextField_nomecliente_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_buscar_, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_atualizar_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_limpar_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton_buscaCompleta_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTable_comprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produto", "Quantidade", "Valor", "Nome Cliente", "Funcionario", "Data"
            }
        ));
        jTable_comprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_comprarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_comprar);

        jTextField_setarCodigo.setToolTipText("");
        jTextField_setarCodigo.setEnabled(false);

        jTextField_setarProduto.setToolTipText("");

        javax.swing.GroupLayout jPanel_tabelaLayout = new javax.swing.GroupLayout(jPanel_tabela);
        jPanel_tabela.setLayout(jPanel_tabelaLayout);
        jPanel_tabelaLayout.setHorizontalGroup(
            jPanel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
            .addGroup(jPanel_tabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_setarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_setarData)
                .addContainerGap())
        );
        jPanel_tabelaLayout.setVerticalGroup(
            jPanel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tabelaLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel_tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_setarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_setarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_ActionPerformed
        // TODO add your handling code here:
        this.Buscar();
    }//GEN-LAST:event_jButton_buscar_ActionPerformed

    private void jButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sair_ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButton_sair_ActionPerformed

    private void jButton_limpar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpar_ActionPerformed
        // TODO add your handling code here:
        this.Limpar();
    }//GEN-LAST:event_jButton_limpar_ActionPerformed

    private void jButton_buscaCompleta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscaCompleta_ActionPerformed
        // TODO add your handling code here:
     this.ProcurarTudo();
    }//GEN-LAST:event_jButton_buscaCompleta_ActionPerformed

    private void jButton_atualizar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atualizar_ActionPerformed
        // TODO add your handling code here:
        this.Alterar();
    }//GEN-LAST:event_jButton_atualizar_ActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        // TODO add your handling code here:
        this.Excluir();
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jTable_comprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_comprarMouseClicked
        this.SetarLinha();
    }//GEN-LAST:event_jTable_comprarMouseClicked
    
    public void Limpar(){
        jTextField_nomecliente_.setText("");
        
        jTextField_setarCodigo.setText("");
        jTextField_setarProduto.setText("");
        jTextField_setarQuantidade.setText("");
        jTextField_setarValor.setText("");
        jTextField_setarNomeCli.setText("");
        jTextField_setarFuncionario.setText("");
        jTextField_setarData.setText("");
    }
    
    public void Buscar(){
        Comprar c = new Comprar();
        ArrayList<Comprar> listaCo = new ArrayList<>();
         //criar um modelo de tabela
        DefaultTableModel taCompra = (DefaultTableModel) jTable_comprar.getModel();
        taCompra.setNumRows(0);
        
        listaCo = cdao.Buscar(jTextField_nomecliente_.getText());
        
        Object colunas[] = new Object[7];
        for(int i=0;i<listaCo.size();i++){
            c = listaCo.get(i);
            colunas[0] = c.getCodigo();
            colunas[1] = c.getProduto();
            colunas[2] = c.getQuantidade();
            colunas[3] = c.getValor();
            colunas[4] = c.getNomeCliente();
            colunas[5] = c.getFuncionario();
            colunas[6] = c.getDatacompra();
            
            taCompra.addRow(colunas);
        }
    }
    
    public void ProcurarTudo(){
        Comprar c = new Comprar();
        ArrayList<Comprar> listaCo = new ArrayList<>();
         //criar um modelo de tabela
        DefaultTableModel taCompra = (DefaultTableModel) jTable_comprar.getModel();
        taCompra.setNumRows(0);
        
        listaCo = cdao.ProcurarTudo();
        
        Object colunas[] = new Object[7];
        for(int i=0;i<listaCo.size();i++){
            c = listaCo.get(i);
            colunas[0] = c.getCodigo();
            colunas[1] = c.getProduto();
            colunas[2] = c.getQuantidade();
            colunas[3] = c.getValor();
            colunas[4] = c.getNomeCliente();
            colunas[5] = c.getFuncionario();
            colunas[6] = c.getDatacompra();
            
            taCompra.addRow(colunas);
        }
    }
    
    public void SetarLinha(){
        
        int setar = jTable_comprar.getSelectedRow();
        jTextField_setarCodigo.setText(jTable_comprar.getModel().getValueAt(setar,0).toString());
        jTextField_setarProduto.setText(jTable_comprar.getModel().getValueAt(setar,1).toString());
        jTextField_setarQuantidade.setText(jTable_comprar.getModel().getValueAt(setar,2).toString());
        jTextField_setarValor.setText(jTable_comprar.getModel().getValueAt(setar,3).toString());
        jTextField_setarNomeCli.setText(jTable_comprar.getModel().getValueAt(setar,4).toString());
        jTextField_setarFuncionario.setText(jTable_comprar.getModel().getValueAt(setar,5).toString());
        jTextField_setarData.setText(jTable_comprar.getModel().getValueAt(setar,6).toString());
        
    }

    public void Alterar(){
        
        Comprar c = new Comprar();
            c.setProduto(jTextField_setarProduto.getText());
            c.setQuantidade(Integer.parseInt(jTextField_setarQuantidade.getText()));
            c.setValor(Float.parseFloat(jTextField_setarValor.getText()));
            c.setFuncionario(jTextField_setarFuncionario.getText());
            c.setNomeCliente(jTextField_setarNomeCli.getText());
            c.setCodigo(jTextField_setarCodigo.getText());
        
        cdao.atualizar(c);
        
        int i = jTable_comprar.getSelectedRow();
        DefaultTableModel taCompra = (DefaultTableModel) jTable_comprar.getModel();
        if(i >= 0){
            
            taCompra.setValueAt(jTextField_setarCodigo.getText(), i, 0);
            taCompra.setValueAt(jTextField_setarProduto.getText(), i, 1);
            taCompra.setValueAt(jTextField_setarQuantidade.getText(), i, 2);
            taCompra.setValueAt(jTextField_setarValor.getText(), i, 3);
            taCompra.setValueAt(jTextField_setarNomeCli.getText(), i, 4);
            taCompra.setValueAt(jTextField_setarFuncionario.getText(), i, 5);
            
            JOptionPane.showMessageDialog(null,"Realizado Atualização!");
           
            this.Limpar();
        
        }else{
            JOptionPane.showMessageDialog(null,"Erro Atualização");
        }
    }
    
    public void Excluir(){
        
        int i = jTable_comprar.getSelectedRow();
           
        int c = Integer.parseInt(jTextField_setarCodigo.getText());
            
        cdao.excluir(c);
            
        if(i >= 0){
           
            DefaultTableModel taProduto = (DefaultTableModel) jTable_comprar.getModel();
            taProduto.removeRow(i);

            JOptionPane.showMessageDialog(null,"Item Excluido!");

            this.Limpar();

        }else{
            JOptionPane.showMessageDialog(null,"Erro ao Excluir!\nSelesione Item!");
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_atualizar_;
    private javax.swing.JButton jButton_buscaCompleta_;
    private javax.swing.JButton jButton_buscar_;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_limpar_;
    private javax.swing.JButton jButton_sair_;
    private javax.swing.JLabel jLabel_datacompra;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_comprar;
    private javax.swing.JTextField jTextField_nomecliente_;
    private javax.swing.JTextField jTextField_setarCodigo;
    private javax.swing.JTextField jTextField_setarData;
    private javax.swing.JTextField jTextField_setarFuncionario;
    private javax.swing.JTextField jTextField_setarNomeCli;
    private javax.swing.JTextField jTextField_setarProduto;
    private javax.swing.JTextField jTextField_setarQuantidade;
    private javax.swing.JTextField jTextField_setarValor;
    // End of variables declaration//GEN-END:variables
}
