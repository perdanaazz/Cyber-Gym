package com.gym;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDatabase implements database {
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public void Coba()
    {
        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            JOptionPane.showMessageDialog(null, "Database Terhubung", "", JOptionPane.INFORMATION_MESSAGE);

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Tidak Terhubung", "", JOptionPane.ERROR_MESSAGE);
        }
    }
}
