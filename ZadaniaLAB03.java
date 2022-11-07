import java.util.Scanner;
import java.lang.Math;

public class ZadaniaLAB03 {

        public static void main(String[] args) {
            Zadanie1();
            Zadanie2();
            Zadanie3();
            Zadanie4();
            Zadanie5();
            Zadanie6();
            Zadanie7();
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
        String slowaOdTylu[];
        slowaOdTylu = new String[5];
            System.out.println("Podaj 5 słów: ");
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < slowaOdTylu.length; i++) {
                slowaOdTylu[i] = input.nextLine();
            }
            System.out.println("Tablica normalna:");
            for(int j=0; j<slowaOdTylu.length;j++) {
                System.out.print(slowaOdTylu[j]+" ");
            }
            System.out.println(" ");
            System.out.println("Tablica gdzie litery są przestawione: ");
            for(int p = 0; p < slowaOdTylu.length ;p++){
                String reverse = slowaOdTylu[p];
                reverse = new StringBuilder(reverse).reverse().toString();
                slowaOdTylu[p] = reverse;
                System.out.print(slowaOdTylu[p]+" ");
            }
        }

    public static void insertionSort(int sortTab[]) {
        int n = sortTab.length;
        for (int j = 1; j < n; j++) {
            int key = sortTab[j];
            int i = j-1;
            while ( (i > -1) && ( sortTab [i] > key ) ) {
                sortTab [i+1] = sortTab [i];
                i--;
            }
            sortTab[i+1] = key;
        }
    }
    public static void Zadanie5(){
            int sortTab[];
            sortTab = new int[8];
            System.out.println("Podaj 8 liczb do posortowania: ");
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < sortTab.length; i++) {
                sortTab[i] = input.nextInt();
            }
            System.out.println("Tablica nieposortowana: ");
            for(int j=0; j< sortTab.length;j++) {
                System.out.print(sortTab[j]+" ");
            }
        System.out.println(" ");
        System.out.println("Posortowana tablica: ");
        insertionSort(sortTab);
        for (int i : sortTab) {
            System.out.print(i+" ");
            }
        }

    public static void Zadanie6() {
            int[] silnia;
            silnia = new int[5];
            Scanner input = new Scanner(System.in);
        System.out.println("Podaj 5 liczb: ");
            for(int i =0;i<silnia.length;i++){
                silnia[i] = input.nextInt();
                }

        System.out.println("Tablica: ");
            for(int j =0; j< silnia.length;j++){
            System.out.print(silnia[j]+" ");
            }
        System.out.println(" ");

        System.out.println("Tablica po obliczeniu silni: ");
            for (int n=0;n<5;n++){
               int silnia1 = 1;
               for(int m=1;m<=n+1;m++){
                   silnia1 = silnia1*m;
               }
               silnia[n] = silnia1;
            }
        for (int k=0;k<silnia.length;k++){
            System.out.print(silnia[k]+" ");
        }
    }

    public static void Zadanie7(){
            String[] porownanieA = new String[3];
            String[] porownanieB = new String[3];

            porownanieA = new String[]{"ala", "ma", "kota"};
            porownanieB = new String[]{"ala", "ma", "kota"};
        System.out.println("Tablica A:");
            for (int i=0;i<porownanieA.length;i++){
                System.out.print(porownanieA[i]+" ");
            }
        System.out.println(" ");
        System.out.println("Tablica B: ");
        for (int j=0;j<porownanieB.length;j++){
            System.out.print(porownanieB[j]+" ");
        }
        System.out.println(" ");
            if(porownanieA[0] == porownanieB[0] && porownanieA[1] == porownanieB[1] && porownanieA[2] == porownanieB[2]){
                System.out.println("Tablice są takie same.");
            }else System.out.println("Tablice są inne.");

    }
    }

