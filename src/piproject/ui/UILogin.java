/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piproject.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import piproject.mysql.MySQL;

/**
 * @author rafae
 */
public class UILogin extends javax.swing.JFrame {

    /**
     * Creates new form UILogin
     */
    public UILogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        userTextField = new javax.swing.JTextField();
        userPasswordField = new javax.swing.JPasswordField();
        startButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTextField.setText("Digite seu usuário aqui...");
        getContentPane().add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 221, -1));

        userPasswordField.setText("Senha...");
        getContentPane().add(userPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, -1));

        startButton.setText("Conectar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Usuário:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        registerButton.setText("Registre-se");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("print('Quiz!')");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piproject/api/fundo_login.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        if (userTextField.getText().length() >= 3 && userTextField.getText().length() <= 21) {
            if (userPasswordField.getText().length() >= 3 && userPasswordField.getText().length() <= 21) {
                try {
                    Connection con = MySQL.getConnection();
                    Statement stmt = con.createStatement();

                    String SQLUser = "SELECT * FROM `piproject`.`user_informations` WHERE userName='" + userTextField.getText() + "'";
                    ResultSet rs = stmt.executeQuery(SQLUser);

                    if (rs.next() == true) {
                        if (rs.getNString("userPassword") == null ? userPasswordField.getText() == null : rs.getNString("userPassword").equals(userPasswordField.getText())) {
                            if (rs.getNString("userStatus").equals("false")) {
                                String updateStatus = "UPDATE `piproject`.`user_informations` set `userStatus` = 'true' where `userName`= '" + userTextField.getText() + "'";
                                if (rs.getNString("userPermissions").equals("user")) {
                                    JOptionPane.showMessageDialog(null, "Conectando!!!");
                                    UIInicio frame = new UIInicio();
                                    frame.setVisible(true);
                                    this.setVisible(false);
                                    PreparedStatement pstmt = con.prepareStatement(updateStatus);
                                    pstmt.executeUpdate();

                                    con.close();
                                    stmt.close();
                                    rs.close();
                                    pstmt.close();
                                } else if(rs.getNString("userPermissions").equals("admin")) {
                                    JOptionPane.showMessageDialog(null, "Conectando!!!");
                                    UIInicioADM frame = new UIInicioADM();
                                    frame.setVisible(true);
                                    this.setVisible(false);
                                    PreparedStatement pstmt = con.prepareStatement(updateStatus);
                                    pstmt.executeUpdate();

                                    con.close();
                                    stmt.close();
                                    rs.close();
                                    pstmt.close();
                                }else {
                                    JOptionPane.showMessageDialog(null, "Impossível verificar sua permissão! Contatar um adminisitrador!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "O usuário já esta logado!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "A senha informada está incorreta!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário inexistente!");
                    }
                } catch (Exception e) {
                    System.err.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sua senha deve conter entre 3 até 21 caracteres");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seu usuário deve conter entre 3 até 21 caracteres");
        }

    }//GEN-LAST:event_startButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        UIRegister frame = new UIRegister();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UILogin().setVisible(true);
            }
        });
    }

    public static boolean connected;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton registerButton;
    public static javax.swing.JButton startButton;
    public javax.swing.JPasswordField userPasswordField;
    public static javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
