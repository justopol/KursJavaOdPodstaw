package com.zadania_rekrutacja.kolko_krzyzyk;

import java.io.IOException;
import java.util.Random;

public class Gra {
    private String[][] plansza;//deklaracja + przypisanie = inicjalizacja
    private final static int wymiaryPlanszy = 3;
    private String znak;

    public Gra(){
      plansza = new String[wymiaryPlanszy][wymiaryPlanszy];
        stworzPustaPlansze();
        losujGracza();
    }
    public void wybierzPole(int pion, int poziom){
        if(sprawdzPoprawnosc(pion, poziom)){
            plansza[pion-1][poziom-1] = znak + " ";
        }else{
            System.out.println("wybierz innne pole");
        }
    }
    public void wyswietlPlansze(){
        for( int i =0; i < wymiaryPlanszy; i++){
            for( int j =0; j < wymiaryPlanszy; j++){
                System.out.print(plansza[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void zmienTure(){
        if(znak == "x"){
            znak = "o";
        }else{
            znak = "x";
        }
    }
    public boolean czyKoniecGry(){
        boolean czyJestMyslnik = false;
        czyJestMyslnikNaPlanszy();
    }

    private boolean czyJestMyslnikNaPlanszy() {
        for (int i = 0; i < wymiaryPlanszy; i++){
            for (int j = 0; j < wymiaryPlanszy; j++){
                if(plansza[i][j] == "- "){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean sprawdzPoprawnosc(int pion, int poziom){
        if(plansza[pion-1][poziom-1] == "- "){
            return true;
        }else{
            return false;
        }
    }

    private void stworzPustaPlansze() {
        for( int i =0; i < wymiaryPlanszy; i++){
            for( int j =0; j < wymiaryPlanszy; j++){
                plansza [i][j]= "- ";
            }
        }
    }

    private void losujGracza() {
        Random r = new Random();
        int liczba = r.nextInt(10);
        if(liczba%2  == 0){
            System.out.println("Zaczyna gracz x.");
            znak = "x";
        }else{
            System.out.println("Zaczyna gracz o.");
            znak = "o";
        }

    }



}
