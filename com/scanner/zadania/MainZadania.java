package com.scanner.zadania;

import java.util.Scanner;

public class MainZadania {
    public static void main(String[]args){
//         zadanie 1
       /* Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        String nazwisko = scanner.next();
        int wzrost = scanner.nextInt();
        System.out.println("jestem  " + imie + " " + nazwisko + " i mam " + wzrost);*/
//        zadanie 2
       /* Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");
        while (true){
            String linia = scanner.next();
            System.out.println("wprowadzone: " +linia);
            if(linia.equals("x") || linia.equals("X")){
                System.out.println("zakonczylem dzialanie");
            }
            break;
        }*/
//        zadanie 3
        /*Scanner scanner = new Scanner(System.in);
        String linia = scanner.nextLine();
        int liczbaLinii = scanner.nextInt();
        for(int i = 0; i < liczbaLinii; i++){
            System.out.println(linia);}*/
//zadanie 4
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczbaNieujemna;
        while((liczbaNieujemna = scanner.nextInt()) >= 0){
            suma += liczbaNieujemna;
        }
        System.out.println("wynik: " + suma);
    }
}
