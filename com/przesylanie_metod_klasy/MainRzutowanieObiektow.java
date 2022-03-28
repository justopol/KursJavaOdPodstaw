package com.przesylanie_metod_klasy;

public class MainRzutowanieObiektow {
    public static void main(String[]args){
        KlasaRozszerzonaRzutowanie klasaRozszerzonaRzutowanie = new KlasaRozszerzonaRzutowanie();
        klasaRozszerzonaRzutowanie.ustawLiczba(999);
        klasaRozszerzonaRzutowanie.wyswietlLiczbe();
        // jezeli klasa dziedziczy po danej klasie mozna wykonac rzutowanie obiektu
                                                                // (nazwa klasy podstwowej) nazwa obiektu z rozszerzonej
        //KlasaPodstawowaRzutowanie klasaPodstawowaRzutowanie = (KlasaPodstawowaRzutowanie) klasaRozszerzonaRzutowanie
        //lub
        KlasaPodstawowaRzutowanie klasaPodstawowaRzutowanie = klasaRozszerzonaRzutowanie;

        klasaPodstawowaRzutowanie.wyswietlLiczbe();

        Object object = (Object) klasaRozszerzonaRzutowanie;
    }

}
