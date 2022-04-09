package com.zadania_rekrutacja.kolko_krzyzyk;

public class MainKoloKrzyzyk {
    public static void main(String[]args){
        Gra gra = new Gra();
        gra.wybierzPole(1,1);
        gra.wyswietlPlansze();
        gra.zmienTure();
        gra.wybierzPole(1,1);
        gra.wyswietlPlansze();


    }
}
