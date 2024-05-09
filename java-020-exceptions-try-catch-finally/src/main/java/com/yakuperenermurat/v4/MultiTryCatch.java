package com.yakuperenermurat.v4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {
    public static void main(String[] args) {


        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        Float bolme ;

        Scanner input = new Scanner(System.in);

        boolean hataDurumuFlag = true;

        do {
            try {
                System.out.print("Lütfem 1. sayiyi giriniz: ");
                sayi1 = input.nextInt();

                System.out.print("Lütfem 2. sayiyi giriniz: ");
                sayi2 = input.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam: " + toplam);

                bolme = (float) sayi1 / (float) sayi2;
                System.out.println("Bolme: " + bolme);


            }catch (ArithmeticException e) {
                System.out.println("Hata Durumu: " + e);
            }catch (InputMismatchException e) {
                System.out.println("Hata Durumu: " + e);
               // hataDurumuFlag = false;
            }catch (RuntimeException e) {
                System.out.println("Hata Durumu: " + e);
              //  hataDurumuFlag = false;
            }catch (Exception e) {
                System.out.println("Hata Durumu: " + e);
               // hataDurumuFlag = false;

            }
            finally {
                hataDurumuFlag = false;
                System.out.println("-------------------");

            }
        }while (hataDurumuFlag);//False
    }
}
