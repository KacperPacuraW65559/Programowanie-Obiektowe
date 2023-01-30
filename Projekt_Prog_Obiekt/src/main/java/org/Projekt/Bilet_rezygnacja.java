package org.Projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bilet_rezygnacja extends Koncert{
    public static void cancelPurchase() {
        System.out.println("Wybierz z biletu, którego artysty chcesz zrezygnować:");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Artysci");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nazwa"));
            }
            int artystaWybor = input.nextInt();
            rs = stmt.executeQuery("SELECT * FROM Koncerty WHERE artysta_id=" + artystaWybor);
            if (rs.next()) {
                int biletDostepnosc = rs.getInt("bilet_dostepnosc");
                if (biletDostepnosc >= 1000) {
                    System.out.println("Nie kupiono żadnego biletu.");
                    return;
                }
                stmt.executeUpdate("UPDATE Koncerty SET bilet_dostepnosc=" + (biletDostepnosc + 1) + " WHERE artysta_id=" + artystaWybor);
                System.out.println("Pomyślnie zrezygnowano z zakupionego biletu.");
            } else {
                System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
