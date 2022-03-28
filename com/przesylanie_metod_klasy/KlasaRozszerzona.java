package com.przesylanie_metod_klasy;

public class KlasaRozszerzona extends KlasaPodstawowa{
    /* @Override //gwarantuje ze metoda zostanie nadpisana
    //metoda w klasie z klasy podstawowej ma sie zachowywac inaczej: kopia z klasy podstwowej
    void metoda(){
        System.out.println("wypisalem z klasy rozszerzonej");} */



//    slowo super
   /* void metodaInna(){
        pole = 10;//pochodzi z kalsy podstawoeej
        metoda();
        System.out.println("kolejny tekst czy operacje w klasie rozszerzonej");// wtedy mozna wywolac tez ta zwyklą metode
    }*/

    @Override// po wpisaniu meto...i enter
    void metoda() {
        super.metoda();//super oznacza ze podnosi sie do klasy nadrzednej
        System.out.println("kolejny tekst czy operacje w klasie rozszerzonej");
    }

}
