public class Petle {
    public static void main (String [] args) {
      // ang. loop
//        petla for
        int liczenie;
        // for (int liczenie = 1; liczenie<= 10; liczenie++) wtedy zmienna jest tylko w petli, poza nią nie istnieje
        for (liczenie = 1; liczenie <= 10; liczenie++) { // przypisujemy wartosc do inta;jak dlugo ma sie wykonywac- warunek; co ma sie stac ze zmienna po kazdym wykonaniu petli
            System.out.println("tekst " + liczenie);
        }
        System.out.println("poza petla: " + liczenie);

//        petla while moza porownac do instrukcji warunkowej z i
        int liczenie1 = 1;
        while (liczenie1 <= 10) { // wykonuje sie tak dlugo dopoki ie bedzie sprzecznosci
            System.out.println("tekse  " + liczenie1);
            liczenie1 += 1; //zwiekszam zmienna o 1
        }

//        petla while : do while najpierw wykonaj potem sprawdz - odwrotnie niz w while, przynajmniej raz sie wykona xzawwsze
       liczenie1 = 1;
        do {
            System.out.println("tekst z do while: " + liczenie1);
            liczenie1++;
        } while (liczenie1 <= 10);
//        break i continue
        int zmienna; //utworzenie
        for (zmienna = 1; zmienna <= 20; zmienna++){
            if (zmienna == 18){
                continue; // liczba i petla nr 18 nie zostanie wyswietlona tylko kolejne petle, drukuje tylko to co za continue
            }
            System.out.println("zmienna " + zmienna);
        }
        for (zmienna =1; zmienna <= 20; zmienna++){
            if (zmienna == 18){
                break; // konczy na wybranej liczbie -  w tym warunku petla zostala przerwana, gdyby byla =1 ani razu sie nie wykona
            }
            System.out.println("zmienna w 2 petli: " + zmienna);
        }
//        ciekawostka - mozna usunac 1 i 3 element
        for(zmienna = 1;;zmienna++){ //drukuje w nieskonczonosc, for jest zawsze prawdziwy for(;;), jesli nie bedzie srodkowego warunku for zawsze prawdziwy
            if (zmienna == 100){
                break;
            }
            System.out.println("trzeci for: ");
        }
//        petla i tablica
        int [] tab = new int[100];

        for (int i = 0; i < tab.length; i++){ // lub i < 10, ten lenght ten bardziej prawidlowy
           tab[i] =i;
        }
        for (int i = 0;i <= tab.length - 1; i++){
            System.out.println("tab " + i + ": " + tab[i]);
        }
//        petla w petli
        int licznik = 0;
        int[][] tablica = new int[5][10];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                licznik++;
                tablica[i][j] = licznik;
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                System.out.print(tablica[i][j] + " ");// w petli srodkowej robimy printa ze spacja czyli bez ln
            }
            System.out.println();
        }
//        zadania petle
        // zadanie 1
        for ( int zad1 = 0; zad1 <= 30; zad1++) {
            System.out.println("wynik zad1: " + zad1);
        }
        // zadanie 2
        for ( int zad1 = 30; zad1 >= 0; zad1--) {
            System.out.println("wynik zad1: " + zad1);
        }
        // zadanie 3
        int a = 6;
        int b = 28;
        for (a = 6; a < b; a++) {
            System.out.println("wynik zad3: " + a);
        }
        // zadanie 4
        int [] tab1 = new int[10];
        for (int p = 0; p < tab1.length; p++){
            tab[p] = p;
            System.out.println(tab[p]);
        }
        // 2 czesc
        int [] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int u = tab2.length - 1; u >= 0 ; u--){
            tab[u] = u;
            System.out.println("wynik zadanie 4:" + tab[u]);
        }
        // zadanie 5
        int suma = 0;
        for (int k = 0; k < tab2.length; k++){
            suma = suma + tab2[k];
        }
        System.out.println("wynik zadanie 5: " + suma);
        // zadanie 6
        int silnia = 1;
        int liczba6 = 5;
        for (int q = 1; q <= liczba6; q++){
            silnia = silnia * q;
        }
        System.out.println("wynik zadanie 6:" + silnia);
        //zadanie 7
        int wysokosc = 5;
        int szerokosc = 1;
        for (int r = 1; r <= wysokosc; r++){
            for (int h = 1; h <= szerokosc; h++){
                System.out.print("*");;
            }
            szerokosc = szerokosc + 1;
            System.out.println();
        }
        // zadanie 8
        int n = 5;
        int liczbaSpacji = 0;
        int gwiazdki = n - liczbaSpacji;
        for (int y = 1; y <= n; y++){
            for (int t = 0 ; t < n - y; t++){
                    System.out.print(" ");
            }
            for (int l = n - y; l <= n - 1; l++){
                System.out.print("*");
            }
            System.out.println();

        }
        // zadanie 9
        int n1 = 5;
        int liczbaSpacji1 = 0;
        int gwiazdkii = n1 - liczbaSpacji1;
        for (int g = 0; g < n1 - 1; g++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int f = 1; f<= n1 - 1; f++){
            for (int v = 0; v < n1 - f - 1; v++){
                System.out.print(" ");
            }
            for (int c = n1 - f; c <= n1 - 1; c++){
                System.out.print("*");
            }
            for (int h1 = 0; h1 <= f; h1++){
                System.out.print("*");
            }
            System.out.println();
        }
        // alternatywa zadanie 9
        n1 = 5;
        liczbaSpacji1 = 0;
        gwiazdkii = n1 - liczbaSpacji1;
        for (int i = 0; i< n1; i++){
            for (int j1 = 0; j1 < n1 - i; j1++){
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < 2*i + 1; j2++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

