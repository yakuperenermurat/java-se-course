package com.yakuperenermurat;

public class Loop_01_For {
    public static void main(String[] args)
    {
       /*
        int a = 10;

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        int b = 20;

        for (int i = 0; i < 8; i++) {
            System.out.println(b);

        }

        */
        String firstName = "Uğur";
        String LastName = "Semiz";

        for (int counter = 0;  counter < 5;  counter++) {
            System.out.println( counter + " - " +firstName + ' ' + LastName);

        }

        System.out.println("--------------------------");
        for (int i = 0; i <3 ; i++) {
            System.out.println(i);
        }
/*      i++;
        i = i+1;
 */
        System.out.println("--------KADEMELİ ARTTIRMA----------");
        for (int i = 0; i <100 ; i=i+4) {
            System.out.println(i);
        }
        System.out.println("--------AZALTMA----------");
        for (int i = 0; i <100 ; i--) {
            System.out.println(i);
        }
        System.out.println("--------KADEMELİ AZALTMA----------");
        for (int i = 0; i <100 ; i=i-8) { // i -= 8
            System.out.println(i);
        }

    }
}