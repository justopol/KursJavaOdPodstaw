package com.wyjatki;

public class MainWyjatkiObsluga {
    static String str;
    static int[] tablica;
    public static void main(String[]args){
        //ang. exception - nieoczekiwane zdarzenie podczas wykonywaniaprogrmu, ktore moze zaburzyc wykonywanie instrukcjy - blad

      //  str.isEmpty(); kopiujemy kod do try>
//        blok try dla wyjatkow nie obslugiwanych
        try{
            System.out.println("czy pusty " + str.isEmpty());
        }
        catch(NullPointerException ex){//probujemy zareagowac na wyjatek ktory sie pojawil
            System.out.println("nie utwirzyles stringa");//podqajemy co ma sie wykonac jesli bedzie blad
        }
        System.out.println("na koniec programu wypisz");
        tablica = new int[2];
        try{
            tablica[0] = 101;
            tablica[1]= 202;
        } catch (NullPointerException ex){// jesli chcemy utworzyc wiele wyjatkow urzywamy  | i piszemy kolejny rodzaj bledu
            System.out.println("hej, hej utworz tablice co najmniej dwoch elementow");

        }
        System.out.println("wypisz cos");



    }
}
