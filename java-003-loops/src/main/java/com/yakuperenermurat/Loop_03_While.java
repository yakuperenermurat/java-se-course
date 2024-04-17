package com.yakuperenermurat;

public class Loop_03_While {
    public static void main(String[] args) {
        System.out.println("-------FOR-------");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        System.out.println("-------WHİLE-------");
        int i= 0;
        while (i < 4) {    //SART
            System.out.println(i);
            i++;;  //ARTIS YA DA AZALIM MIKTARI
        }
        System.out.println("-------DO WHİLE-------");
        int j = 0;  // BASLANGIC

        do {// EN AZ 1 KERE CALISIR
                System.out.println(j);
                j++;
                ;  //ARTIS YA DA AZALIM MIKTARI
        }while (j < 4);//SART
    }
}
