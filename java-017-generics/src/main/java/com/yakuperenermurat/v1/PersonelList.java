package com.yakuperenermurat.v1;

import java.util.ArrayList;

public class PersonelList<T> {

    private T bilgi ;
    private Integer detay;

    ArrayList <T> myArrayPersonList = new ArrayList();

    public void addMyList(T veri) {

        myArrayPersonList.add(veri);
    }

    public  ArrayList <T> listeyiGetir() {
        return myArrayPersonList;
    }
}
