package com.modyfikatory_dostepu.jeden;

public class KlasaBezNieczego {
    public void metoda(){
        KlasaA obiekt = new KlasaA();
        obiekt.poleBezNiczego = 7;
        obiekt.metodaBezNiczego();
        obiekt.metodaProtected();

    }
}
