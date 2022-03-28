package com.modyfikatory_dostepu.jeden;

public class KlasaA {
//    modyfikatory dostepu rodzaje
    public int polePubliczne; // dostepny wszedzie we szystkich klasach
    protected int poleDziedziczenia; // zwiazany z dziedziczeniem - jesli dziedziczy klase a to ma dostepne
    // te pole ktore jest protected lub w tym samym package
    private int polePrywatne; // tylko w danej klasie np. tylko KlasaA
    int poleBezNiczego; // pole dostepne w tym samym package, modyfikator dostepu typu package
    public void metoda() {
        polePrywatne = 5;
    }
    public void metodaPubliczna() {

    }
    protected void metodaProtected() {

    }
    private void metodaPritvate() {

    }
    void metodaBezNiczego() {

    }
}




