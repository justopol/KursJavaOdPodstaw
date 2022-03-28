package com.zadaniaklasy.zadanie1;

public class PrograistaZadaniaKlasy {
    public static void main(String[] args) {
        Programista programista = new Programista("Jan", "Kowalski","Java", 3000);
        System.out.println(programista.pobierzImie());
        System.out.println(programista.pobierzNazwisko());
        System.out.println(programista.pobierzJezyk());
        System.out.println(programista.pobierzZarobki());


    }
}