import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class ZadaniaLAB02 {

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();

    }

    public static void zadanie1() {
        int a,b,c;
        double delta, x0, x1, x2;

        System.out.println("Podaj stale a,b i c: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        delta = (Math.pow(b,2))-4*a*c;
        System.out.println("Delta wynosi:  "+delta);
        if(delta > 0){
            x1= (-b+ Math.sqrt(delta))/2*a;
            x2= (-b- Math.sqrt(delta))/2*a;
            System.out.println("Rownanie posiada 2 rozwiazania: x1 = "+x1+" oraz x2 = "+x2);}
        else if(delta == 0){
            x0 = (-b)/2*a;
            System.out.println("Rownanie posiada 1 rozwiazanie: x0 = "+x0);
        }else{
            System.out.println("Rowananie nie posiada rozwiazan.");
        }
    }

    public static void zadanie2() {
        double a,b,c,x;
        System.out.println("Funkcja a(x): ");
        System.out.println("Podaj x: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if(x>0){
            System.out.println("x= "+x+", (x>0), wartosc funkcji a(x): "+(2*x));
        }else if(x==0){
            System.out.println("x= "+x+", (x=0), wartosc funkcji a(x): "+x);
        }else{
            System.out.println("x= "+x+", (x<0), wartosc funkcji a(x): "+((-3)*x));
        }

        System.out.println(" ");

        System.out.println("Funkcja b(x): ");
        if(x>=1){
            System.out.println("x= "+x+ " (x>=1), wartosc funkcji b(x): "+(Math.pow(x,2)));
        }else{
            System.out.println("x= "+x+ " (x<1), wartosc funkcji b(x): "+x);
        }

        System.out.println(" ");

        System.out.println("Funkcja c(x): ");
        if(x>2){
            System.out.println("x= "+x+" (x>2), wartosc funkcji c(x): "+(2+x));
        }else if(x==2){
            System.out.println("x= "+x+" (x=2), wartosc funkcji c(x): "+8);
        }else{
            System.out.println("x= "+x+" (x<2), wartosc funkcji c(x): "+(x-4));
        }
    }

    public static void zadanie3() {
        int x, y, z;
        System.out.println("Podaj liczby x, y i z: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        if (x > y && x > z && y > z) {
            System.out.println("Liczby od max do min: " + x + " " + y + " " + z);
        } else if (y > x && y > z && x > z) {
            System.out.println("Liczby od max do min: " + y + " " + x + " " + z);
        } else if (z > x && z > y && x > y) {
            System.out.println("Liczby od max do min: " + z + " " + x + " " + y);
        } else if (z > y && z > x && y > x) {
            System.out.println("Liczby od max do min: " + z + " " + y + " " + x);
        } else if (y > x && y > z && z > x) {
            System.out.println("Liczby od max do min: " + y + " " + z + " " + x);
        }
    }

    public static void zadanie4(){
        int deszcz, autobus;

        System.out.println("Wybierz opcje (1 - pada deszcz, 0 - nie pada deszcz");
        Scanner input = new Scanner(System.in);
        deszcz = input.nextInt();
        System.out.println("Wybierz kolejna opcje (1 - autobus jest na przystanku, 0 - autobusu nie ma)");
        autobus = input.nextInt();

        if(deszcz == 1 && autobus== 1){
            System.out.println("Wez parasol. Dostaniesz sie na uczelnie");
        }else if(deszcz == 1 && autobus != 1){
            System.out.println("Nie dostaniesz sie na uczelnie");
        }else if(deszcz != 1 && autobus == 1){
            System.out.println("Dostaniesz sie na uczelnie. Milego dnia i pieknej pogody.");
        }else{
            System.out.println("Nie dostaniesz sie na uczelnie.");
        }

        }

    public static void zadanie5() {
        int znizka, podwyzka;     //jest jakis bląd z tym "||"

        System.out.println("Wybierz opcje (1 - znizka jest, 0 - nie ma znizki)");
        Scanner input = new Scanner(System.in);
        znizka = input.nextInt();
        System.out.println("Wybierz kolejna opcje (1 - dostales podwyzke, 0 - nie dostales podwyzki)");
        podwyzka = input.nextInt();

        if(znizka != 1 && podwyzka == 1 ){
            System.out.println("Mozesz kupic samochod! Znizki na samochod nie ma.");
        }else if(znizka != 1 && podwyzka != 1){
            System.out.println("Zakup samochodu trzeba odlozyc na pozniej. Znizki na samochod nie ma.");
        }else if(znizka == 1 && podwyzka == 1){
            System.out.println("Mozesz kupic samochod!");
        } else if (znizka == 1 && podwyzka != 1) {
            System.out.println("Mozesz kupic samochod!");
        }
    }

    public static void zadanie6(){
        int wyborDzialania;
        double a,b,wynik;
        System.out.println("Podaj liczby a i b: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.print("Wybierz dzialanie ktore chcesz wykonac: ");
        System.out.println("(1 - '+', 2 - '-', 3 - '*', 4 - '/', 5 -'%')");
        wyborDzialania = input.nextInt();

        if(wyborDzialania == 1){
            System.out.println("A + B = "+(a+b));
        }else if(wyborDzialania == 2){
            System.out.println("A - B = "+(a-b));
        }else if(wyborDzialania == 3) {
            System.out.println("A * B = "+(a*b));
        }else if(wyborDzialania == 4){
            System.out.println("A / B = "+(a/b));
        }else if(wyborDzialania == 5){
            System.out.println("A % B = "+(a%b));
             }else{
            System.out.println("Wybierz liczbe z przedzialu 1-5 aby wykonac dzialania.");
        }
        }
}

