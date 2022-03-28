package com.watki;

public class WatekInterrupedRunnable implements Runnable{
    @Override
    public void run() {
        while (true){

            System.out.println("watek interruped runalbel dxiala");
            if (Thread.interrupted()){
                return;
            }
        }
    }
}
