package com.yakuperenermurat._01_;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> myList1 = new LinkedList<>();

        myList1.add(10);   // index 0
        myList1.add(8);   // index 1
        myList1.add(20);   // index 2
        myList1.add(7);   // index 3
        myList1.add(7);   // index 4
        myList1.add(7);   // index  5
        myList1.add(null);   // index 6

        System.out.println("Liste1 elemanları : " + myList1);

        System.out.println("----------------");

        LinkedList<String> myList2 = new LinkedList<>();
        myList2.add("Yakup"); // index 0
        myList2.add("Mehmet"); //index 1
        myList2.add("Adil");   // index 2
        myList2.add("Adil");   // index 3
        myList2.add("Adil");   // index 4
        myList2.add("Adil");   // index 5
       //  myList2.add(null);   // index 6

        myList2.add(1,"Batıkan");
        myList2.set(0,"Oğuz");

        myList2.addFirst("Kürsat");
        myList2.addLast("Osman");

        System.out.println("Liste2 elemanları : " + myList2);

        System.out.println("----------------");

        LinkedList<String> myList3 = new LinkedList<>();
        myList3.add("Yakup"); // index 0
        myList3.add("Mehmet"); //index 1
        myList3.add("Adil");   // index 2
        myList3.add("Adil");   // index 3
        myList3.add("Adil");   // index 4
        myList3.add("Adil");   // index 5
        myList3.add(null);   // index 6
        System.out.println("Liste3 elemanları : " + myList3);

        System.out.println("----------------");

        System.out.println("Liste1 icinde arama : " + myList1.contains(7));
        System.out.println("Liste2 icinde arama : " + myList2.contains("Mehmet"));
        System.out.println("Liste2 icinde arama : " + myList2.contains("Yakup"));

        System.out.println("-------------------");

        System.out.println("Liste1 ve Liste2 esit mi ? : " +
                myList1.equals(myList2));

        System.out.println("Liste2 ve Liste3 esit mi ? : " +
                myList2.equals(myList3));

        System.out.println("Liste1 ve Liste2 esit mi ? : " +
                (myList2 == myList3));

        LinkedList<String> myList4 = new LinkedList<>();

        System.out.println("Liste1 boyutu eleman sayisi : " +myList1.size());
        System.out.println("Liste2 boyutu eleman sayisi : " +myList2.size());
        System.out.println("Liste3 boyutu eleman sayisi : " +myList3.size());
        System.out.println("Liste4 boyutu eleman sayisi : " +myList4.size());

        System.out.println("Liste1 boş mu : " +myList1.isEmpty());
        System.out.println("Liste2 boş mu : " +myList2.isEmpty());
        System.out.println("Liste3 boş mu : " +myList3.isEmpty());
        System.out.println("Liste4 boş mu : " +myList4.isEmpty());

        myList3.add("Ender");
        myList3.add("Fatih");

        System.out.println("myList2.size" + myList2.size());
        System.out.println("myList3.size" + myList3.size());

        System.out.println(myList2);
        System.out.println(myList3);

        myList3.removeAll(myList2);

        System.out.println("Fark : " + myList3);

        myList3.add("Barış");

        System.out.println("Hash code 1 : " + myList1.hashCode());
        System.out.println("Hash code 2 : " + myList2.hashCode());
        System.out.println("Hash code 3 : " + myList3.hashCode());
        System.out.println("Hash code 4 : " + myList4.hashCode());

        myList4.add("Barış");
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());

        myList4.add("Gözde");
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());

        myList4.add(1,"Dilşat");
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());

        myList4.add(1,"Mustafa");
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());

        myList4.remove(1);
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());


        myList4.removeAll(myList4);
        // myList4.clear();
        System.out.println(myList4);
        System.out.println("Hash code 4 : " + myList4.hashCode());

        System.out.println("-----------------");

        Collections.sort(myList2);
        System.out.println("Liste2 elemanları sıralı : " + myList2);

        System.out.println("-----------------");

        for (String isim : myList2){
            System.out.println(isim + " - ");
        }

        System.out.println("İlk kayıt: " + myList2.get(0));
        System.out.println("Son kayıt: " + myList2.get(myList2.size() - 1));

        System.out.println("İlk kayıt: " + myList2.getFirst());
        System.out.println("Son kayıt: " + myList2.getLast());


    }
}
