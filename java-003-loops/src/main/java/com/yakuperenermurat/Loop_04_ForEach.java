package com.yakuperenermurat;

public class Loop_04_ForEach {
    public static void main(String[] args) {
        String student1 = "Barış";
        String student2 = "İbrahim";
        String student3 = "Emre";
        String student4 = "Osman";

        System.out.println(student1 +' ' + student2 +' ' + student3 +' ' + student4);

        System.out.println("-------------------");

        String [] students = {"Barış" , "İbrahim" , "Emre" , "Osman","Ertuğrul"};
        System.out.println(students);
        System.out.println(students[0]+" "+students[1]+" "+students[2]+" "+students[3]);

        System.out.println("---FOR1-------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----FOR2-------------");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----FOR3----String-----FOR EACH----");

        for ( String student : students ){
            System.out.println(student);

        }
        System.out.println("----FOR3----int-----FOR EACH----");

        int [] arrYears = {2000 , 2005, 2008 , 2017 ,2024};
        for ( int year : arrYears ){
            System.out.println(year);

        }
    }
}
