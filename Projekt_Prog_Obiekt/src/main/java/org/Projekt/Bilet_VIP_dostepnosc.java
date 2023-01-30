package org.Projekt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bilet_VIP_dostepnosc extends Koncert {

    public static void checkVIPAvailability() {
        System.out.println("Dostępność biletów VIP: ");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT a.nazwa, k.vip_dostepnosc FROM Artysci a INNER JOIN Koncerty k ON a.id=k.artysta_id");
            while (rs.next()) {
                if (rs.getBoolean("vip_dostepnosc")) {
                    System.out.println("- "+rs.getString("nazwa") + ": bilety VIP są dostępne. Oferta pojawi się wkrótce.");
                } else {
                    System.out.println("- "+rs.getString("nazwa") + ": bilety VIP nie są dostępne. Artysta nie przewiduje specjalnych ofert.");
                }
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Powrócono do menu.\n");
    }
}
