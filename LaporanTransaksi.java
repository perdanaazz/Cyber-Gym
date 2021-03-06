/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER RYZEN 5
 */
public class LaporanTransaksi extends javax.swing.JPanel implements database{

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    /**
     * Creates new form LaporanTransaksi
     */
    public LaporanTransaksi() {
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

        bodyPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        Read = new javax.swing.JPanel();
        TablePekerja = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        bodyPanel.setMaximumSize(new java.awt.Dimension(717, 316));
        bodyPanel.setMinimumSize(new java.awt.Dimension(717, 316));

        mainPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        mainPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        mainPanel.setLayout(new java.awt.CardLayout());

        Read.setBackground(new java.awt.Color(204, 204, 204));
        Read.setMinimumSize(new java.awt.Dimension(540, 370));

        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames={"No", "NIK", "Jenis Transaksi", "Nominal", "Tanggal Pembelian", "Tanggal Selesai"};
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Transaksi ORDER BY idTransaksi ASC";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("idTransaksi"), rs.getString("NIK"), rs.getString("JenisTransaksi"), rs.getString("Nominal"), rs.getString("TanggalPembelian"), rs.getString("TanggalSelesai")});
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Pengambilan Data Gagal", "", JOptionPane.ERROR_MESSAGE);
        }
        jTable1.setPreferredSize(new java.awt.Dimension(452, 402));
        TablePekerja.setViewportView(jTable1);

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadLayout = new javax.swing.GroupLayout(Read);
        Read.setLayout(ReadLayout);
        ReadLayout.setHorizontalGroup(
            ReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePekerja, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ReadLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReadLayout.setVerticalGroup(
            ReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablePekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(45, 45, 45))
        );

        mainPanel.add(Read, "card7");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGap(648, 648, 648)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(bodyPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        Login admin = new Login();

        mainPanel.add(admin.getAdminPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    public JPanel getPanel()
    {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(Read);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        return mainPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Read;
    private javax.swing.JScrollPane TablePekerja;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
