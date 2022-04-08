import java.util.Locale;

public class StringClass {
    public static void main (String[] args){
      java.lang.String str = "jakis string"; //literał typu string,
       int i  = 100;
       java.lang.String str2 = "jakiś";
       java.lang.String jakis = "jakis string";
       // porównanie stringow i medtoda equals
        java.lang.String strLiteral1 = "tekst";
        java.lang.String strLiteral2 = "tekst";
        boolean wynik = strLiteral1 == strLiteral2;
        System.out.println(wynik); // true bo pobieraja dane z tego sameog miejsca z pamiecie

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");
        wynik = strObject1 == strObject2;
        System.out.println("strObject1 == strObject2:" + wynik); // false bo sa towrzone nowe dane

        wynik = strLiteral1 == strObject2;
        System.out.println("strLiteral1 == strObject1:" + wynik);

        //sprawdzsenie czy dwa stringi sa rowne posiadaja te same teksty equals()
        wynik = strLiteral1.equals(strLiteral2);
        System.out.println("strLiteral1.equals(strLiteral2 " + wynik);

        wynik = strObject1.equals(strLiteral2);
        System.out.println(wynik);

        // zadania String
        String imie = "Justyna";
        String nazwisko = "Gofrowa";
        String laczonwy = "Justyna Gofrowa";
        System.out.println("length:" + imie.length());
        System.out.println("length:" + nazwisko.length());
        System.out.println("length:" + laczonwy.length());
        // powownywanie dlugosci do alicja i jan

     String imie1 = "Alicja";
     String imie2 = "Jan";
     System.out.println(imie.length() == imie1.length());
     System.out.println(imie.length() == imie2.length());
     // lub
     if(imie.equals("Alicja")){
      System.out.println("twoje imie to Alicja");
     }
     else if (imie.equals("Jan")){
      System.out.println("twoje imie to Jan");
     }
     else{
      System.out.println("masz inne imie");
     }
     // wypisanie z wielkich liter
            //   nazwisko.toUpperCase(Locale.ROOT);
     System.out.println("toUpperCase:" + nazwisko.toUpperCase(Locale.ROOT));
     // zamiana a na e
     System.out.println("replace:" + nazwisko.replace('a','e'));
     // zadanie pisanie pionowe Potrawie coraz wiecej z programowania
     String zdanie = "Potrafię coraz więcej z programowania";


     for(int p = 0; p< zdanie.length(); p++){
      System.out.println(zdanie.charAt(p));
     }
     // zadanie - pisanie zdania od tylu

     for (int y = (zdanie.length()-1); y>= 0; y--){
      System.out.print(zdanie.charAt(y));
     }








    }
}
