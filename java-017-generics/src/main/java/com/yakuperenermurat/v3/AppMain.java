package com.yakuperenermurat.v3;

public class AppMain {
    public static void main(String[] args) {
        Personel <Integer , String > personel1 =
                new Personel<>(100,"Mehmet");
        Personel <Long , String > personel2 =
                new Personel<>(100L,"Mehmet");
        Personel <Short , String > personel3 =
                new Personel<>((short)100,"Mehmet");
        Personel <Byte , String > personel4 =
                new Personel<>((byte)1100,"Mehmet");

        personel1.yazdir();
        personel2.yazdir();
        personel3.yazdir();
        personel4.yazdir();
    }
}
