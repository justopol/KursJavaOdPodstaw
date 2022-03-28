package com.klasy_abstrakcyjne_interfejsy_inne;

public class ZewnetrznaKlasa {
    //w klasie zewnetrznej nie mozna uzywac metod i pol z klasy wewnetrznej, ale na obiekcie mozna wywowal metody z wewnetrznej

    int poleZewnetrznw;
    int metodaZewnetrzna(){
        Wewnetrzna obiektWewnetrzna = new Wewnetrzna();
        obiektWewnetrzna.metodaWewnetrzna();
        return -1;
    }
    class Wewnetrzna{
        int poleWewnetrzne;
        int metodaWewnetrzna(){
            metodaZewnetrzna();
            return -2;// w klasie wewnetrxznej mozemy korzystac z pol i metod klasy zewnetrznej
        }
    }
}
