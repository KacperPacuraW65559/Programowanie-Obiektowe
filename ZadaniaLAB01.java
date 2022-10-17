import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class ZadaniaLAB01 {
    public static void main(String[] args) {
       //zadanie 1
        System.out.println(getMyName());
        System.out.println(getMyAge()+'\n');

        //zadanie 2
        int l1, l2;
        System.out.println("Podaj dwie liczby: ");
        Scanner input = new Scanner(System.in);
        l1 = input.nextInt();
        l2 = input.nextInt();
        Obliczenia(l1, l2);

        //zadanie 3
        int a;
        System.out.println("Podaj liczbe: ");
        Scanner input2 = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Podana liczba: "+a+" jest parzysta: "+Sprawdzenie(a));

        //zadanie 4
        int b;
        System.out.println("Podaj liczbe: ");
        Scanner input3 = new Scanner(System.in);
        b = input.nextInt();
        System.out.println("Podana liczba: "+b+" jest podzielne przez 3 i 5: "+Sprawdzenie2(b)+'\n');

        //zadanie 5
        double c=2.0;
        double d=3.0;
        System.out.println("Liczba "+c+" do potegi "+d+" = "+Math.pow(c,d)+'\n');

        //zadanie 6
        double e=16;
        System.out.println("Pierwiastek kwadratowy z liczby "+e+" = "+Math.sqrt(e)+'\n');

        //zadanie 7
        int a11, b11;
        System.out.println("Podaj liczbe a i b: ");
        Scanner input4 =  new Scanner(System.in);
        a11 = input.nextInt();
        b11 = input.nextInt();
        double b1 = (double)Math.floor(Math.random()*(b11-a11+1)+a11);
        double b2 = (double)Math.floor(Math.random()*(b11-a11+1)+a11);
        double b3 = (double)Math.floor(Math.random()*(b11-a11+1)+a11);
        System.out.println("Z bokow: "+b1+", "+b2+", "+b3+", da sie zbudowac trojkat: "+Trojkat(b1,b2,b3));

    }
    public static String getMyName(){
    System.out.print("Imie: ");
        return "Kacper";
}
    public static int getMyAge(){
    System.out.print("Wiek: ");
        return 20;
}

    public static void Obliczenia(int l1, int l2){
        System.out.println("L1+L2 = "+(l1+l2));
        System.out.println("L1-L2 = "+(l1-l2));
        System.out.println("L1*L2 = "+(l1*l2));
    }
    public static Boolean Sprawdzenie(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
}
    public static Boolean Sprawdzenie2(int b){
        if(b % 3 == 0 && b % 5 ==0){
            return true;
        }else{
            return false;
        }
    }
    public static Boolean Trojkat(double b1, double b2, double b3){
        if(Math.pow(b1,2)+Math.pow(b2,2)==Math.pow(b3,2) || Math.pow(b2,2)+Math.pow(b3,2)==Math.pow(b1,2) || Math.pow(b1,2)+Math.pow(b3,2)==Math.pow(b2,2)){
            return true;
        }else{return false;}
    }
}
