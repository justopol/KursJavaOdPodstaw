package com.watki.klasa_thread_watki;

public class MojPierwszyWatek extends Thread{// najprosciej dziedziczenie po thread

//nadpisujemy metode run
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println("moj pierwszy watek: " + i);
        }
    }
}
