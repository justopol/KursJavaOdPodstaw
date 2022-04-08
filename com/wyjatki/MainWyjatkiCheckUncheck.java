package com.wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainWyjatkiCheckUncheck {
    public static void main(String[]args){
        File file = new File("lokalizacja_pliku/plikDoWczyt.txt");
//                check exception
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        SQLException
//        uncheck exception
//        NullPointerException, ArrayIndexOutOfBoundsException
    }
}
