package com.watki.zadania;

public class MainKlasaZadania {
    public static void main(String[]args){
        Runnable runnableAnonimowe = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("ta informajca zostala wypisana z klasy anonimowej");
            }
        };
        Thread threadZRunnableAnonimowej = new Thread(runnableAnonimowe);
        threadZRunnableAnonimowej.start();

//        zadanie 2

        Thread czasomierzThread = new Thread(new Czasomierz());
        czasomierzThread.start();


    }
}
