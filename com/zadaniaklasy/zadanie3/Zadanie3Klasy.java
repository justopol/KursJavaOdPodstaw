package com.zadaniaklasy.zadanie3;

public class Zadanie3Klasy {
    public static void main(String[] args){
        System.out.println(Matma.obwodKola(4));
        System.out.println("pole kola " + Matma.poleKola(4));
        System.out.println("obwwod prostokata " + Matma.obwodPorstokata(4,5));
        System.out.println("pole prostokata " + Matma.poleProstokata(4,5));
        int[] tab = {1, 5, 9};
        System.out.println("srednia" + Matma.srednia(tab));
    }
}
