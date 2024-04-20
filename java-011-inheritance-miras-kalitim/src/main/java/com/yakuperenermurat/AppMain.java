package com.yakuperenermurat;

public class AppMain {
    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Yakup");
        mudur.setSoyadi("ERMURAT");
        mudur.setTahsilDurumu("Üniversite");
        mudur.setMakamAraci(true);
        mudur.setSicilNo(123_456_789);

        mudur.bilgisiniYaz(mudur);

        System.out.println("---------------");

        Yazilimci yazilimci = new Yazilimci();
        yazilimci.setAdi("Mehmet");
        yazilimci.setSoyadi("AYDIN");
        yazilimci.setTahsilDurumu("Yüksek Lisans");
        yazilimci.setCalismaDurumu("Uzaktan");
        yazilimci.setSicilNo(777_456);
        yazilimci.setTecrubeYili((short)5);
        yazilimci.setDepartmani("ARGE");
        yazilimci.setTelefonNo("01154264321");

        System.out.println(yazilimci);
        System.out.println("---------------------");

        yazilimci.bilgisiniYaz(yazilimci);
        System.out.println("------------------");

        Muhasebeci muhasebeci = new Muhasebeci();

        muhasebeci.setAdi("Mücahit");
        muhasebeci.setSoyadi("KAYA");
        muhasebeci.setTahsilDurumu("Yüksek Lisans");
        muhasebeci.setUnvani("Mali Müşavir");
        muhasebeci.setSicilNo(777_456);
        muhasebeci.setTecrubeYili((short)5);
        muhasebeci.setDepartmani("Muhasebe");
        muhasebeci.setTelefonNo("23342414354");
        muhasebeci.setYeminDurumu(Boolean.TRUE);

        System.out.println(muhasebeci);
        muhasebeci.bilgisiniYaz(muhasebeci);



    }
}