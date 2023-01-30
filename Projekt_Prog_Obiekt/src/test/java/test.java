import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {
    private final String url = "jdbc:mysql://localhost:3306/program_bilety_db";
    private final String username = "root";
    private final String password = "1234";

    @Test
    public void testBilet_kup() throws Exception {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT bilet_dostepnosc  FROM Koncerty where bilet_dostepnosc+"+1);
            resultSet.next();
            int liczba = resultSet.getInt(1)-1;
            assertEquals(187, liczba);
        }
    }

    @Test
    public void testBiletRezygnacja() throws Exception{
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT bilet_dostepnosc  FROM Koncerty where bilet_dostepnosc+"+1);
            resultSet.next();
            int liczba = resultSet.getInt(1)+1;
            assertEquals(189, liczba);
        }
    }

    @Test
    public void testKoncertHarmonogram() throws Exception {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT a.nazwa, k.date FROM Artysci a INNER JOIN Koncerty k ON a.id=k.artysta_id");
            resultSet.next();
            String count = resultSet.getString("nazwa");
            String date = resultSet.getString("date");
            assertEquals("Metallica", count);
            assertEquals("2023-09-30", date);
        }
    }


    @Test
    public void testDostepnoscBiletow() throws Exception {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT bilet_dostepnosc FROM koncerty where bilet_dostepnosc+" + 1);
            resultSet.next();
            int przewidywanaLiczbaBiletow = resultSet.getInt(1);
            assertEquals(188, przewidywanaLiczbaBiletow);
        }
    }

    @Test
    public void testVIPDostepnosc() throws Exception {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nazwa, vip_dostepnosc FROM Koncerty INNER JOIN Artysci ON Koncerty.artysta_id = Artysci.id WHERE Artysci.nazwa = 'Opeth'");
            resultSet.next();
            boolean vipAvailability = resultSet.getBoolean("vip_dostepnosc");
            assertEquals(true, vipAvailability);
        }
    }
}