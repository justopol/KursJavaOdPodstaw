package com.wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjatekPrzenoszenie {
    public void wyjatkowaMetoda() throws FileNotFoundException{// przezucamy wyzej bosluge
        //File file = new File("plik.txt"); - mozna przeniesc wewnatrz try
        File file = new File("plik.txt");
        InputStream inputStream  = new FileInputStream(file);


    }
}
