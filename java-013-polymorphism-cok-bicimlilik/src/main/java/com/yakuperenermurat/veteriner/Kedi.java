package com.yakuperenermurat.veteriner;

import com.yakuperenermurat.base.Hayvan;

public class Kedi extends Hayvan {


    public Kedi() {

        System.out.println("Kedi");
    }
    @Override

    public void sesVer(){
        System.out.println("Kedi : Miyav.");
    }
    @Override

    public void hareketeGec (){
        System.out.println("Kedi : Harekete gecti. ");
    }
}
