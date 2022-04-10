package com.zadania_rekrutacja.kolko_krzyzyk;

public class Wynik {
    private boolean czyKoniecGry;
    private Zwyciezca zwyciezca;
    Wynik(boolean czyKoniecGry,Zwyciezca zwyciezca){
        this.czyKoniecGry = czyKoniecGry;
        this.zwyciezca = zwyciezca;
    }
    public boolean getCzyKoniecGry(){
        return czyKoniecGry;
    }
    public Zwyciezca getZwyciezca(){
        return zwyciezca;
    }

    public void setCzyKoniecGry(boolean czyKoniecGry){
        this.czyKoniecGry = czyKoniecGry;
    }
    public void setZwyciezca(Zwyciezca zwyciezca){
        this.zwyciezca = zwyciezca;
    }

}
