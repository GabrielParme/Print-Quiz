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
public class UIInicio extends javax.swing.JFrame {

    /**
     * Creates new form InicioUI
     */
    public UIInicio() {
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
        jLabel2 = new javax.swing.JLabel();
        quizButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        disconnectButton = new javax.swing.JButton();
        rankTitle = new javax.swing.JLabel();
        pointsTitle = new javax.swing.JLabel();
        averageTitle = new javax.swing.JLabel();
        rankingTitle = new javax.swing.JLabel();
        rankInfo = new javax.swing.JLabel();
        pointsInfo = new javax.swing.JLabel();
        averageInfo = new javax.swing.JLabel();
        rankingInfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicioLabel.setFont(new java.awt.Font("Impact", 3, 96)); // NOI18N
        inicioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioLabel.setText("ÍNICIO");
        inicioLabel.setAlignmentY(0.0F);
        getContentPane().add(inicioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 65, 1910, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel2.setText("Informações:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 312, -1, -1));

        quizButton.setBackground(new java.awt.Color(51, 153, 255));
        quizButton.setFont(new java.awt.Font("Impact", 1, 75)); // NOI18N
        quizButton.setText("Iniciar QUIZ!");
        quizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quizButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 292, 553, 203));

        rankingButton.setBackground(new java.awt.Color(51, 153, 255));
        rankingButton.setFont(new java.awt.Font("Impact", 1, 60)); // NOI18N
        rankingButton.setText("Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rankingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 615, 423, 107));

        disconnectButton.setBackground(new java.awt.Color(255, 0, 51));
        disconnectButton.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        disconnectButton.setText("Desconectar");
        disconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(disconnectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 851, 283, 63));

        rankTitle.setFont(new java.awt.Font("Impact", 1, 40)); // NOI18N
        rankTitle.setText("Rank:");
        getContentPane().add(rankTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 426, -1, -1));

        pointsTitle.setFont(new java.awt.Font("Impact", 1, 40)); // NOI18N
        pointsTitle.setText("Pontuação:");
        getContentPane().add(pointsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 568, -1, -1));

        averageTitle.setFont(new java.awt.Font("Impact", 1, 40)); // NOI18N
        averageTitle.setText("Porcentagem de acertos:");
        getContentPane().add(averageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 717, -1, -1));

        rankingTitle.setFont(new java.awt.Font("Impact", 1, 40)); // NOI18N
        rankingTitle.setText("Classificação:");
        getContentPane().add(rankingTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 870, -1, -1));

        rankInfo.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        rankInfo.setText("Falha no carregamento...");
        getContentPane().add(rankInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, -1, -1));

        pointsInfo.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        pointsInfo.setText("Falha no carregamento...");
        getContentPane().add(pointsInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 648, -1, -1));

        averageInfo.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        averageInfo.setText("Falha no carregamento...");
        getContentPane().add(averageInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 800, -1, -1));

        rankingInfo.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        rankingInfo.setText("Falha no carregamento...");
        getContentPane().add(rankingInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 950, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piproject/api/back.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
        UIRanking frame = new UIRanking();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        inicioLabel.setText("INICIO - " + nome);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void disconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectButtonActionPerformed
        // TODO add your handling code here:
        try (Connection con = MySQL.getConnection();) {
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

    private void quizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quizButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIInicio().setVisible(true);
            }
        });
    }

    private String nome = UILogin.userTextField.getText();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageInfo;
    private javax.swing.JLabel averageTitle;
    private javax.swing.JButton disconnectButton;
    public javax.swing.JLabel inicioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pointsInfo;
    private javax.swing.JLabel pointsTitle;
    private javax.swing.JButton quizButton;
    private javax.swing.JLabel rankInfo;
    private javax.swing.JLabel rankTitle;
    private javax.swing.JButton rankingButton;
    private javax.swing.JLabel rankingInfo;
    private javax.swing.JLabel rankingTitle;
    // End of variables declaration//GEN-END:variables
}
