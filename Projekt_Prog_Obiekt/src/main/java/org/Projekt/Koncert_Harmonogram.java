package org.Projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Koncert_Harmonogram extends Koncert{
    public static void sprawdzHarmonogram() {
        System.out.println("Harmonogram koncertów(data podana w systemie: Rok-Miesiąc-Dzień): ");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT a.nazwa, k.date FROM Artysci a INNER JOIN Koncerty k ON a.id=k.artysta_id");
            while (rs.next()) {
                System.out.println("- "+rs.getString("nazwa") + " - " + rs.getDate("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Powrócono do menu.\n");
    }
}
