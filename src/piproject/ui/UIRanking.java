/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piproject.ui;

import piproject.mysql.MySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * @author rafae
 */
public class UIRanking extends javax.swing.JFrame {

    /**
     * Creates new form UIRanking
     */
    public UIRanking() {
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

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        top1 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        top5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ranking");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 3, 96)); // NOI18N
        jLabel1.setText("RANKING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 65, 400, -1));

        backButton.setBackground(new java.awt.Color(51, 153, 255));
        backButton.setFont(new java.awt.Font("Impact", 1, 40)); // NOI18N
        backButton.setText("Voltar");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 869, 317, 74));

        jLabel2.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        jLabel2.setText("1.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 257, -1, -1));

        top1.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        top1.setText("Erro ao carregar usuário...");
        getContentPane().add(top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 257, 570, -1));

        top2.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        top2.setText("Erro ao carregar usuário...");
        getContentPane().add(top2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 386, 570, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        jLabel3.setText("2.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 386, -1, -1));

        jLabel4.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        jLabel4.setText("3.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 501, -1, -1));

        top3.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        top3.setText("Erro ao carregar usuário...");
        getContentPane().add(top3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 501, 570, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        jLabel5.setText("4.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 616, -1, -1));

        top4.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        top4.setText("Erro ao carregar usuário...");
        getContentPane().add(top4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 616, 570, -1));

        jLabel6.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        jLabel6.setText("5.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 731, -1, -1));

        top5.setFont(new java.awt.Font("Impact", 1, 50)); // NOI18N
        top5.setText("Erro ao carregar usuário...");
        getContentPane().add(top5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 731, 570, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piproject/api/back.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        String SQLBack = "SELECT * FROM `piproject`.`user_informations` WHERE userName='" + UILogin.userTextField.getText() + "'";
        try (Connection con = MySQL.getConnection();) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQLBack);
            if (rs.next()) {
                if (rs.getNString("userPermission").equals("user")) {
                    UIInicio frameuser = new UIInicio();
                    frameuser.setVisible(true);
                    this.setVisible(false);
                } else if (rs.getNString("userPermission").equals("admin")) {
                    UIInicioADM frameadmin = new UIInicioADM();
                    frameadmin.setVisible(true);
                    this.setVisible(false);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        String[] test = new String[5];
        int contador = 0;
        try (Connection con = MySQL.getConnection();) {

            Statement stmt = con.createStatement();
            String SQLTOP1 = "SELECT userName,userPoints,userRank from `user_informations` where userPoints order by userPoints desc limit 5;";
            ResultSet rs = stmt.executeQuery(SQLTOP1);
            while (rs.next()) {
                test[contador++] = rs.getNString("userName") + " - " + rs.getInt("userPoints") + " pontos - " + rs.getNString("userRank");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        top1.setText(test[0]);
        top2.setText(test[1]);
        top3.setText(test[2]);
        top4.setText(test[3]);
        top5.setText(test[4]);
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
            java.util.logging.Logger.getLogger(UIRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIRanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel top1;
    public javax.swing.JLabel top2;
    public javax.swing.JLabel top3;
    public javax.swing.JLabel top4;
    public javax.swing.JLabel top5;
    // End of variables declaration//GEN-END:variables
}
