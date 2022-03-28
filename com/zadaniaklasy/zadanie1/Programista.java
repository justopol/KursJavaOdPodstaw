package com.zadaniaklasy.zadanie1;

public class Programista {
    //pola
    private String imie;
    private String nazwisko;
    private String jezyk;
    private int zarobki;
    //c
    public Programista(String podajImie, String podajNazwisko, String podajJezyk,int podajZarobki){
    imie = podajImie;
    nazwisko = podajNazwisko;
    jezyk = podajJezyk;
    zarobki = podajZarobki;
    }
// b) metody
    public String pobierzImie(){
        return imie;
    }
    public String pobierzNazwisko(){
        return nazwisko;
    }
    public String pobierzJezyk(){
        return jezyk;
    }
    public int pobierzZarobki(){
        return zarobki;
    }
//    c) konstruktor pobierajacy elementy - pomiedzy polami a metodami
//     d)pola prywatne a metody i konstruktor publiczne
//    e)przetestowanie w metodzie main - PrograistaZadaniaKlasy
}
