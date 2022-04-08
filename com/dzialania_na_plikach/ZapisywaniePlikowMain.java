package com.dzialania_na_plikach;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZapisywaniePlikowMain {
    public static void main(String[]args){
        String path="com\\dzialania_na_plikach\\moj_plik.txt";

        try {
            FileWriter fileWriter = new FileWriter(path, true);//to true dodaje do pliku kolejne rzeczy
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //fileWriter = new FileWriter(path);
            bufferedWriter.write("jakiś ciąg znaków");
            bufferedWriter.newLine();//zeby kazde bylo w nowej linii lub:
            // bufferedWriter.write("jakiś ciąg znaków"  \n); dodajemy na koniec \n
            bufferedWriter.write("kolejna linijka teksrtu");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("bład na operacjach z plikiem!");
        }finally {

        }

    }
}
