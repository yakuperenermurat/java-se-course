package com.yakuperenermurat.veteriner;

import com.yakuperenermurat.base.Hayvan;

public class Kopek extends Hayvan {


    public Kopek() {

        System.out.println("Kopek");
    }
    @Override

    public void sesVer(){
        System.out.println("Kopek : Hav hav.");
    }
}