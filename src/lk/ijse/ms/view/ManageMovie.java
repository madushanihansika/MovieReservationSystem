/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ms.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.ms.controller.CatagoryController;
import lk.ijse.ms.controller.MovieDetailController;
import lk.ijse.ms.controller.ScheduleController;
import lk.ijse.ms.controller.ThereatController;
import lk.ijse.ms.dto.CatagoryDTO;
import lk.ijse.ms.dto.MovieDetailDTO;
import lk.ijse.ms.dto.ScheduleDTO;
import lk.ijse.ms.dto.ThereatDTO;
import lk.ijse.ms.observer.Observer;

/**
 *
 * @author USER
 */
public class ManageMovie extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form ManageMovie
     */
    public ManageMovie() {
        initComponents();
        loadComboThereat();
        loadComboCatagory();
        loadComboTime();

        loadTable();
        try {
            UnicastRemoteObject.exportObject(this, 0);
            MovieDetailController.getSubject().registerObserver(this);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtMovieName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        txtMovieId = new javax.swing.JTextField();
        cmbHallName = new javax.swing.JComboBox<>();
        btnSerchId = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddCatagory = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        cmbCatagory = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtRelDate = new org.freixas.jcalendar.JCalendarCombo();
        txtEndDate = new org.freixas.jcalendar.JCalendarCombo();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pnlLoadMovie = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setBackground(new java.awt.Color(102, 51, 255));
        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("New");
        lblTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblTime.setOpaque(true);
        lblTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTimeMouseClicked(evt);
            }
        });
        jPanel4.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 30));

        cmbTime.setBackground(new java.awt.Color(153, 153, 153));
        cmbTime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(cmbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 210, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Time :");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 110, 60));

        txtMovieName.setBackground(new java.awt.Color(102, 102, 102));
        txtMovieName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMovieName.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMovieName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Movie Id      :");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Movie Name :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Catagary     :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Relers Date :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("End Date     :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 30));

        txtLanguage.setBackground(new java.awt.Color(102, 102, 102));
        txtLanguage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtLanguage.setForeground(new java.awt.Color(255, 255, 255));
        txtLanguage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLanguage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(txtLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 30));

        txtMovieId.setBackground(new java.awt.Color(102, 102, 102));
        txtMovieId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMovieId.setForeground(new java.awt.Color(255, 255, 255));
        txtMovieId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMovieId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(txtMovieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 30));

        cmbHallName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbHallName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cmbHallName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHallNameActionPerformed(evt);
            }
        });
        jPanel4.add(cmbHallName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 290, 30));

        btnSerchId.setBackground(new java.awt.Color(102, 51, 255));
        btnSerchId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSerchId.setForeground(new java.awt.Color(255, 255, 255));
        btnSerchId.setText("Search");
        btnSerchId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSerchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerchIdActionPerformed(evt);
            }
        });
        jPanel4.add(btnSerchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, -1));

        lblAddCatagory.setBackground(new java.awt.Color(102, 51, 255));
        lblAddCatagory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddCatagory.setForeground(new java.awt.Color(255, 255, 255));
        lblAddCatagory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCatagory.setText("New");
        lblAddCatagory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblAddCatagory.setOpaque(true);
        lblAddCatagory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddCatagoryMouseClicked(evt);
            }
        });
        jPanel4.add(lblAddCatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 90, 30));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel12.setOpaque(true);
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 290, 60));

        btnAdd.setBackground(new java.awt.Color(0, 0, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 110, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("New Movie");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 0));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Hall Name :");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 50));

        cmbCatagory.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbCatagory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(cmbCatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Language    :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 30));

        txtRelDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(txtRelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 290, 30));

        txtEndDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel4.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 290, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 610));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMovie.setAutoCreateRowSorter(true);
        tblMovie.setBackground(new java.awt.Color(102, 0, 0));
        tblMovie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tblMovie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblMovie.setForeground(new java.awt.Color(255, 255, 255));
        tblMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Id", "Movie Name", "Language", "Start Date", "End Date", "Catagory Name", "Hall Name", "Show Time"
            }
        ));
        jScrollPane1.setViewportView(tblMovie);
        if (tblMovie.getColumnModel().getColumnCount() > 0) {
            tblMovie.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 230));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSearch.setText("Search");
        jPanel2.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 50));

        jTextField8.setBackground(new java.awt.Color(102, 102, 102));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, 30));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 130, 40));

        btnModify.setBackground(new java.awt.Color(102, 51, 255));
        btnModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Modify");
        btnModify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 130, 40));

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 100, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("View Movie Detail");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 30));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 10));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 680, 60));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 700, 430));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1070, 630));

        pnlLoadMovie.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoadMovie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pnlLoadMovie.setPreferredSize(new java.awt.Dimension(1080, 660));
        pnlLoadMovie.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Admin >>Manage Movie ");
        pnlLoadMovie.add(jLabel19);
        jLabel19.setBounds(910, 0, 155, 20);

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel18.setOpaque(true);
        pnlLoadMovie.add(jLabel18);
        jLabel18.setBounds(0, 0, 1090, 20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLoadMovie.add(jPanel5);
        jPanel5.setBounds(10, 30, 1070, 630);

        jPanel1.add(pnlLoadMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieNameActionPerformed

    private void cmbHallNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHallNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHallNameActionPerformed

    private void btnSerchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSerchIdActionPerformed

    private void lblAddCatagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCatagoryMouseClicked
        new CatagoryForm().setVisible(true);
    }//GEN-LAST:event_lblAddCatagoryMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {

            String movieId = txtMovieId.getText();
            String movieName = txtMovieName.getText();
            String language = txtLanguage.getText();
            //String image = lblImage.getText();
            String caragory = cmbCatagory.getSelectedItem().toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = txtRelDate.getDate();
            String startDate = sdf.format(date);
            Date date1 = txtEndDate.getDate();
            String endDate = sdf.format(date1);
            String hallName = cmbHallName.getSelectedItem().toString();
            String time = cmbTime.getSelectedItem().toString();

            MovieDetailDTO movieDetailDTO = new MovieDetailDTO();
            movieDetailDTO.setMovieId(movieId);
            movieDetailDTO.setMovieName(movieName);
            movieDetailDTO.setLanguage(language);
            movieDetailDTO.setStartDate(startDate);
            movieDetailDTO.setEndDate(endDate);

            CatagoryDTO catagoryDTO = CatagoryController.findById(caragory);

            ThereatDTO thereatDTO = ThereatController.findById(hallName);
            
            ScheduleDTO scheduleDTO = new ScheduleDTO();

            scheduleDTO = ScheduleController.findByTime(time);

            movieDetailDTO.setCatagoryDTO(catagoryDTO);
            movieDetailDTO.setThereatDTO(thereatDTO);
            movieDetailDTO.setScheduleDTO(scheduleDTO);

            boolean isAdded = MovieDetailController.addMovieDetail(movieDetailDTO);

            if (isAdded) {
                JOptionPane.showMessageDialog(this, "Added Successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Added Faild");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimeMouseClicked
        new Time().setVisible(true);

    }//GEN-LAST:event_lblTimeMouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSerchId;
    private javax.swing.JComboBox<String> cmbCatagory;
    private javax.swing.JComboBox<String> cmbHallName;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblAddCatagory;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlLoadMovie;
    private javax.swing.JTable tblMovie;
    private org.freixas.jcalendar.JCalendarCombo txtEndDate;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtMovieId;
    private javax.swing.JTextField txtMovieName;
    private org.freixas.jcalendar.JCalendarCombo txtRelDate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateObservers() throws Exception {
        loadComboThereat();
    }

    private void loadComboThereat() {
        try {
            List<ThereatDTO> allThereat = ThereatController.getAllThereat();
            cmbHallName.removeAllItems();
            if (allThereat != null) {
                for (ThereatDTO thereat : allThereat) {
                    cmbHallName.addItem(thereat.getThereatName());
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadComboCatagory() {
        try {
            List<CatagoryDTO> allCatagory = CatagoryController.getAllCatagory();
            cmbCatagory.removeAllItems();
            if (allCatagory != null) {
                for (CatagoryDTO catagory : allCatagory) {
                    cmbCatagory.addItem(catagory.getCataName());
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblMovie.getModel();
        dtm.setRowCount(0);

        try {
            List<MovieDetailDTO> movieDetailDTOs = MovieDetailController.getAllMovieDetail();

            if (movieDetailDTOs == null) {
                return;
            }

            for (MovieDetailDTO movieDetailDTO : movieDetailDTOs) {
                Object[] rowData = {
                    movieDetailDTO.getMovieId(),
                    movieDetailDTO.getMovieName(),
                    movieDetailDTO.getLanguage(),
                    movieDetailDTO.getStartDate(),
                    movieDetailDTO.getEndDate(),
                    movieDetailDTO.getCatagoryDTO().getCataName(),
                    movieDetailDTO.getThereatDTO().getThereatName(),
                    movieDetailDTO.getScheduleDTO().getScheduleTime()
                };
                dtm.addRow(rowData);
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMovie.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    private void loadComboTime() {
        try {
            List<ScheduleDTO> allSchedule = ScheduleController.getAllSchedule();
            cmbTime.removeAllItems();
            if (allSchedule != null) {
                for (ScheduleDTO schedule : allSchedule) {
                    cmbTime.addItem(schedule.getScheduleTime());
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
