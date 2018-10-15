/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblRestart = new javax.swing.JLabel();
        lblNameShutdown = new javax.swing.JLabel();
        lblShutdown = new javax.swing.JLabel();
        lblPower = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblCreateNewAccount = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        lblNameRestart = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblPasswordIcan = new javax.swing.JLabel();
        lblUserIcan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBorder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Movie Reservation ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 260, 60));

        lblRestart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/App-Quick-restart-icon.png"))); // NOI18N
        lblRestart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRestartMouseClicked(evt);
            }
        });
        jPanel2.add(lblRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 120, 50));

        lblNameShutdown.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNameShutdown.setText("Shutdown");
        jPanel2.add(lblNameShutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 70, 30));

        lblShutdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/shutdown.png"))); // NOI18N
        lblShutdown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblShutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShutdownMouseClicked(evt);
            }
        });
        jPanel2.add(lblShutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 140, 50));

        lblPower.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "power", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.add(lblPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 290, 90));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, 40));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 350, 60));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/LogoMovie.jpg"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblLogo.setOpaque(true);
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 160));

        lblCreateNewAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCreateNewAccount.setText("Create New User Account ?");
        jPanel2.add(lblCreateNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, 30));

        pswPassword.setBackground(new java.awt.Color(102, 102, 102));
        pswPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pswPassword.setForeground(new java.awt.Color(255, 255, 255));
        pswPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(pswPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 230, 40));

        txtUser.setBackground(new java.awt.Color(102, 102, 102));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 40));

        lblNameRestart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNameRestart.setText("Restart");
        jPanel2.add(lblNameRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, 30));

        btnLogin.setBackground(new java.awt.Color(153, 153, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 150, 50));

        lblPasswordIcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/password.png"))); // NOI18N
        jPanel2.add(lblPasswordIcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 60));

        lblUserIcan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/User.png"))); // NOI18N
        jPanel2.add(lblUserIcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 60));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 350, 60));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 350, 60));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 410, 420));

        lblBorder.setBackground(new java.awt.Color(255, 255, 255));
        lblBorder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 102, 102), new java.awt.Color(153, 255, 153)));
        lblBorder.setOpaque(true);
        jPanel2.add(lblBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 550));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 470, 590));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/buy-tickets-animation.gif"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 350, 150));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ms/image/Rainbow Colors_795.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 860, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestartMouseClicked
        int res=JOptionPane.showConfirmDialog(this,"Are you sure yu want to Restart?",null,JOptionPane.YES_NO_OPTION);
        if(res == 0){
            Runtime runtime=Runtime.getRuntime();
            try {
                Process process=runtime.exec("shutdown -r -t 120");
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        /*
        int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to Restart?", null, JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            Runtime runtime = Runtime.getRuntime();

            try {
                Process proc = runtime.exec("shutdown -r -t 120");
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Are you Sure");

            }
        }
        */
    }//GEN-LAST:event_lblRestartMouseClicked

    private void lblShutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShutdownMouseClicked
        int res=JOptionPane.showConfirmDialog(this,"Are you sure you want to shutdown?",null,JOptionPane.YES_NO_OPTION);
        if(res==0){
            Runtime runtime=Runtime.getRuntime();
            try {
                Process process=runtime.exec("shutdown -s -t 1");
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_lblShutdownMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String userName = txtUser.getText();
        String password = pswPassword.getText();

        if(userName.equals("Hansi") && password.equals("123456")){
            AdminDash adminDashbord=new AdminDash();
            adminDashbord.setVisible(true);
            this.dispose();
        }else if(userName.equals("Madu") && password.equals("789")) {
            ClientDash dashbord= new ClientDash();
            dashbord.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBorder;
    private javax.swing.JLabel lblCreateNewAccount;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNameRestart;
    private javax.swing.JLabel lblNameShutdown;
    private javax.swing.JLabel lblPasswordIcan;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblRestart;
    private javax.swing.JLabel lblShutdown;
    private javax.swing.JLabel lblUserIcan;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}