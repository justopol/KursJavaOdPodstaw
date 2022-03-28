package com.klasy_abstrakcyjne_interfejsy_inne.zadania_abstrakcja_interfejs;

public class MainZadania {
    public static void main(String[]args){
        GwiazdaSmierci gwiadzaSmierci = new GwiazdaSmierci();
        gwiadzaSmierci.atakujLaserem();
        System.out.println();

        Kolo kolo = new Kolo(5);
        System.out.println(kolo.obwod());
        System.out.println(kolo.pole());
        System.out.println();
        Prostokat prostokat = new Prostokat(4,5);
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());

        Info infoAnonimowe = new Info(){
            @Override
            public void wyswietlInfo() {
                System.out.println("informacja wypisana z klsy anonimowej");
            }
        };
        infoAnonimowe.wyswietlInfo();
    }

    interface Info{
        void wyswietlInfo();
    }

}
