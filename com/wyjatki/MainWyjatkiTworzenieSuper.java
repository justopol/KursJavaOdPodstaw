package com.wyjatki;

public class MainWyjatkiTworzenieSuper {
    public static void main(String[]args){
        try {
            wyrzucKoniecznieJakisWyjatek();
        } catch (JakisExceptionTworzenieSuper e) {
            System.out.println("obsluguje odpoeiwdnio wyjatek podczas catch " + "a wiadomosc wyjatku to:" + e.getMessage());
        }

    }
    public static void wyrzucKoniecznieJakisWyjatek () throws JakisExceptionTworzenieSuper{
        throw new JakisExceptionTworzenieSuper("specjalna wiadomosc");
    }
}
