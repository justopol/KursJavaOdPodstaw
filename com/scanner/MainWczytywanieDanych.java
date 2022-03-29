package com.scanner;

import java.util.Scanner;

public class MainWczytywanieDanych {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);// pobieranie danych z klawiatury
        while (true){
            String linia = scanner.nextLine();
            System.out.println("wprowadzilam: " + linia);

            if( linia.equals("koniec")){
                System.out.println("koncze dzialanie");
                break;
            }
        }
    }
}
