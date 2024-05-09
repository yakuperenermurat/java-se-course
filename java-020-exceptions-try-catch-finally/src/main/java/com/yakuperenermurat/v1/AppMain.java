package com.yakuperenermurat.v1;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {

        try {
            //code
            int sonuc = 2 / 0 ;
            System.out.println(sonuc);
        }catch (Exception e) {
            //code
            //logs
            System.out.println("Hata: " + e);
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("----------------------");


        try {
            //code
            int sonuc = 2 / 0 ;
            System.out.println(sonuc);
        }catch (Exception e) {
            //code
            //logs
            System.out.println("Hata: " + e);
            System.out.println("Hata: " + e.getMessage());
        }finally {
            //scope her zaman calısacak kodlar
            System.out.println("Teşekkür ederiz. " + new Date());
        }

        System.out.println("--------------------");

        try {
           sifiraBolmeHatasi();
        }catch (Exception e) {
            System.out.println("Hata: " + e);
        }finally {
            //scope her zaman calısacak kodlar
            System.out.println("Teşekkür ederiz. ");
        }


    }

    private static void sifiraBolmeHatasi() {

        int sonuc = 2 / 0 ;
       // throw new ArithmeticException("ArithmeticException meydana geldi");
    }
}