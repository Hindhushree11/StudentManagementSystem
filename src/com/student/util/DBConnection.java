package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/studentdb";

    private static final String USER = "root";
    private static final String PASSWORD = "Rakshitha@123";

    public static Connection getConnection() {

        Connection con = null;

        try {
            // Load Driver (optional in new versions but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);

            if (con != null) {
                System.out.println("Database Connected Successfully");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver Not Found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

        return con;
    }
}

