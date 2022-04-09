package com.zadania_rekrutacja.kolko_krzyzyk;

import java.util.Random;

public class Gra {
    private String[][] plansza;//deklaracja + przypisanie = inicjalizacja
    private final static int wymiaryPlanszy = 3;
    private String gracz;

    public Gra(){
      plansza = new String[wymiaryPlanszy][wymiaryPlanszy];
      for( int i =0; i < wymiaryPlanszy; i++){
          for( int j =0; j < wymiaryPlanszy; j++){
              plansza [i][j]= " ";
          }
      }

      Random r = new Random();
      int liczba = r.nextInt(11);
      if(liczba%2  == 0){
          System.out.println("Zaczyna gracz x.");
          gracz = "x";
      }else{
          System.out.println("Zaczyna gracz o.");
          gracz = "o";
      }


    }

}
