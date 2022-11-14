package Wsiz.LAB;

public class Gatunek {
    String nazwaRodzaju, nazwaGatunku, opis;
   int x;
    int PodstliczbaChromosomow = x;
    int liczbaChromosomow = 2*x;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, String opis, int x, int podstliczbaChromosomow, int liczbaChromosomow) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.opis = opis;
        this.x = x;
        this.PodstliczbaChromosomow = podstliczbaChromosomow;
        this.liczbaChromosomow = liczbaChromosomow;
    }

    public String setNazwaRodzaju(){
        return nazwaRodzaju;
    }
    public String setNazwaGatunku(){
        return nazwaGatunku;
    }
    public int setPodstLiczbaChromosomow(){
        return PodstliczbaChromosomow;
    }
    public int setliczbaChromosomow(){
        return liczbaChromosomow;
    }
    public String setOpis(){
        return opis;
    }

    public void wypisz(){
        System.out.println("Nazwa rodzaju: "+setNazwaRodzaju());
        System.out.println("Nazwa Gatunku: "+setNazwaGatunku());
        System.out.println("Haploidalna liczba chromosomow: "+(setliczbaChromosomow()/2));
        System.out.println("Liczba podstawowych chromosomow: "+setPodstLiczbaChromosomow());
        System.out.println("Liczba chromosomow: "+(setPodstLiczbaChromosomow()*2));
        System.out.println("Opis: "+setOpis());
    }
}
