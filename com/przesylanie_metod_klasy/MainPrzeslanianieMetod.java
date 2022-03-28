package com.przesylanie_metod_klasy;

public class MainPrzeslanianieMetod {
    public static void main(String[] args){
        //ang. override - nadpisywanie: @Override

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();
    }
}
