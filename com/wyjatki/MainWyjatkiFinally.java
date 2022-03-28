package com.wyjatki;

import java.util.Locale;
public class MainWyjatkiFinally {
    static String str = "String teksotwo";
    public static void main(String[]args){

        // finally - zawsze wykonhywany czy poszedl wyjatek czynie, mozna obslugiwac tez samo finnaly bez catch
        try{
            System.out.println("wszystko wielka litera " + str.toUpperCase());
            System.out.println("znak na miejscu 100:" + str.charAt(100));
        }catch (NullPointerException e){
            System.out.println("poszedl null");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("poszedl poza zakres");
        }finally {
            System.out.println("on i tak zawsze sie wykona");
        }
    }


}
