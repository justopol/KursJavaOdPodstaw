package com.wyjatki;

import java.io.FileNotFoundException;

public class MainWyjatekiPrzenoszenie {
    public static void main(String[]args){
       //przeniesienie wyjatku wyzej , gdxzie indziej
        WyjatekPrzenoszenie wyjatekPrzenoszenie = new WyjatekPrzenoszenie();
        try {
            wyjatekPrzenoszenie.wyjatkowaMetoda();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
