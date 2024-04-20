package com.yakuperenermurat;

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
        
    }
}