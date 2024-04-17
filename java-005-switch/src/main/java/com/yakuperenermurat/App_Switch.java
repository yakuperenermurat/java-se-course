package com.yakuperenermurat;

public class App_Switch {
    public static void main(String[] args)
    {
        int secilen = 2 ;
        switch(secilen){
            case 0:
                System.out.println("Gidilecek menü : "  + secilen);
                break;
            case 1:
                System.out.println("Gidilecek menü : " + secilen);
                break;
            case 2:
                System.out.println("Gidilecek menü : " + secilen);
                break;
            case 3:
                System.out.println("Gidilecek menü : " + secilen);
                break;
            default:
                System.out.println("Ana menüye gidilecek. ");
                break;
        }
    }
}