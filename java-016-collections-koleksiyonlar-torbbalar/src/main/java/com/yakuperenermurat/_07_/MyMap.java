package com.yakuperenermurat._07_;

import java.sql.SQLOutput;
import java.util.*;

public class MyMap {
    public static void main(String[] args) {

        //Key Value

        Map <String , String> mapList1 = new HashMap();

        mapList1.put("Ankara" , "06");
        mapList1.put("Konya" , "42");
        mapList1.put("İzmir" , "35");
        mapList1.put("Trabzon", "61");
        mapList1.put(null , "01");
        mapList1.put("Ağrı" , null);
        mapList1.put(null , null);


        System.out.println("HashMap: " + mapList1);

        System.out.println("-----------------");

        Map <String , String> mapList2 = new LinkedHashMap<>();

        mapList2.put("Ankara" , "006");
        mapList2.put("Ankara" , "06");
        mapList2.put("Konya" , "42");
        mapList2.put("İzmir" , "35");
        mapList2.put(null , "01");
        mapList2.put("Trabzon", "61");
        mapList2.put("Ağrı" , null);
        mapList2.put(null , null);
        mapList2.put("Ankara" , "1453 ");

        System.out.println("LinkedHashMap: " + mapList2);

        System.out.println("-----------------");

        Map <String , String> mapList3 = new TreeMap<>();

        mapList3.put("Ankara" , "006");
        mapList3.put("Ankara" , "06");
        mapList3.put("Konya" , "42");
        mapList3.put("İzmir" , "35");
        //  mapList3.put(null , "01");  // key tarafı null olamaz!!
        mapList3.put("Trabzon", "61");
        mapList3.put("Ağrı" , null);
        // mapList3.put(null , null);
        mapList3.put("Ankara" , "1453 "); // key tarafı null olamaz!!!

        System.out.println("TreeMap: " + mapList3);

        System.out.println("-----------------");

        // FIXME plaka numralarının önündeki sıfır olacak sekilde sıralanacak
        Map <String , String> mapList4 = new TreeMap<>();

        mapList4.put("006" , "Ankara");
        mapList4.put("06" , "Ankara");
        mapList4.put("42" , "Konya");
        mapList4.put("35" , "İzmir");
        //  mapList4.put(null , "Adana");  // key tarafı null olamaz!!
        mapList4.put("61", "Trabzon");
        // mapList4.put(null , null);
        mapList4.put("1453" , "Ankara "); // key tarafı null olamaz!!!

        mapList4.remove("35");
        System.out.println("TreeMap: " + mapList4);

        for (String anahtar : mapList4.keySet()) {
            System.out.println(anahtar);
        }

        System.out.println("-----------------");

        for (String deger : mapList4.values()) {
            System.out.println(deger);
        }

        System.out.println("-----------------");

        for (String anahtar : mapList4.keySet()) {
            System.out.println(anahtar + " " + mapList4.get(anahtar));
        }

        System.out.println("-------------------");

        Map <String , String> mapList5 = new Hashtable<>();

        mapList5.put("Ankara" , "06");
        mapList5.put("Konya" , "42");
        mapList5.put("İzmir" , "35");
        mapList5.put("Trabzon", "61");
        mapList5.put("Adana", "01");
        mapList5.put("Çankırı", "18");
        mapList5.put("Kastamonu", "37");
       // mapList5.put(null , "01"); //Key null olamaz!!!!
       // mapList5.put("Ağrı" , null);  //Value null olmaz !!!
       /// mapList5.put(null , null);  //Key null olmaz !!!


        System.out.println("Hashtable: " + mapList5);

        // TODO sort yapılacak!
        // A ' dan Z 'ye  Z' den A'ya
        // 0 ' dan 9 ' a  9'dan 0 'a

    }
}
