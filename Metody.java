public class Metody {
    public static void main(String[] args){
        //ang. methods
      MetodyKlasa nazwaObiektu = new MetodyKlasa();
      nazwaObiektu.metodaNicNieZwraca();
      nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'a');//argument czyli konkretna liczba, dana, a parametr ogolne w tworzeniu ciala metody
        nazwaObiektu.nazewnictwoDowolneKolejnaMetoda(false, 100); // po kropce jest wywołanie metody

        int wynikDodawania = nazwaObiektu.dodawanie(10, 5);
        System.out.println("wynikDodawanie: " + wynikDodawania);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.1);
        System.out.println("po przecinku: " + wynikKolejnejMetody);

        System.out.println("wartosc logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));

        nazwaObiektu.voidKtoryMaCosZwracac(true);

    }
}
