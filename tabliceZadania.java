public class tabliceZadania {
    public static void main (String [] args){
        // ang. arrays, tablica[indeks]
//        tworzewnie tablicy : new typ [rozmiar]
//        tablica jednowymiarowa
        int [] tablica;
        tablica = new int[10]; //przydzielona nowa tablica zlozona z 10 elementow
        tablica[0] = 5; // cyfra w nawiasie jest indeksem tablicy -  w tym przypadku 0
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155; //elemnty numerowane od 0 czyli 3 oznacza 4 element w tablicy
        //pobieranie wartosci
        System.out.println(tablica[3]);
//        drugi sposob tworzenia tablicy - wartosc domyslna dla double jest 0.0
        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        System.out.println(tablicaDouble[0]);

       /* System.out.println(tablicaDouble[99]); wyjatek - wyszlismy poza zakres tablicy
        char[] tablicaCharow;
        System.out.println(tablicaCharow[0]);*/

        int[] nowaTablicaIntow = {5, 10, 15, 155}; // tworzenie tablicy z przypisaniem
        System.out.println(nowaTablicaIntow[0]);
//        sprawdzanie rozmiaru tablicy
//        nowaTablicaIntow.length
        System.out.println("rozmiar tablicy: " + nowaTablicaIntow.length);

//        tablice wielowymiarowe
//        tablice dwuwymiarowe najczestsze
        int [][] tablicaDwuwymiarowa = new int [10][10];
        tablicaDwuwymiarowa [0][1] = 123;
        tablicaDwuwymiarowa [4][8] = 190;
        System.out.println(tablicaDwuwymiarowa[4][8]);
        System.out.println(tablicaDwuwymiarowa.length);
        System.out.println(tablicaDwuwymiarowa[0].length);
        System.out.println(tablicaDwuwymiarowa[9].length);// ostatni indeks bo 10-9

        int [][]nowaTablica = {{1,2,3}, {4,5,6}};// w klamrach wiersze a klamry oznaczają ilosć kolumn
        /* inny zapis:  int [][]nowaTablica = {
        {1,2,3},
        {4,5,6}
        };
         */
        System.out.println("[0][0]" + nowaTablica[0][0]);
        System.out.println("[0][1]" + nowaTablica[0][1]);
        System.out.println("[1][2]" + nowaTablica[1][2]);

        System.out.println("rozmiar tablicy:" + nowaTablica.length);// oznacza ilośc kulumn - klamr
        System.out.println("rozmair kolumny 0" + nowaTablica[0].length);// sprawdza ile w komulnie jest elementów

//        tablica trzywymiarowa
        int [][][] tablicaTrojwymiariwa = new int [5][6][11];

//        zadania
        int [] tablicaZad1 = {1, 2, 3, 4, 5};
        System.out.println(tablicaZad1.length);
        int suma = tablicaZad1[0] + tablicaZad1[1] + tablicaZad1[2] + tablicaZad1[3] + tablicaZad1[4];
        System.out.println("suma = " + suma);

//        zadanie 2 tablice
        int [][] tablicaZad2 = {{1, 2, 3, 4, 5},
                                {6, 7, 8, 9, 10},
                                {11, 12, 13, 14, 15}};
        int suma1 = tablicaZad2[0][0] + tablicaZad2[0][1] + tablicaZad2[0][2] + tablicaZad2[0][3] + tablicaZad2[0][4];
        System.out.println("suma 1 wiersza: " + suma1);
        int suma2 = tablicaZad2[1][0] + tablicaZad2[1][1] +tablicaZad2[1][2] + tablicaZad2[1][3] + tablicaZad2[1][4];
        System.out.println("sunma 2 wiersza: " + suma2);
        int suma3 = tablicaZad2[2][0] + tablicaZad2[2][1] +tablicaZad2[2][2] + tablicaZad2[2][3] + tablicaZad2[2][4];
        System.out.println("suma 3 wiersza: " + suma3);




    }
}
