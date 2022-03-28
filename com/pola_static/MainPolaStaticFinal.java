package com.pola_static;

public class MainPolaStaticFinal {
    public static void main(String[] args){
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;
        //static pole i metoda
        KlasaStaticFinal.poleStatic = 15;
        obiekt.poleStatic = 123;
        System.out.println("KlasaStaticFinal.poleStatic" + KlasaStaticFinal.poleStatic);

        KlasaStaticFinal.metodaStatyczna();
        // final
        System.out.println("pole final " + obiekt.poleFinal);
        //static final
        String jakisTekst = KlasaStaticFinal.JAKIS_TEKST;
        System.out.println("static final" + KlasaStaticFinal.JAKIS_TEKST);
        //liczba pi jest stala
        double pi = Math.PI;

    }
}
