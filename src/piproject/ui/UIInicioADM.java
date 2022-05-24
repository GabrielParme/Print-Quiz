/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piproject.ui;

import piproject.mysql.MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author rafae
 */
public class UIInicioADM extends javax.swing.JFrame {

    /**
     * Creates new form InicioUI
     */
    public UIInicioADM() {
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

        inicioLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        userOnTitle = new javax.swing.JLabel();
        usersTitle = new javax.swing.JLabel();
        mediaTitle = new javax.swing.JLabel();
        usersOnInfo = new javax.swing.JLabel();
        usersInfo = new javax.swing.JLabel();
        mediaInfo = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        inicioLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        inicioLabel.setText("ÍNICIO - ADM");

        searchButton.setBackground(new java.awt.Color(51, 153, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setText("Consultar usuários");

        rankingButton.setBackground(new java.awt.Color(51, 153, 255));
        rankingButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rankingButton.setText("Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        disconnectButton.setBackground(new java.awt.Color(255, 0, 51));
        disconnectButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        disconnectButton.setText("Desconectar");
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });

        userOnTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userOnTitle.setText("Usuários online:");

        usersTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usersTitle.setText("Usuários registrados:");

        mediaTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mediaTitle.setText("Média de acertos:");

        usersOnInfo.setText("Falha no carregamento...");

        usersInfo.setText("Falha no carregamento...");

        mediaInfo.setText("Falha no carregamento...");

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piproject/api/fundo_login.png"))); // NOI18N
        fundo.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mediaTitle)
                            .addComponent(userOnTitle)
                            .addComponent(usersTitle)
                            .addComponent(usersOnInfo)
                            .addComponent(usersInfo)
                            .addComponent(mediaInfo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disconnectButton)
                            .addComponent(inicioLabel))))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(inicioLabel)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userOnTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usersOnInfo))
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(usersTitle)
                        .addGap(18, 18, 18)
                        .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usersInfo)
                        .addGap(18, 18, 18)
                        .addComponent(mediaTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediaInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(disconnectButton)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        inicioLabel.setText("ADM - " + nome);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectButtonActionPerformed
        // TODO add your handling code here:
        try (Connection con = MySQL.getConnection();){
            String updateStatus = "UPDATE `piproject`.`user_informations` set `userStatus` = 'false' where `userName`= '" + nome + "'";
            PreparedStatement pstmt = con.prepareStatement(updateStatus);
            UILogin frame = new UILogin();
            pstmt.executeUpdate();
            frame.setVisible(true);
            this.setVisible(false);
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_disconnectButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
        UIRanking frame = new UIRanking();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rankingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UIInicioADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIInicioADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIInicioADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIInicioADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIInicioADM().setVisible(true);
            }
        });
    }

    private String nome = UILogin.userTextField.getText();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton disconnectButton;
    private javax.swing.JLabel fundo;
    public javax.swing.JLabel inicioLabel;
    private javax.swing.JLabel mediaInfo;
    private javax.swing.JLabel mediaTitle;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel userOnTitle;
    private javax.swing.JLabel usersInfo;
    private javax.swing.JLabel usersOnInfo;
    private javax.swing.JLabel usersTitle;
    // End of variables declaration//GEN-END:variables
}