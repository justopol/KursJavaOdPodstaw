package com.przesylanie_metod_klasy;

public class KlasaRozszerzonaThis extends KlasaPostawowaThis {

    int x;
    int y;
    int z;
    int v;
    int pole;

    KlasaRozszerzonaThis(){
        System.out.println("konstruktor z klasa rozszerzona");
    }
    KlasaRozszerzonaThis(int x){
        this.x = x;
        System.out.println("konstruktor z klasa rozszerzona z parametrem " + x);
    }
    KlasaRozszerzonaThis(int x, int y){
        this(x);//wywolanie konstruktora z ciala poprzedniego konstruktora
        this.y = y;
        System.out.println("konstruktor z klasa rozszerzona z parametrami a i b" + x +" " + y);

    }
    void metodaZTejKlasy(){

    }
    void metodaZParametrami(int pole){
        this.pole = pole;//wywolanie pola z gory
    }
}
