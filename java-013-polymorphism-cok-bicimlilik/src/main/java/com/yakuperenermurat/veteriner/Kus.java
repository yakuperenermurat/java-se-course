package com.yakuperenermurat.veteriner;

import com.yakuperenermurat.base.Hayvan;

public class Kus extends Hayvan {


    public Kus() {

        System.out.println("Kuş");
    }
    @Override

    public void sesVer(){
        System.out.println("Kus : Cikcik.");
    }
}