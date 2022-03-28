package com.watki.interfejs_runnable;

public class MainWatkiRunnable {
    public static void main(String []args){

        Thread thread = new Thread(new MojWatek());
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i  = 0; i < 1000; i++){
                    System.out.println("jestem z klasy anonimowej dla watkow: " + i);
                }
            }
        });
        thread2.start();

    }
}
