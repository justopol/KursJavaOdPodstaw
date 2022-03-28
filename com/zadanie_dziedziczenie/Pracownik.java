package com.zadanie_dziedziczenie;

public class Pracownik extends Osoba{
    private String stanowisko;
    private String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy){
        super(imie, nazwisko);//wykorzystanie konsttruktora klasy nadrzednej do ustwienia imienia i nazwiska
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;

    }

    @Override
    public void przedstawSie() {
        //System.out.println("Jestem " + imie + " " + nazwisko + "i pracuje w firmie " + nazwaFirmy + "na stanowisku " + stanowisko);
        super.przedstawSie();
        System.out.println(" i pracuje w firmie " + nazwaFirmy + "na stanowisku " + stanowisko);

    }
}
