package com.watki.zadania;

public class Czasomierz implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i >= 0 ; i++ ){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ilosc sekund: " + i);

        }
    }
}
