package com.dziedziczenie;

public class MainDziedziczenie {
    public static void main(String[] args) {
        //ang. inheritance, extends oznacza dziedziczenie, dziedziczenie jest tylko po jednej klasie

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();

        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();
        klasaBardziejRozszerzona.metodaRozszerzona();
    }
}
