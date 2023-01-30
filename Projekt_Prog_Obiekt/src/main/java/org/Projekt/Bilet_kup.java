package org.Projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bilet_kup extends Koncert {
    public static void zakupBilet() {
        int wyborArtysty, adres_nr_domu;
        String imie, nazwisko, adres_email, adres_miasto, adres_ulica;
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz artystę:");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT a.id, nazwa, bilet_cena FROM Artysci a INNER JOIN Koncerty k ON a.id=k.artysta_id");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("nazwa")+", cena: "+ rs.getInt("bilet_cena")+" zł.");
            }
            wyborArtysty = input.nextInt();
            rs = stmt.executeQuery("SELECT * FROM Koncerty WHERE artysta_id=" + wyborArtysty);
            if (rs.next()) {
                int biletDostepnosc = rs.getInt("bilet_dostepnosc");
                if (biletDostepnosc <= 0) {
                    System.out.println("Uwaga! Bilety na to wydarzenie zostały wyprzedane. " +
                            "Przepraszamy za niedogodnienia.");
                }
                stmt.executeUpdate("UPDATE Koncerty SET bilet_dostepnosc="+( biletDostepnosc - 1)+" WHERE artysta_id="+ wyborArtysty);
            } else {
                System.out.println("Wybrano niepoprawną opcję. Spróbuj ponownie.");
            }
            System.out.println("Podaj imie: ");
            imie = input.next();
            System.out.println("Podaj nazwisko: ");
            nazwisko = input.next();
            System.out.println("Podaj adres email: ");
            adres_email = input.next();
            System.out.println("Podaj adres domowy: \nMiasto: ");
            adres_miasto = input.next();
            System.out.println("Ulica: ");
            adres_ulica = input.next();
            System.out.println("Nr domu(mieszkania): ");
            adres_nr_domu = input.nextInt();
            System.out.println("Zakupiono bilet na poniższe dane: ");
            System.out.println("Imie: "+imie+", nazwisko: "+nazwisko+", adres email: "+adres_email+"adres domowy: "+adres_miasto+
                    ", ul. "+adres_ulica+", nr domu(mieszkania): "+adres_nr_domu);
            System.out.println("Bilet zostanie wysłany na podany adres.\nDziękujemy za skorzystanie z naszego serwisu!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Powrócono do menu.\n");
    }
}
