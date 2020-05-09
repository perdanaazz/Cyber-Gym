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

/**
 *
 * @author ACER RYZEN 5
 */
public class Login extends javax.swing.JFrame implements database{

    private String user, password;

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    Member logon = new Member();
    
    /**
     * Creates new form MainFrame
     */
    public Login() {
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
        menuPanel = new javax.swing.JPanel();
        menuPanel1 = new javax.swing.JPanel();
        menuLogin = new javax.swing.JButton();
        menuDaftar = new javax.swing.JButton();
        menuKeluar = new javax.swing.JButton();
        Credits = new javax.swing.JButton();
        menuTitle = new javax.swing.JLabel();
        menuPanel2 = new javax.swing.JPanel();
        menuLogout = new javax.swing.JButton();
        menuKeluar2 = new javax.swing.JButton();
        Credits2 = new javax.swing.JButton();
        menuTitle2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        BgImage = new javax.swing.JLabel();
        keluar = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        Ask = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        LabelEmail = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        cek = new javax.swing.JCheckBox();
        loginadminPanel = new javax.swing.JPanel();
        AdminTitle = new javax.swing.JLabel();
        AdminText = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        KelolaMemberButton = new javax.swing.JButton();
        KelolaPeralatanButton = new javax.swing.JButton();
        KelolaKeuanganButton = new javax.swing.JButton();
        KelolaPekerjaButton = new javax.swing.JButton();
        loginmemberPanel = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnPaket = new javax.swing.JButton();
        LoginMmeberTitle = new javax.swing.JLabel();
        btnPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setLayout(new java.awt.CardLayout());

        menuPanel1.setBackground(new java.awt.Color(204, 204, 204));

        menuLogin.setText("LOGIN");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });

        menuDaftar.setText("DAFTAR");
        menuDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarActionPerformed(evt);
            }
        });

        menuKeluar.setText("KELUAR");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });

        Credits.setText("CREDITS");
        Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditsActionPerformed(evt);
            }
        });

        menuTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("CYBER GYM");
        menuTitle.setToolTipText("CYBER GYM");

        javax.swing.GroupLayout menuPanel1Layout = new javax.swing.GroupLayout(menuPanel1);
        menuPanel1.setLayout(menuPanel1Layout);
        menuPanel1Layout.setHorizontalGroup(
            menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Credits, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(menuDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(menuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        menuPanel1Layout.setVerticalGroup(
            menuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuLogin)
                .addGap(21, 21, 21)
                .addComponent(menuDaftar)
                .addGap(18, 18, 18)
                .addComponent(menuKeluar)
                .addGap(18, 18, 18)
                .addComponent(Credits)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        menuPanel.add(menuPanel1, "card2");

        menuPanel2.setBackground(new java.awt.Color(204, 204, 204));

        menuLogout.setText("LOGOUT");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });

        menuKeluar2.setText("KELUAR");
        menuKeluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluar2ActionPerformed(evt);
            }
        });

        Credits2.setText("CREDITS");
        Credits2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Credits2ActionPerformed(evt);
            }
        });

        menuTitle2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        menuTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle2.setText("CYBER GYM");
        menuTitle2.setToolTipText("CYBER GYM");

        javax.swing.GroupLayout menuPanel2Layout = new javax.swing.GroupLayout(menuPanel2);
        menuPanel2.setLayout(menuPanel2Layout);
        menuPanel2Layout.setHorizontalGroup(
            menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Credits2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(menuLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuKeluar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        menuPanel2Layout.setVerticalGroup(
            menuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(menuTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuLogout)
                .addGap(36, 36, 36)
                .addComponent(menuKeluar2)
                .addGap(30, 30, 30)
                .addComponent(Credits2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menuPanel.add(menuPanel2, "card3");

        mainPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        mainPanel.setLayout(new java.awt.CardLayout());

        BgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/CYBERGYM-Logo-2.png"))); // NOI18N
        mainPanel.add(BgImage, "card2");

        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        Ask.setText("APAKAH ANDA YAKIN INGIN KELUAR?");

        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keluarLayout = new javax.swing.GroupLayout(keluar);
        keluar.setLayout(keluarLayout);
        keluarLayout.setHorizontalGroup(
            keluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keluarLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel29)
                .addGroup(keluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(keluarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Keluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Kembali))
                    .addGroup(keluarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Ask)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        keluarLayout.setVerticalGroup(
            keluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keluarLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(keluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addGroup(keluarLayout.createSequentialGroup()
                        .addComponent(Ask)
                        .addGap(18, 18, 18)
                        .addGroup(keluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Keluar)
                            .addComponent(Kembali))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        mainPanel.add(keluar, "card10");

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));

        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LabelEmail.setText("Email");

        LabelPassword.setText("Password");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        cek.setText("Tampilkan kata sandi");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEmail)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(LabelPassword)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(cek))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(111, 111, 111))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(cek)
                .addGap(31, 31, 31)
                .addComponent(LoginButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        mainPanel.add(loginPanel, "card3");

        loginadminPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginadminPanel.setMinimumSize(new java.awt.Dimension(540, 370));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        AdminText.setViewportView(jTextArea1);

        KelolaMemberButton.setText("LIHAT DATA MEMBER");
        KelolaMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelolaMemberButtonActionPerformed(evt);
            }
        });

        KelolaPeralatanButton.setText("KELOLA PERALATAN");
        KelolaPeralatanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelolaPeralatanButtonActionPerformed(evt);
            }
        });

        KelolaKeuanganButton.setText("LIHAT LAPORAN TRANSAKSI");
        KelolaKeuanganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelolaKeuanganButtonActionPerformed(evt);
            }
        });

        KelolaPekerjaButton.setText("KELOLA PEKERJA");
        KelolaPekerjaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelolaPekerjaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginadminPanelLayout = new javax.swing.GroupLayout(loginadminPanel);
        loginadminPanel.setLayout(loginadminPanelLayout);
        loginadminPanelLayout.setHorizontalGroup(
            loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginadminPanelLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(AdminTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginadminPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AdminText)
                    .addGroup(loginadminPanelLayout.createSequentialGroup()
                        .addGroup(loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KelolaMemberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(KelolaPekerjaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KelolaPeralatanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(KelolaKeuanganButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(77, 77, 77))
        );
        loginadminPanelLayout.setVerticalGroup(
            loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginadminPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(AdminTitle)
                .addGap(27, 27, 27)
                .addComponent(AdminText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KelolaPeralatanButton)
                    .addComponent(KelolaPekerjaButton))
                .addGap(18, 18, 18)
                .addGroup(loginadminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KelolaKeuanganButton)
                    .addComponent(KelolaMemberButton))
                .addContainerGap())
        );

        mainPanel.add(loginadminPanel, "card7");

        btnInfo.setText("INFORMASI AKUN");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnPaket.setText("LANGGANAN PAKET");
        btnPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketActionPerformed(evt);
            }
        });

        LoginMmeberTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LoginMmeberTitle.setText("MENU PILIHAN MEMBER");

        btnPassword.setText("UBAH PASSWORD");
        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginmemberPanelLayout = new javax.swing.GroupLayout(loginmemberPanel);
        loginmemberPanel.setLayout(loginmemberPanelLayout);
        loginmemberPanelLayout.setHorizontalGroup(
            loginmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginmemberPanelLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(LoginMmeberTitle)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(loginmemberPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(loginmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPaket, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginmemberPanelLayout.setVerticalGroup(
            loginmemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginmemberPanelLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(LoginMmeberTitle)
                .addGap(27, 27, 27)
                .addComponent(btnInfo)
                .addGap(18, 18, 18)
                .addComponent(btnPaket)
                .addGap(18, 18, 18)
                .addComponent(btnPassword)
                .addGap(85, 85, 85))
        );

        mainPanel.add(loginmemberPanel, "card5");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(bodyPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(BgImage);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_KembaliActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
        mainPanel1();
        email.setText("");
        pass.setText("");
        user = "";
        password = "";
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuKeluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKeluar2ActionPerformed

    private void Credits2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Credits2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Credits2ActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(loginPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        Daftar reg = new Daftar();

        mainPanel.add(reg.getMainPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuDaftarActionPerformed

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(keluar);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuKeluarActionPerformed

    private void CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditsActionPerformed
        // TODO add your handling code here:
        Credits ok = new Credits();
        ok.setVisible(true);
    }//GEN-LAST:event_CreditsActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:

        user = email.getText();
        password = pass.getText();

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM Member WHERE Email='"+user+"' AND Password='"+password+"'";
            rs = stmt.executeQuery(sql);

            if (user.contains("admin") && password.contains("admin")){
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                mainPanel.add(loginadminPanel);
                mainPanel.repaint();
                mainPanel.revalidate();
                
                mainPanel2();
            }
            else if(rs.next()){
                if (user.contains (rs.getString("Email")) && password.contains (rs.getString("Password"))) {
                    mainPanel.removeAll();
                    mainPanel.repaint();
                    mainPanel.revalidate();
                  
                    logon.setLoginInfo(user, password);

                    mainPanel.add(loginmemberPanel);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    
                    mainPanel2();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Email atau Password yang anda masukkan salah!", "", JOptionPane.ERROR_MESSAGE);
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        // TODO add your handling code here:
        if(cek.isSelected()){
            pass.setEchoChar((char)0);
        }
        else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_cekActionPerformed

    private void KelolaMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelolaMemberButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        DaftarMember Member = new DaftarMember();

        mainPanel.add(Member.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_KelolaMemberButtonActionPerformed

    private void KelolaPeralatanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelolaPeralatanButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        KelolaAlat alat = new KelolaAlat();

        mainPanel.add(alat.getKelolaAlat());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_KelolaPeralatanButtonActionPerformed

    private void KelolaKeuanganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelolaKeuanganButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        LaporanTransaksi Member = new LaporanTransaksi();

        mainPanel.add(Member.getPanel());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_KelolaKeuanganButtonActionPerformed

    private void KelolaPekerjaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelolaPekerjaButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        KelolaPekerja pekerja = new KelolaPekerja();

        mainPanel.add(pekerja.getKelolaPekerja());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_KelolaPekerjaButtonActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(logon.getInfoAkun());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(logon.getPaketMember());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnPaketActionPerformed

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(logon.getEditPassword());
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnPasswordActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public void mainPanel1()
    {
        menuPanel.removeAll();
        menuPanel.repaint();
        menuPanel.revalidate();

        menuPanel.add(menuPanel1);
        menuPanel.repaint();
        menuPanel.revalidate();
        
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(BgImage);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    public void mainPanel2()
    {
        menuPanel.removeAll();
        menuPanel.repaint();
        menuPanel.revalidate();

        menuPanel.add(menuPanel2);
        menuPanel.repaint();
        menuPanel.revalidate();
    }
    
    public JPanel getLoginPanel()
    {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(loginPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        return mainPanel;
    }
    
    public JPanel getMemberPanel()
    {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(loginmemberPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        return mainPanel;
    }
    
    public JPanel getAdminPanel()
    {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(loginadminPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        return mainPanel;
    }
    
    public void setLoginInfo(String getUser, String getPassword)
    {
        user = getUser;
        password = getPassword;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AdminText;
    private javax.swing.JLabel AdminTitle;
    private javax.swing.JLabel Ask;
    private javax.swing.JLabel BgImage;
    private javax.swing.JButton Credits;
    private javax.swing.JButton Credits2;
    private javax.swing.JButton KelolaKeuanganButton;
    private javax.swing.JButton KelolaMemberButton;
    private javax.swing.JButton KelolaPekerjaButton;
    private javax.swing.JButton KelolaPeralatanButton;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginMmeberTitle;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnPaket;
    private javax.swing.JButton btnPassword;
    private javax.swing.JCheckBox cek;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel keluar;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginadminPanel;
    private javax.swing.JPanel loginmemberPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton menuDaftar;
    private javax.swing.JButton menuKeluar;
    private javax.swing.JButton menuKeluar2;
    private javax.swing.JButton menuLogin;
    private javax.swing.JButton menuLogout;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menuPanel1;
    private javax.swing.JPanel menuPanel2;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel menuTitle2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
