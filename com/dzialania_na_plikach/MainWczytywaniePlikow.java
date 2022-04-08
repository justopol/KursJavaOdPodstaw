package com.dzialania_na_plikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWczytywaniePlikow {
    public static void main(String[]args){
        try {
            File file = new File("com\\dzialania_na_plikach\\plikDoWczyt.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }



        }catch(FileNotFoundException e){
            System.out.println("nie znaleziono przykładu");
        }
        System.out.println("koniec działania programu");
    }
}
