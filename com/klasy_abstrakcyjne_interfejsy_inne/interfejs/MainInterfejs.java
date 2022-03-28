package com.klasy_abstrakcyjne_interfejsy_inne.interfejs;

public class MainInterfejs {
    public static void main(String[]args){
        //ang. interface - wszystkie metody sa abstrakcyjne, nie mozna stowrzyc ciala
        Ryba ryba = new Ryba();
        Ptak ptak = new Ptak();
        Ssak ssak = new Ssak();
        System.out.println();

        System.out.println("rybka");

        ryba.oddychanie();
        ryba.odzywnianie();
        ryba.wydawaniePokolenia();
        System.out.println();

        System.out.println("ptak");


        ptak.oddychanie();
        ptak.odzywnianie();
        ptak.wydawaniePokolenia();
        System.out.println();

        System.out.println("ssak");
        ssak.oddychanie();
        ssak.odzywnianie();
        ssak.wydawaniePokolenia();



    }
}
