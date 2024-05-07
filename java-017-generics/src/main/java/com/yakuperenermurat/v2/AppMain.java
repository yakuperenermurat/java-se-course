package com.yakuperenermurat.v2;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {
    public static void main(String[] args) {
        Personel obj = new Personel();
        obj.ekranaYaz();

        System.out.println("------------------");

        obj.ekranaYaz(10,"Mehmet AYDIN");

        System.out.println("------------------");

        obj.ekranaYaz(10.4f,"Mehmet AYDIN");

        System.out.println("------------------");

        obj.ekranaYaz(10.6,"Mehmet AYDIN");

        System.out.println("------------------");

        obj.ekranaYaz(10,"Mehmet" , "AYDIN");

        System.out.println("------------------");

        obj.ekranaYaz(10L,"Mehmet" , "AYDIN");

        System.out.println("------------------");

        LinkedList <Integer> ogrenciNoListe = new LinkedList();
        ogrenciNoListe.add(10);
        ogrenciNoListe.add(20);
        ogrenciNoListe.add(30);

        ArrayList<String> ogrenciAdList = new ArrayList();
        ogrenciAdList.add("Mehmet");
        ogrenciAdList.add("Murat");
        ogrenciAdList.add("Kemal");

        obj.ekranaYaz(ogrenciNoListe,ogrenciAdList);




    }
}
