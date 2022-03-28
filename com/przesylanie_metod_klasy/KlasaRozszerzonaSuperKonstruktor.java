package com.przesylanie_metod_klasy;

public class KlasaRozszerzonaSuperKonstruktor extends KlasaPodstawowaSuperKonstruktor{
    KlasaRozszerzonaSuperKonstruktor(){
        super(5);//wywolanie konstruktora klasy nadrzednej - wywolany bez argumentow
        System.out.println("wywolalalm konsturktor z klasa rozszerzona");
    }
}
