package com.scanner;
import java.util.Scanner;

public class MainWczytywanieDanychMetody {
    public static void main(String []args){
       /* Scanner scanner = new Scanner(System.in);

        while (true){
            int wczytany  = scanner.nextInt();
            System.out.println("wczytana " + wczytany);
        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("wypisz cos z klawiatury");
        while (scanner.hasNextInt()){
            int wczytany  = scanner.nextInt();
            System.out.println("wczytana " + wczytany);
        }
        System.out.println("zakonczylem swoje dzialanie");*/

        Scanner scanner = new Scanner(System.in);// pobiera dane do momentu pojawienia sie spacji -  w petli wyraz po wyrazie
        String next;
        while ((next = scanner.next()).equals("X")){// kazdy wyraz zostal indywidualnie wypisany

            System.out.println("wypisany z next: " + next);
        }

    }
}
