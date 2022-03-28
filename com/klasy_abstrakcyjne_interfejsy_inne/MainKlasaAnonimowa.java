package com.klasy_abstrakcyjne_interfejsy_inne;

public class MainKlasaAnonimowa {
    public static void main(String[]args){
        // ang. anonymous class typ klasy wewnetrznej, nie ma nazwy ale trzeba utworzyc do niej obiekt zeby sie odwolywac
//tworzenie klasy anonimowej
       MainKlasaWewnetrzna.KlasaDoAnonimowa obiektKlasaDoAnonimowej = new MainKlasaWewnetrzna.KlasaDoAnonimowa() {
            @Override
            public void metodaZwykła() {
                System.out.println("metoda wywolana z klasy anonimowej");
            }
        };
       obiektKlasaDoAnonimowej.metodaZwykła();

       MainKlasaWewnetrzna.KlasaDoAnonimowa klasaDoAnonimowa = new MainKlasaWewnetrzna.KlasaDoAnonimowa();
       metodaTutaj(new MainKlasaWewnetrzna.KlasaDoAnonimowa(){
           @Override
           public void metodaZwykła() {
               System.out.println("specjalnie dla was zmienie zachowanie");


           }
       });
    }
    public static void metodaTutaj(MainKlasaWewnetrzna.KlasaDoAnonimowa parametr){
        parametr.metodaZwykła();
    }
}
