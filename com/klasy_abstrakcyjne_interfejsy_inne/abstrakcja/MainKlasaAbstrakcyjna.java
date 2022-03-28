package com.klasy_abstrakcyjne_interfejsy_inne.abstrakcja;

public class MainKlasaAbstrakcyjna {
    public static void main(String[]args){
        // ang. abstract class - podobna dl klasy, sluza do reprezentowania czegos podstawowoeg co bedzie reprezonetowane w docelowych klasach
        // nie mozemy zainicjalizoowac obiektu PrzykladowaKlasaAbstrakcyjna obiekt = new PrzykladowaKlasaAbstrakcyjna();
        KlasaZwyklaAbstrakcyjna obiekt = new KlasaZwyklaAbstrakcyjna();
        obiekt.metodaAbstrakcyjna();
        obiekt.metodaZParametrem("hej");
        obiekt.jakasMetoda();

        //obiejty abstrakcja
        KlasaPies pies = new KlasaPies();
        KlasaKot kot = new KlasaKot();
        KlasaKon kon = new KlasaKon();

        System.out.println("pies");
        pies.wydajDziek();
        pies.przemieszczanieSie();
        pies.karmieneiPotomstwa();
        pies.podajIloscKonczyn();
        pies.TemperaturaCiala();
        System.out.println();

        System.out.println("kot");
        kot.wydajDziek();
        kot.przemieszczanieSie();
        kot.karmieneiPotomstwa();
        kot.podajIloscKonczyn();
        kot.TemperaturaCiala();
        System.out.println();

        System.out.println("kon");
        kon.wydajDziek();
        kon.przemieszczanieSie();
        kon.karmieneiPotomstwa();
        kon.podajIloscKonczyn();
        kon.TemperaturaCiala();


    }
}
