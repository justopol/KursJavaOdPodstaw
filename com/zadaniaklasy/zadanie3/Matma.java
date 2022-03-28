package com.zadaniaklasy.zadanie3;

public class Matma {
    public static final double PI = 3.14;

    public static double obwodKola(double r){
//        double wynik = 0;
//        wynik = 2*PI*r;
        return 2*PI*r;
       }
       public static double poleKola(double r){
        return PI*r*r;
       }
       public static double obwodPorstokata( double a, double b){
        return 2*a+2*b;
       }
       public static double poleProstokata(double a, double b){
        return a*b;
       }




//       kopia zadania 2
    public static int suma(int tablicaInt[]){
        int suma = 0;
        for(int i = 0; i < tablicaInt.length; i++){
            suma += tablicaInt[i];

        }
        return suma;
    }
    public static int srednia(int tablicaInt[]){

        return suma(tablicaInt) / tablicaInt.length;
    }



    public static int min(int tablicaInt[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablicaInt.length; i++) {
            if (tablicaInt[i] < min) {
                min = tablicaInt[i];
            }
        }
        return min;
    }
    public static int max(int tablicaInt[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablicaInt.length; i++){
            if (tablicaInt[i] > max) {
                max = tablicaInt[i];
            }
        }
        return max;
    }

}

