package com.watki.klasa_thread_watki;

public class MainWatkiThread {
    public static void main(String[]args){
        // ang. thread

        MojPierwszyWatek watek = new MojPierwszyWatek();

        Thread watek2 = new MojDrugiWatek();
        watek.start();
        watek2.start();

}}
