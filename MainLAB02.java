import java.util.Locale;
import java.util.Scanner;


public class MainLAB02 {
    public static void main(String[] args) {
        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        Input6();
        //zadanie11();

    }

    //zadanie 1
    public static void zadanie1() {
        int n, a=0, b=10;
        double suma = 0, pkt, ile = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc studentow: ");
        n = input.nextInt();
        if (n > 0) {
            while(n>0){
                System.out.println("Podaj ilosc pkt: 0 -10");
                pkt = input.nextDouble();

                if(pkt>=0 && pkt<=b){
                 suma+=pkt;
                 ile++;
                 n--;
                }
            } //koniec while
            System.out.println("Ile: "+ile);
            System.out.println("Suma pkt: "+suma);
            System.out.println("Srednia: "+(suma/ile));
        } else {
            System.out.println("Ilosc studentow musi byc liczba >0");
        }
    }

    //zadanie 2
    public static double Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double n = input.nextDouble();
        return n;
    }
    public static void zadanie2() {
        int ile_d=0,ile_u=0;
        double sumaDod=0, sumaUj=0, liczb;

        for (int i = 0; i < 5; i++) {
            liczb=Input();
            if(liczb>=0){
                ile_d++; sumaDod+=liczb;
            }else{
                ile_u++; sumaUj+=liczb;
            }
        } //koniec for
        System.out.println("Ilosc liczb dodatnich: "+ile_d+", suma = "+sumaDod);
        System.out.println("Ilosc licz ujemnych: "+ile_u+", suma = "+sumaUj);
    }

    //zadanie 3
    public static double Input2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double n = input.nextDouble();
        return n;
    }
    public static void zadanie3() {
        int ile_parz=0;
        double sumaParz=0, liczb;

        for (int i = 0; i < 5; i++) {
            liczb=Input();
            if(liczb>0 && liczb % 2==0 ){
                ile_parz++; sumaParz+=liczb;
            }
        } //koniec for
        System.out.println("Ilosc liczb parzystych: "+ile_parz+", suma = "+sumaParz);
    }

    //zadanie 4
    public static void zadanie4(){
        int ile_liczb, min=-10, max=45;
        int suma_parz=0;
       System.out.println("Podaj liczbe losowanych liczb: ");
       Scanner input4 =  new Scanner(System.in);
       ile_liczb = input4.nextInt();
        for (int i = 0; i < ile_liczb; i++) {
           double liczb = (double)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(liczb);
            if(liczb % 2==0){
                suma_parz+=liczb;
            }
        }
       System.out.println("Ilosc parzsytch: "+suma_parz);
    }

    //zadanie 5
    public static Boolean zadanie5(String s) {
    int l=s.length()-1;
    s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(l)) return false;
            l--;
        }
        return true;
    }

    //zadanie 1 LAB 2
    public static double Input6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a, b i c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        return a;
    }
//    public static void zadanie11(){
//        System.out.println("Podaj a, b i c: ");
//        Scanner input = new Scanner(System.in);
//    }
}
