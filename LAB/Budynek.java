package Wsiz.LAB;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int lpPieter, rokBudowy;
    LocalDate wiekBudynku;


    public Budynek(String nazwa, int lpPieter, LocalDate wiekBudynku, int rokBudowy) {
        this.nazwa = nazwa;
        this.lpPieter = lpPieter;
        this.wiekBudynku = wiekBudynku;
        this.rokBudowy = rokBudowy;
    }
    public String setNazwa(){
        return nazwa;
    }

    public int Pietra(){
        return lpPieter;
    }

    public int getRokBudowy(){
        return rokBudowy;
    }

    public long getIleLat(){
        LocalDate today = LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(wiekBudynku,today);
        return ileLat;
    }

    public void Wypisz(){
        System.out.println("Nazwa budynku: "+setNazwa());
        System.out.println("Liczba pieter: "+Pietra());
        System.out.println("Rok budowy: "+getRokBudowy());
        System.out.println("Wiek bydynku: "+getIleLat()+" lat.");
    }


}
