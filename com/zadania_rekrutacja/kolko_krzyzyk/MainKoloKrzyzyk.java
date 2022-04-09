package com.zadania_rekrutacja.kolko_krzyzyk;

import java.util.Scanner;

public class MainKoloKrzyzyk {
    public static void main(String[]args){
        Gra gra = new Gra();
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("podaj liczbę w pionie: ");
            int pion = scanner.nextInt();
            System.out.print("podaj liczbę w poziomie: ");
            int poziom = scanner.nextInt();
            gra.wybierzPole(pion, poziom);
            gra.wyswietlPlansze();
            gra.zmienTure();
        }


    }
}
