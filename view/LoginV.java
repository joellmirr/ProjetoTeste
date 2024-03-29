/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import controller.Conexao;
import controller.LoginDao;
import model.Login;
/**
 *
 * @author joelmir
 */
public class LoginV extends javax.swing.JFrame {
    
   LoginDao ldao = new LoginDao();
    /**
     * Creates new form Login
     */
    public LoginV() {
        initComponents();
        //Comando para centralizar janela
        // Obtém as dimensões da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcula a posição para centralizar a janela
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Define a posição da janela
        setLocation(x, y);
        
        //Exempo como alterar nome Jlabel em apos comando
            //jLabela.setText("");
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
        jdp_Usuario = new javax.swing.JDesktopPane();
        jLabel_login = new javax.swing.JLabel();
        jLabel_senha = new javax.swing.JLabel();
        jTextField_usuario_login = new javax.swing.JTextField();
        jPasswordField_senha = new javax.swing.JPasswordField();
        jButton_entrar_ = new javax.swing.JButton();
        jButton_sair_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Usuario");
        setLocation(new java.awt.Point(0, 0));

        jLabel_login.setText("Login");

        jLabel_senha.setText("Senha");

        jButton_entrar_.setText("Entrar");
        jButton_entrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_entrar_ActionPerformed(evt);
            }
        });

        jButton_sair_.setText("Sair");
        jButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sair_ActionPerformed(evt);
            }
        });

        jdp_Usuario.setLayer(jLabel_login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_Usuario.setLayer(jLabel_senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_Usuario.setLayer(jTextField_usuario_login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_Usuario.setLayer(jPasswordField_senha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_Usuario.setLayer(jButton_entrar_, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_Usuario.setLayer(jButton_sair_, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdp_UsuarioLayout = new javax.swing.GroupLayout(jdp_Usuario);
        jdp_Usuario.setLayout(jdp_UsuarioLayout);
        jdp_UsuarioLayout.setHorizontalGroup(
            jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdp_UsuarioLayout.createSequentialGroup()
                .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdp_UsuarioLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_login)
                            .addComponent(jLabel_senha))
                        .addGap(37, 37, 37)
                        .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_usuario_login)
                            .addComponent(jPasswordField_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addGroup(jdp_UsuarioLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_entrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jdp_UsuarioLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton_sair_)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jdp_UsuarioLayout.setVerticalGroup(
            jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdp_UsuarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_login)
                    .addComponent(jTextField_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jdp_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_senha)
                    .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton_entrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_sair_)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdp_Usuario)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jdp_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_entrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrar_ActionPerformed
        
       // Principal p = new Principal();
        //p.setVisible(true);
        
        Login lc = this.Montarlogin();
        ldao.VerifLogin(lc);
        dispose();
                 
    }//GEN-LAST:event_jButton_entrar_ActionPerformed

    private void jButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sair_ActionPerformed
                
        dispose();
    }


//GEN-LAST:event_jButton_sair_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginV().setVisible(true);
            }
        });
    }
    
     public Login Montarlogin(){
        Login lc = new Login();
        lc.setUsuario(jTextField_usuario_login.getText());
        lc.setSenha(jPasswordField_senha.getText());
        return lc;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_entrar_;
    private javax.swing.JButton jButton_sair_;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JTextField jTextField_usuario_login;
    private javax.swing.JDesktopPane jdp_Usuario;
    // End of variables declaration//GEN-END:variables
}
