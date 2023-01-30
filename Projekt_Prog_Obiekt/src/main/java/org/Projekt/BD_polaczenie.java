package org.Projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_polaczenie {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/Program_bilety_DB";
            String username = "root";
            String password = "1234";
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
