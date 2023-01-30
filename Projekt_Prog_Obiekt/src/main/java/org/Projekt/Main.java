package org.Projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Witamy w seriwsie kupowania biletów koncertowych. Wybierz jedną z poniższych opcji.");
            System.out.println("1. Zakup bilet");
            System.out.println("2. Zrezygnuj z zakupionego biletu.");
            System.out.println("3. Sprawdź harmonogram koncertów.");
            System.out.println("4. Sprawdź dostępność biletów.");
            System.out.println("5. Sprawdź dostępność biletów VIP.");
            System.out.println("6. Opuść program.");
            System.out.print("Wybierz opcję: ");

            wybor = input.nextInt();

            switch (wybor) {
                case 1:
                   Bilet_kup.zakupBilet();
                    break;
                case 2:
                   Bilet_rezygnacja.cancelPurchase();
                    break;
                case 3:
                    Koncert_Harmonogram.sprawdzHarmonogram();
                    break;
                case 4:
                    Bilet_dostepnosc.sprawdzDostepnosc();
                    break;
                case 5:
                   Bilet_VIP_dostepnosc.checkVIPAvailability();
                    break;
                case 6:
                    System.out.println("Opuszczono program.");
                    break;
                default:
                    System.out.println("Nieprawdłowy wybór. Prosimy o wybór opcji od 1 do 6.");
                    break;
            }
        } while (wybor != 6);
    }
}
