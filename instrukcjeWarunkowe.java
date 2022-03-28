public class instrukcjeWarunkowe {
    public static void main (String[] args){
        // ang. conditional statements
//        instrukcja if
        int wiek = 15;
        boolean przyszedlTata = false;
        boolean przeszlaMama = true;

        if (wiek >= 18) {
            System.out.println("warunek został spełniony");
        }
        else if (przyszedlTata == true) { // moż zapisac też jako przyszedlTata
            System.out.println("można podać");
        }
        else if(wiek< 18 && przeszlaMama){// jest rowne przyszlaMama == true
            System.out.println("sprzedaj");
        }
        else {
            System.out.println("warunek nie spełniony ");
        }

//            instrukcja switch dla typow int double char long
            int zmienna = 5;

            switch (zmienna) {
                case 1: //pod : blok kodu który ma sie wykonac gdy wejdzie w case
                    System.out.println("jeden");
                    break;// oznacza przerwij działanie switch , nie wypisze kolejnych elemntow
                case 2:
                    System.out.println("dwa");
                    break;
                case 3:
                    System.out.println("trzy");
                    break;
                default:// jesli zaden przypadek nie spelniony wtedy wchodzi w default
                    System.out.println("nie spelniono zadnego przypadku");

            }
            char pojedynczyZnak = 'a';
            switch (pojedynczyZnak) {
                case 'a':
                    System.out.println("podales male a");
                    break;
                case 'A':
                    System.out.println("podales duze a");
                    break;
                default:
                    System.out.println("podales inna wartosc");
                    break;
            }

//            kiedy switch a kiedy if. / switch kiedy chcemy wypisac kolejne a if jesli ma wybrac jedna
        System.out.println("wykonywanie if");
        if (zmienna == 1) {
        } else if (zmienna == 2) {
            System.out.println("dwa");
        } else if (zmienna == 3) {
            System.out.println("trzy");
        } else if (zmienna == 5) {
            System.out.println("piec");
        } else {
            System.out.println("nie znam tej liczby");
        }
        // zamiana na swich przez zarowke z lewej strony
        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            case 5:
                System.out.println("piec");
                break;
            default:
                System.out.println("nie znam tej liczby");
                break;
        }

        System.out.println("kalendarz");
        int miesiac = 5;
        switch (miesiac) {
            case 1:
                System.out.println("styczen");
            case 2:
                System.out.println("luty");
            case 3:
                System.out.println("marzec");
            case 4:
                System.out.println("kwiecien");
            case 5:
                System.out.println("maj");
            case 6:
                System.out.println("czerwiec");
            case 7:
                System.out.println("lipiec");
            case 8:
                System.out.println("sierpien");
            case 9:
                System.out.println("wrzesien");
            case 10:
                System.out.println("pazdziernik");
            case 11:
                System.out.println("listopad");
            case 12:
                System.out.println("grudzien");
        }
//          ZADANIA Z INSTRUKCJI WARUNKOWYCH
        // zadanie 1
        int liczbaParzysta = 4;
        if (liczbaParzysta % 2 == 0) {
            System.out.println("podana liczba jest parzysta");
        }
        else {
        System.out.println("podana liczba jest nieparzysta");
        }
        // zadanie 2
        int dochod = 90000;
        int wydatki = 91000;
       double podatek1 = 0.17;
        double podatek2 = 0.32;
        if (dochod < 0) {
            System.out.println("kwota do zaplacenia wynosi 0");
        }
        else if (dochod <= 85528){
            podatek1 = podatek1 * dochod;
            System.out.println("podatek1: " + podatek1);
        }
        else if (dochod > 85528){
            podatek1 = podatek1 * 85528;
            podatek2 = podatek2 * (dochod - 85528);
            podatek2 = podatek1 + podatek2;
            System.out.println("podatek w wyzszej grupie: " + podatek2);
        }
        // zadanie 3
        double liczba1 = 3;
        double liczba2 = 2;
        char dzialanie = '/';
        double wynik = 0;
        switch (dzialanie){
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
               wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
               wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("nieprawidlowe dzialanie");
                break;
        }
        System.out.println(liczba1 + " " + dzialanie + " " + liczba2 + " = "+ wynik);


        }

    }




