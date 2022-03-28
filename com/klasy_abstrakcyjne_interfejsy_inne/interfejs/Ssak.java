package com.klasy_abstrakcyjne_interfejsy_inne.interfejs;

public class Ssak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("płuca");
    }

    @Override
    public void odzywnianie() {
        System.out.println("roslinki badz miesko");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("płód");

    }
}
