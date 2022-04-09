package com.zadania_rekrutacja.kolko_krzyzyk;

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
        plansza[pion][poziom] = znak + " ";
    }
    public void wyswietlPlansze(){
        for( int i =0; i < wymiaryPlanszy; i++){
            for( int j =0; j < wymiaryPlanszy; j++){
                System.out.print(plansza[i][j]);
            }
            System.out.println();
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
