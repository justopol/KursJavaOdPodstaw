package com.watki.zadania;

public class MainWatkiScigajace {
    public static void main(String[]args){
        Scigacz scigaczPierwszy  = new Scigacz("Scigacz 1");
        Scigacz scigaczDrugi = new Scigacz("Scigacz 2");
        Thread scigaczPierwszyThread = new Thread(scigaczPierwszy);
        Thread scigaczDguriThread = new Thread(scigaczDrugi);

        scigaczPierwszyThread.start();
        scigaczDguriThread.start();

    }
}
