package com.zadaniaklasy.zadanie2;

public class Zadanie2Main {
    public static void main(String[] arg){
        int[] tablicaInt ={5, 1, 199, 200, 4, 7};
        KonstruktorTablica talbicaObliczenia = new KonstruktorTablica(tablicaInt);
        System.out.println("suma " + talbicaObliczenia.suma());
        System.out.println("srednia" + talbicaObliczenia.srednia());
        System.out.println("min " + talbicaObliczenia.min());
        System.out.println("max " + talbicaObliczenia.max());
    }
}
