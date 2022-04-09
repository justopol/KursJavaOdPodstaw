package com.zadania_rekrutacja;

public class ZadaniaPrzykladoweRekrutacja {
    public static void main(String[]args){

        for(int i = 1; i<=100; i++){
            System.out.print(i);
            if(i%2 == 0){
                System.out.print(" *");
            }
            if(i%3 == 0){
                System.out.print(" +");
            }
            if(i%7 == 0){
                System.out.print(" $");
            }
            System.out.println();
        }
    }

}
