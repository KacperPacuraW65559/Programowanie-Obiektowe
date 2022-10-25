import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.lang.Iterable;


public class MainLAB03 {

    public static void main(String[] args) {
    //Definicja();
    //Definicja2();
    //Zadanie1();
    //Zadanie2();
        //Zadanie3();
        Zadanie4();
    }

    public static void Definicja() {
        double[] data; // definicja: typ nawiasy nazwa
        data = new double[10]; //alokacja

        double[] data1 = new double[10];  //definicja + alokacja

        String slowa[];
        slowa = new String[]{"ala", "ma", "kota"};

        int[] intLiczby = {1, 2, 3, 4, 12, 32, 32, 23};

        int[] Liczby = new int[4];
        Liczby[0] = 23;
        Liczby[1] = 12;
        Liczby[2] = Liczby[0] + Liczby[1];

        System.out.println("element 1: " + intLiczby[0]); //wyswietlanie tablicy int

        System.out.println(slowa[0] + " " + slowa[1] + " " + slowa[2]); //wyswietlanie tablicy string

        int[] intLiczby1 = new int[5];
        double[] doubleLiczby1 = {3.13, 2.123, 3.123};
        System.out.println("dlugosc tablicy int: " + intLiczby1.length);
        System.out.println("dlugosc tablicy double: " + doubleLiczby1.length);

        String tekst = "Witaj";
        String[] slowa1 = {"ala", "ma", "kota"};
        System.out.println("Liczba znakow w zmiennej tekst: " + tekst.length());
        System.out.println("Liczba elementow w tablicy: " + slowa.length);
        System.out.println("Liczba znakow w slowie z tablicy: " + slowa[0].length()); //elementy tablicy length, znaki tablicy length();

        int[] Liczby2 = {1, 2, 3};
        for (int i = 0; i < Liczby2.length; i++) {
            System.out.println(Liczby2[i]);
        }

        System.out.println("foreach: ");

        for (int i : Liczby2) {
            System.out.println(i);     //for i foreach stosujemy zaleznie od sytuacji ale mozna tez uzywac for bez zmiany
        }
    }

        public static void Definicja2(){
        int [][] matrixA = new int[3][3];
        int [][] array2d = new int[3][2];
        int [][][]matrixB = new int [3][2][2];

        int [][] macierzA = {
                {1,2,3},
                {3,4,5,6,6},
                {7},
        };

            for (int i = 0; i < macierzA.length; i++) {
                for (int j = 0; j < macierzA[i].length; j++) {
                    System.out.print(macierzA[i][j]+"\t");
                }
                System.out.println();
            }

        }

        public static void Zadanie1(){
        double [] Tab1 = new double[2];

        for(int i=0;i<Tab1.length;i++){
            Tab1[i] = Math.random();
        }
            System.out.println("Element 1: "+Tab1[0]+" Element 2: "+Tab1[1]);
        for(int i=0;i<1;i++){
            System.out.println("Suma: "+(Tab1[0]+Tab1[1]));
            System.out.println("Srednia: "+(Tab1[0]+Tab1[1])/Tab1.length);
        }

            System.out.println("foreach: ");
            for (double i : Tab1) {
                System.out.println("Suma: "+(Tab1[0]+Tab1[1]));
                System.out.println("Srednia: "+(Tab1[0]+Tab1[1])/2);
            }

        }

        public static void Zadanie2() {
        int [] Tab2 = {2,3,6,1};
        int [] Tab3 = {1,7,4,8,2};

        System.out.println("Tab2 elementy: ");
        for (int i=0;i<Tab2.length;i++){
            System.out.print(Tab2[i]+"\t");
        }

        System.out.println();

        System.out.println("Tab3 elementy: ");
        for (int i=0;i<Tab3.length;i++){
            System.out.print(Tab3[i]+"\t");
        }
        System.out.println();
        System.out.println("Tab2 (co drugi element: )");
        for(int i=0;i<Tab2.length;i=i+2){
            System.out.print(Tab2[i]+" ");
        }
        System.out.println();
        System.out.println("Tab3 (co drugi element: )");
        for(int i=0;i<Tab3.length;i=i+2){
            System.out.print(Tab3[i]+" ");
        }


    }

        public static void Zadanie3() {
        String litery[];
        litery = new String[]{"male litery"};
            System.out.println("Tablica String: ");
        for(int i=0;i<litery.length;i++){
            System.out.println(litery[i]);
        }
            System.out.println("Tablica String ze zmenionymi wielkosciami liter: ");
            for (String i:litery) {
                System.out.println(i.toUpperCase());
            }

    }

        public static void Zadanie4(){

        

        }



    }

