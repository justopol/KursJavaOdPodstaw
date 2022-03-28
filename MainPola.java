public class MainPola {
    public static void main(String [] args){
        // ang. fields
        MainPolaKlasa obiekt = new MainPolaKlasa();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("zmienna" + zmienna);
    }
}
