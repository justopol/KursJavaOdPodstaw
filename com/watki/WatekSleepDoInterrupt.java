package com.watki;

public class WatekSleepDoInterrupt implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("watek sleep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("poszedl exception w sleep()");
                //break;//to
                return;//lub to
            }
        }
    }
}
