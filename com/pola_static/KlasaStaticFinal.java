package com.pola_static;
public class KlasaStaticFinal {
    public int pole;// dla niego trzeba utowrzyc obiekt.nazwa np. obiekt.pole
    public static int poleStatic; //zostanie utworzone raz, nie trzeba tworzyc obiektow
    public static void metodaStatyczna(){
        System.out.println("wypisalam z metody statycznej");
    }
    public final int poleFinal = 150; // pole nie bedzie moglo zostac zmienione, jest stale
    public static final String JAKIS_TEKST = "dowolny tekst"; //


}
