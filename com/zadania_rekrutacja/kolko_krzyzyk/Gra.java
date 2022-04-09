package com.zadania_rekrutacja.kolko_krzyzyk;

public class Gra {
    private String[][] plansza;//deklaracja + przypisanie = inicjalizacja
    private final static int wymiaryPlanszy = 3;
    public Gra(){
      plansza = new String[wymiaryPlanszy][wymiaryPlanszy];
      for( int i =0; i < wymiaryPlanszy; i++){
          for( int j =0; j < wymiaryPlanszy; j++){
              plansza [i][j]= " ";
          }

      }

    }

}
