package com.klasy_abstrakcyjne_interfejsy_inne.interfejs;

public class Ptak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("płuca");
    }

    @Override
    public void odzywnianie() {
        System.out.println("robaki");

    }

    @Override
    public void wydawaniePokolenia() {
        System.out.println("jajo");

    }
}
