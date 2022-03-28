package com.przesylanie_metod_klasy;

public class MainThis {
    public static void main(String[] args){
//this nie jesty powiazany z dziedziczeniem,
        KlasaRozszerzonaThis obiekt1 = new KlasaRozszerzonaThis();
        System.out.println("oddzielenie");
        KlasaRozszerzonaThis obiekt2 = new KlasaRozszerzonaThis(111);
        System.out.println("oddzielenie2");
        KlasaRozszerzonaThis obiekt3  = new KlasaRozszerzonaThis(1,2);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

        obiekt3.metodaZParametrami(1234567);
        System.out.println("pole: " + obiekt3.pole);
    }

}
