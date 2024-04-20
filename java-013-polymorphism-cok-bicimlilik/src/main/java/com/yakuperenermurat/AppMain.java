package com.yakuperenermurat;

import com.yakuperenermurat.bahce.Ayi;
import com.yakuperenermurat.base.Hayvan;
import com.yakuperenermurat.veteriner.Kedi;
import com.yakuperenermurat.veteriner.Kopek;
import com.yakuperenermurat.veteriner.Kus;

public class AppMain {
    public static void main(String[] args) {



       Kedi kedi = new Kedi();
        System.out.println("--------------");
       Kopek kopek = new Kopek();
        System.out.println("---------------");
       Kus kus = new Kus();

       kedi.sesVer();
       kopek.sesVer();
       kus.sesVer();

        System.out.println("--------------");
        if (kedi instanceof Hayvan){
            System.out.println("Evet: " + kedi);
        }else{
            System.out.println("Hayır: " + kedi);
        }
        System.out.println("----------------");

        Hayvan hayvan = new Hayvan();
        // hayvan.sesVer();

        System.out.println("----------------");

        Ayi ayi = new Ayi();
        ayi.sesVer();
    }


}