package com.yakuperenermurat.v3;

public class IcıceTryCatch {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0 ;

        try {

            try{
                bolme = sayi1 / sayi2;
            }catch (ArithmeticException e ){
                System.out.println("Ic Hata: " + e);
            }
            toplam = sayi1 + sayi2;
            System.out.println("Toplama sonucu: " + toplam);

            bolme = sayi1 / sayi2;
            System.out.println("DIS bolme sonucu: " + bolme);

        }catch (Exception e) {
            System.out.println("Dıs Hata: " + e);
        }finally {

        }

    }

}
