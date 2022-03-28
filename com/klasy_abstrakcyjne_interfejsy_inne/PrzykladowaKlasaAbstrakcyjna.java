package com.klasy_abstrakcyjne_interfejsy_inne;

public abstract class PrzykladowaKlasaAbstrakcyjna {
    //pred slowem klass dodajem slowo abstract
    public void jakasMetoda(){
        System.out.println("cos na ekran");
    }
    public abstract void  metodaAbstrakcyjna();// towrzenie przez slowo abstract i nie moze miec ciala, cialo implementujemy w klasie ktora dziedziczy po abstrakcyjnejn
    public abstract int metodaZParametrem(String z);

}
