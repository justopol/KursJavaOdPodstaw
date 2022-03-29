package com.scanner;

import java.util.Scanner;

public class MainMainWczytywanieDanychZnaki {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        // wywolujemy metode specjalna - zeby rozdzielenie nie bylo spacja
        scanner.useDelimiter(",");// przecinek jest rozdzielnikiem np. \n oznacza enter, \t tabulator

        System.out.println("rozpoczalem sowje dzialanie");
        while (scanner.hasNext()){
            String next = scanner.next();
            System.out.println("wczytalem: " + next);
        }
        System.out.println("koniec dzialania programu");
//        zamykanie scannera
        scanner.close();
    }
}
