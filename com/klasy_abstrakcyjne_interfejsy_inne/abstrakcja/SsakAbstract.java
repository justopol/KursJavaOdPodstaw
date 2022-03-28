package com.klasy_abstrakcyjne_interfejsy_inne.abstrakcja;

public abstract class SsakAbstract {
    public void karmieneiPotomstwa(){
        System.out.println("karmie mlekiem");
    }
    public void TemperaturaCiala(){
        System.out.println("moja temperatura ciala jest stala");
    }
    public void podajIloscKonczyn(){
        System.out.println("mam 4 konczyny");
    }

    public abstract void wydajDziek();
    public abstract void przemieszczanieSie();
}
