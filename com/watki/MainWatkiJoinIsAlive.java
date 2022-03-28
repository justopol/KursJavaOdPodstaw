package com.watki;

public class MainWatkiJoinIsAlive {
    public static void main(String []args){

        System.out.println("start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 0; i < 3; i++){
                    System.out.println("bardzo ciezko pracuje");
                    try {Thread.sleep(1000);} catch (InterruptedException e) { }
                }

            }
        });
        thread.start();

        System.out.println("czy watek zyje: " + thread.isAlive());


            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("po join(): czy watek zyje " + thread.isAlive());


        System.out.println("stop");
    }
}
