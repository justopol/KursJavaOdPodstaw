package com.wyjatki;

public class UzytkownikTworzenieWyjatek {
    public void wprowadzHaslo(String haslo) throws NiezbytTajneHasloExceptionTworzenie {
        if (!haslo.contains("tajne")) {
            throw new NiezbytTajneHasloExceptionTworzenie();
        }
        //zrob odpowiednie rzeczy z  haslem dalej w kodzie
    }
        public void wprowadzEmail(String email){
            if (!email.contains("@")){
                throw new NiepoprawnyEmailExceptionTworzenie();
            }
            //zrob odpowiednie rzeczy z email....
        }
    }
