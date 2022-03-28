package com.watki;

public class MainWatkiSleep {
    public static void main(String []args){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i  = 0; i < 10; i++){
                    System.out.println("watek jedne: " + i);
                    try {
                        Thread.sleep(1000);// uspienie watku na 1 sekunde bo 1000mlilisekund = 1s
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 0; i < 10; i++){
                    System.out.println("watek dwa: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         thread2.start();

    }
}
