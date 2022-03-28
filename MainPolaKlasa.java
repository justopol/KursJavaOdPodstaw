public class MainPolaKlasa {
    int liczbaCalkowita;

    void zwrocWartoscPola(){
        System.out.println("zwrocona wartosc pola: " + liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc) {
        liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolaZMetody (){
        return liczbaCalkowita;
    }

}
