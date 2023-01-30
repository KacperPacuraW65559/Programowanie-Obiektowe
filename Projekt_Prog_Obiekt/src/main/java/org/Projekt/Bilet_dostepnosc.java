package org.Projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bilet_dostepnosc extends Koncert{
    public static void sprawdzDostepnosc() {
        System.out.println("Dostępność biletów: ");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT a.nazwa, k.bilet_dostepnosc, k.bilet_cena FROM Artysci a INNER JOIN Koncerty k ON a.id=k.artysta_id");
            while (rs.next()) {
                System.out.println(rs.getString("nazwa") + ": " + rs.getInt("bilet_dostepnosc") + " biletów jest dostępnych");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Powrócono do menu\n");
    }
}
