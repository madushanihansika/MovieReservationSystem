/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.view;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.ms.controller.ThereatController;
import lk.ijse.ms.dto.ThereatDTO;
import lk.ijse.ms.observer.Observer;

/**
 *
 * @author USER
 */
public class Thereat extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form Thereat
     */
    public Thereat() {
        initComponents();
        loadThereatTable();
        setLocationRelativeTo(null);
        
        try {
            UnicastRemoteObject.exportObject(this, 0);
            ThereatController.getSubject().registerObserver(this);
        } catch (Exception ex) {
            Logger.getLogger(Thereat.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThereat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSeatCount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtHollId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHallName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblThereat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thereat Id", "Thereat Name", "Seat Count"
            }
        ));
        jScrollPane1.setViewportView(tblThereat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 390, 190));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Hall");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 100, 30));

        jLabel14.setBackground(new java.awt.Color(204, 0, 0));
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 410, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 410, 390));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Seat Count    :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 40));

        txtSeatCount.setBackground(new java.awt.Color(102, 102, 102));
        txtSeatCount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSeatCount.setForeground(new java.awt.Color(255, 255, 255));
        txtSeatCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSeatCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSeatCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatCountActionPerformed(evt);
            }
        });
        jPanel1.add(txtSeatCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 35));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("New Hall");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 30));

        jLabel13.setBackground(new java.awt.Color(204, 0, 0));
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 30));

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Thereat Id      :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 40));

        txtHollId.setBackground(new java.awt.Color(102, 102, 102));
        txtHollId.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtHollId.setForeground(new java.awt.Color(255, 255, 255));
        txtHollId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHollId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtHollId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Thereat Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 40));

        txtHallName.setBackground(new java.awt.Color(102, 102, 102));
        txtHallName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtHallName.setForeground(new java.awt.Color(255, 255, 255));
        txtHallName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHallName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtHallName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHallNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtHallName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 210, 35));

        btnSave.setBackground(new java.awt.Color(0, 0, 204));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 100, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 370));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 390));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin >>Manage Movie >> New Catagory");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 270, 20));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHallNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHallNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHallNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String thereatId = txtHollId.getText();
        String thereatName = txtHallName.getText();
        String seatCount = txtSeatCount.getText();

        ThereatDTO thereat=new ThereatDTO();
        thereat.setThereatId(thereatId);
        thereat.setThereatName(thereatName);
        thereat.setSeatCount(seatCount);
        System.out.println("ghjkl");

        try {
            if (ThereatController.addThereat(thereat)) {
                JOptionPane.showMessageDialog(this, "Added SuccessFully");
            }else{
                JOptionPane.showMessageDialog(this, "Added Not SuccessFully");
            }
        } catch (Exception ex) {
            Logger.getLogger(Thereat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSeatCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatCountActionPerformed

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
            java.util.logging.Logger.getLogger(Thereat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thereat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thereat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thereat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thereat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblThereat;
    private javax.swing.JTextField txtHallName;
    private javax.swing.JTextField txtHollId;
    private javax.swing.JTextField txtSeatCount;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateObservers() throws Exception {
        loadThereatTable();
    }

    private void loadThereatTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblThereat.getModel();
        dtm.setRowCount(0);

        try {
            List<ThereatDTO> thereatDTOs = ThereatController.getAllThereat();

            if (thereatDTOs == null) {
                return;
            }

            for (ThereatDTO thereat : thereatDTOs) {
                Object[] rowData = {
                    thereat.getThereatId(),
                    thereat.getThereatName(),
                    thereat.getSeatCount()
                };
                dtm.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(Thereat.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}