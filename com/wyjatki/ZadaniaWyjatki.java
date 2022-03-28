package com.wyjatki;

public class ZadaniaWyjatki {
    public static void main(String []args) {
//        zadanie 3 wynil
        MatmaZadanie3.obwodKola(-5);
//        zadanie 2
        try {
            System.out.println("wynik dzielenia zad 2:" +podziel(6,0));//do zadania 2
        } catch (ZadaniaWyjatkiKlasa e) {
            System.out.println("nie wolno dizelic przez zero");
        }
//        zadanie 1
        try {
            int a = 4;
            int b = 0;
            int dzielenie = a / b;
            System.out.println("wynik " + dzielenie);
        } catch (ArithmeticException e) {
            System.out.println("nie dziel przez 0");
        }
    }
//       zadanie 2

    public static int podziel(int a, int b) throws ZadaniaWyjatkiKlasa {
        if (b==0){
        throw new ZadaniaWyjatkiKlasa();
    }return a/b;
    }



}

