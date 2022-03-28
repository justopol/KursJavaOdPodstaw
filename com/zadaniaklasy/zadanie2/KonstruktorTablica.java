package com.zadaniaklasy.zadanie2;

public class KonstruktorTablica {
    private int[] tablicaInt;

    public KonstruktorTablica(int[] podajTabliceInt){
       tablicaInt = podajTabliceInt;

    }
    public int suma(){
        int suma = 0;
        for(int i = 0; i < tablicaInt.length; i++){
            suma += tablicaInt[i];

        }
        return suma;
    }
    public int srednia(){
        return suma() / tablicaInt.length;
    }
   public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablicaInt.length; i++) {
            if (tablicaInt[i] < min) {
                min = tablicaInt[i];
            }
        }
        return min;
    }
    public int max(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablicaInt.length; i++){
            if (tablicaInt[i] > max) {
                max = tablicaInt[i];
            }
        }
        return max;
    }


}
