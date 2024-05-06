package com.yakuperenermurat._05_;

import java.util.*;

public class MySet {
    public static void main(String[] args) {

        Set<String> studetList1 = new HashSet<>();
        HashSet<String> studentList2 = new HashSet<>();

        Set<String> studetList3 = new TreeSet<>();
        TreeSet<String> studentList4 = new TreeSet<>();

        Set<String> studetList5 = new LinkedHashSet<>();
        LinkedHashSet<String> studentList6 = new LinkedHashSet<>();

        studentList2.add("Abdullah");
        studentList2.add("Fevzi");
        studentList2.add("Furkan");
        studentList2.add("Gözde");
        studentList2.add("Barış");
        studentList2.add("Barış");
        studentList2.add("Barış");
        studentList2.add("İsmail");
        studentList2.add("Veysel");
        studentList2.add("Öykü");
        studentList2.add(null);

        System.out.println("HashSet: " + studentList2);

        studentList4.add("Abdullah");
        studentList4.add("Fevzi");
        studentList4.add("Furkan");
        studentList4.add("Gözde");
        studentList4.add("Veysel");
        studentList4.add("Barış");
        studentList4.add("Barış");
        studentList4.add("Barış");
        studentList4.add("Öykü");
        studentList4.add("İsmail");
        // studentList4.add(null); //OLMAZ!!!!

        System.out.println("TreeSet: " + studentList4);

        studentList6.add("Abdullah");
        studentList6.add("Fevzi");
        studentList6.add("Furkan");
        studentList6.add("Gözde");
        studentList6.add("Veysel");
        studentList6.add("Barış");
        studentList6.add("Barış");
        studentList6.add("Barış");
        studentList6.add("Öykü");
        studentList6.add("İsmail");
        studentList6.add(null);

        System.out.println("LinkedHashSet: " + studentList6);
    }
}
