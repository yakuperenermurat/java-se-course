package com.yakuperenermurat.v1;

import java.util.StringJoiner;

public class Personel {

    private int yasi;
    private String adi;
    private String soyadi;

    public Personel(int yasi, String adi, String soyadi) {
        this.yasi = yasi;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Personel() {

    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Personel.class.getSimpleName() + "[", "]")
                .add("yasi=" + yasi)
                .add("adi='" + adi + "'")
                .add("soyadi='" + soyadi + "'")
                .toString();
    }

}
