package com.yakuperenermurat;

public class AppMain {
    public static void main(String[] args) {
        Yatirimci yatirimci1 = new Yatirimci();
        Yatirimci yatirimci2 = new Yatirimci("Yakup","Ermurat","Merkez",
                123456789L,"6541656565653241234",1_000_000.55F);
        Yatirimci yatirimci3 = new Yatirimci("Ender","Morkoc");


        System.out.println("--------------------------");

        yatirimci1.setAdi("Mehmet");
        yatirimci1.setSoyadi("Aydin");
        yatirimci1.setHesapNo(11111111L);
        yatirimci1.setSubesi("Samandira");
        yatirimci1.setIbanNo("4132331412321312331231");
        yatirimci1.setHesapTutari(25_000_45F);


        System.out.println(yatirimci1);
        System.out.println(yatirimci2);

        yatirimci3.setHesapNo(222222222L);
        yatirimci3.setSubesi("Madenler");
        yatirimci3.setIbanNo("123452342312321312331231");
        yatirimci3.setHesapTutari(55_000_88F);

        System.out.println(yatirimci3);

        System.out.println("--------------------------");

        System.out.println(yatirimci2.getAdi() + " " +
                yatirimci2.getSoyadi() + " " +
                yatirimci2.getHesapNo());

        yatirimci1.bigisiniVer();
    }

}