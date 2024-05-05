package com.yakuperenermurat;

import com.yakuperenermurat.bahce.Ayi;
import com.yakuperenermurat.base.Hayvan;
import com.yakuperenermurat.veteriner.Kedi;
import com.yakuperenermurat.veteriner.Kopek;
import com.yakuperenermurat.veteriner.Kus;
import com.yakuperenermurat.veteriner.VanKedisi;

public class AppMain {
    public static void main(String[] args) {


        Kedi kedi = new Kedi();
        System.out.println("--------------");

        Kopek kopek = new Kopek();
        System.out.println("---------------");

        Kus kus = new Kus();
        System.out.println("---------------");

        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();

        System.out.println("--------------");

        if (kedi instanceof Hayvan) {
            System.out.println("Evet: " + kedi);
        } else {
            System.out.println("Hayır: " + kedi);
        }

        System.out.println("----------------");

        Hayvan hayvan = new Hayvan();
        // hayvan.sesVer();

        System.out.println("----------------");

        Ayi ayi = new Ayi();
        ayi.sesVer();

        System.out.println("==================");


        Hayvan hayvanObj; // Nesne referansı - Nesne demek değildir.

        hayvanObj = new Kedi();
        hayvanObj.hareketeGec();

        hayvanObj = new Kedi();
        ((Kedi) hayvanObj).hareketeGec();
        System.out.println("--------------" + hayvanObj);

        hayvanObj = new Kopek();
        System.out.println("---------------" + hayvanObj);

        hayvanObj = new Kus();
        ((Kus) hayvanObj).yemYe();
        System.out.println("---------------" + hayvanObj);

        hayvanObj = new Hayvan();

        if (hayvanObj instanceof Hayvan)
            System.out.println(hayvanObj);

        System.out.println("---------------" + hayvanObj);

        hayvanObj = new VanKedisi();
        ((VanKedisi) hayvanObj).yemekYe();
        System.out.println("---------------" + hayvanObj);

        Kedi kediObj;
        kediObj = new VanKedisi();
        kediObj.sesVer();
        System.out.println("---------------" + kediObj);

        if (kediObj instanceof Object) {
            System.out.println(kediObj);
        }


    }


}