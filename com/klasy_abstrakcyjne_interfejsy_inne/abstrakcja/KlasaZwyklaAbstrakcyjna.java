package com.klasy_abstrakcyjne_interfejsy_inne.abstrakcja;

import com.klasy_abstrakcyjne_interfejsy_inne.PrzykladowaKlasaAbstrakcyjna;

public class KlasaZwyklaAbstrakcyjna extends PrzykladowaKlasaAbstrakcyjna {
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("wypisalam z klasy zwyklej");

    }

    @Override
    public int metodaZParametrem(String z) {
        System.out.println("wypisuje parametr: " + z);
        return 101;
    }
}
