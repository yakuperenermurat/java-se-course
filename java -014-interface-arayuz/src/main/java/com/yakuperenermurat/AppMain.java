package com.yakuperenermurat;

import com.yakuperenermurat.tasit.Taksi;
import com.yakuperenermurat.tasit.Ucak;

public class AppMain {
    public static void main(String[] args) {

        Ucak ucak = new Ucak();
        ucak.setMarka("Boeing");
        ucak.setKoltukSayisi((short)200);
        ucak.setTekerSayisi((short)12);

        System.out.println(ucak);
        System.out.println("bakimDurumu: " + ucak.bakimDurumu());
        System.out.println("tasitVergi: " + ucak.tasitVergi());
        System.out.println("dernekUyeDurumu: " + (ucak.dernekUyeDurumu() ? "EVET" : "HAYIR") );

        System.out.println("bakimDurumu: " + ucak.bakimDurumu());
        System.out.println("hizSiniri: " + ucak.hizSiniri());

        System.out.println("yolcuKapasitesi : " + ucak.yolcuKapasitesi());
        System.out.println("vizeDurumu: " + ucak.vizeDurumu());

        System.out.println("---------------");

        Taksi taksi = new Taksi();
        System.out.println("ruhsatDurumu : " + (taksi.ruhsatDurumu(Boolean.FALSE) ? "EVET" : "HAYIR") );
        System.out.println("ehliyetDurumu : " + (taksi.ehliyetDurumu(Boolean.TRUE) ? "EVET" : "HAYIR") );

    }
}