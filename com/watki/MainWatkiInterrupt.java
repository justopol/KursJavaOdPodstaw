package com.watki;

public class MainWatkiInterrupt {
    public static void main(String []args) throws InterruptedException {

        Thread watekSleepThread = new Thread(new WatekSleepDoInterrupt());
        watekSleepThread.start();

        watekSleepThread.interrupt();// metoda do przerywania


        Thread watekInterrupterRunnable = new Thread(new WatekInterrupedRunnable());
        Thread.sleep(1000);
        watekInterrupterRunnable.interrupt();




    }
}
