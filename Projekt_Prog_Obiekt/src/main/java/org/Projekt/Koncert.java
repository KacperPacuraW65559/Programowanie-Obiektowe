package org.Projekt;

import java.sql.Connection;
import java.util.Scanner;

public class Koncert {
    protected static Connection conn = BD_polaczenie.getConnection();
    protected static Scanner input = new Scanner(System.in);
    public Koncert() {}
}
