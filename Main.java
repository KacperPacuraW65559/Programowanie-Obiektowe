import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.print("hello"); // "System.out.print" nie robi endline
//        System.out.print("hello1");
//
//        int a,b;
//        float c=2.0F;
//        double d =3.434343;
//        boolean pytanie = true;
//
        //wpisywanie i wypisywanie danych
//        String imie="Jan", miasto="Rzeszów";
//        int wiek=24;
//
//        System.out.println("Imie: "+imie+", miasto: "+miasto+", wiek: "+wiek);


        /*String imie, miasto;
        int wiek;

        //wczytywanie danych z klawiatury, trzeba dodac "import java.util.Scanner;"
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wiek: " );
        wiek = input.nextInt();
        System.out.println("Podaj imie: ");
        imie = input.next();
        System.out.println("imie next: "+imie);
        imie = input.next();
        System.out.println("imie next pattern: "+imie);
        imie = input.nextLine();
        System.out.println("imie next line: "+imie);*/

        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,2);

        Scanner in = new Scanner(System.in); // tak samo jak oblicznia, tylko sami dajemy liczby
        int a,b;
        System.out.println("Podaj a i b: ");
        a=in.nextInt();
        b=in.nextInt();
        obliczenia(a,b);

        System.out.println(Math.pow(2.0, 3.0));
        Random rand = new Random;
    }

        //metody
        public static String getMyName(){
            return "Jan";
        }
        public static int getMyAge(){
            return 23;
        }

        public static void obliczenia(int l1, int l2){
            System.out.println(l1+" + "+l2+" = "+(l1+l2));
            System.out.println(l1+" - "+l2+" = "+(l1-l2));
            System.out.println(l1+" * "+l2+" = "+(l1*l2));
        }

    }

