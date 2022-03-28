public class MetodyKlasa {
    // typZwracany nazwaMetody (parametry){
    //}
    void metodaNicNieZwraca() { // void oznacza ze nic nie zwraca
        System.out.println("wartosc wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) { // typ partumentu + nazwa parametru, jesli wiecej metod wtedy po przecinku
        liczba++;
        System.out.println("wartosc z metody " + liczba + " "  + pojedynczyZnak);
    }
    void nazewnictwoDowolneKolejnaMetoda(boolean czyPokazac, int liczba){
        if(czyPokazac){
            System.out.println("liczba:" + liczba);
        }
        else {
            System.out.println("nie pozwolono pokazac");
        }

    }
    int dodawanie(int a, int b){ // zeby zwracał zamiast void wpisujemy typ np. int
       int wynik = a + b;
        return wynik; // zawsze return i co ma wypluc
    }
    double dodajCosPoPrzecinku( double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }
    boolean zamienWartoscLogiczna(boolean wartoscLogiczna){
        return !wartoscLogiczna; //zamienia true na false i odwrotnie, negacja
    }
    int zwrocOdWartoscxiLogicznej(boolean czyZwrocic, int liczba) {
        if (czyZwrocic){
            return liczba;
        }
        else {
            return 0;
        }
    }
    int przykladKolejnej(){
        return 100;
       // za return nic nie wyswietli, przed tak : System.out.println("warotsc zostala zwrotcona");
    }
     // void oze miec return
    void voidKtoryMaCosZwracac(boolean czyZakonczyc){
        if(czyZakonczyc){
            return;
        }
        System.out.println("mozna napisac bo return nie zakonczony wartoscia logiczna");
    }

}
