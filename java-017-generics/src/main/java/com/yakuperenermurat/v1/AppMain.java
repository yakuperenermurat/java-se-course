package com.yakuperenermurat.v1;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {


        ArrayList myArrayList1 = new ArrayList();

        myArrayList1.add("A");
        myArrayList1.add(10);
        myArrayList1.add(true);

        ArrayList <String> myArrayList2 = new ArrayList();

        myArrayList2.add("B");

        PersonelList  myPersonelList1 = new PersonelList();

        PersonelList <String> myPersonelList2 = new PersonelList();

        myPersonelList2.addMyList("Emre");
        myPersonelList2.addMyList("Ali");
        myPersonelList2.addMyList("Fatma");
        System.out.println(myPersonelList2.listeyiGetir());

        PersonelList <Integer> myPersonelList3 = new PersonelList();
        myPersonelList3.addMyList(100);
        myPersonelList3.addMyList(123);
        myPersonelList3.addMyList(456);
        System.out.println(myPersonelList3.listeyiGetir());

        PersonelList <Float> myPersonelList4 = new PersonelList();
        myPersonelList4.addMyList(0.5f);

        PersonelList <Character> myPersonelList5 = new PersonelList();
        myPersonelList5.addMyList('A');

        PersonelList <Personel> myPersonelList6 = new PersonelList();

        // TODO bunu yapmaya calıs - odev
        Personel personel1 = new Personel();
        personel1.setAdi("Emre");
        personel1.setSoyadi("KOCAN");
        personel1.setYasi(20);
        myPersonelList6.addMyList(personel1);

        myPersonelList6.addMyList(new Personel(25,"Batikan" , "Tizer"));

        System.out.println(myPersonelList6.listeyiGetir());

    }
}