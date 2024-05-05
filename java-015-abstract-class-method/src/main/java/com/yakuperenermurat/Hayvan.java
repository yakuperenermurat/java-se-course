package com.yakuperenermurat;

public abstract class Hayvan {

    public           void yemekYe() {
        System.out.println("Hayvan: yemekYe");
    }

    public abstract void sesVer();
    protected abstract void hareketEt();
    protected abstract void bilgisiniGetir();


    protected void suIc() {
        System.out.println("Hayvan: su iç");
    }

}
