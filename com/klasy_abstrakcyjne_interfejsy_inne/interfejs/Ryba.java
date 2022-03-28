package com.klasy_abstrakcyjne_interfejsy_inne.interfejs;

public class Ryba implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("skrzela");
    }

    @Override
    public void odzywnianie() {
        System.out.println("robaki");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("ikra");

    }
}
