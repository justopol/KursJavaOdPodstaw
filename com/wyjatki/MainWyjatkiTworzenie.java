package com.wyjatki;

public class MainWyjatkiTworzenie {
    public static void main(String[]args){
        //wyjatki tworzymy jak zwykle klasy tylko musimy odziedziczyc - po klasie wyjatkow
        UzytkownikTworzenieWyjatek uzytkownikTworzenieWyjatek = new UzytkownikTworzenieWyjatek();
        try {
            uzytkownikTworzenieWyjatek.wprowadzEmail("jan.kowalsi.przyklad.com");
            uzytkownikTworzenieWyjatek.wprowadzHaslo("qwerty123");
        } catch (NiezbytTajneHasloExceptionTworzenie e) {
            System.out.println("haslo niezbyt bezpieczne");
        } catch (NiepoprawnyEmailExceptionTworzenie e){
            System.out.println("email nie zawiera @");
        }
    }

}
