package com.yakuperenermurat.departman;

import com.yakuperenermurat.base.Personel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Mudur extends Personel {

    private Boolean makamAraci;

    public Mudur() {
    }

    public Mudur(String adi, String soyadi, String telefonNo, String departmani,
                 int sicilNo, String tahsilDurumu, short tecrubeYili,
                 Boolean makamAraci) {
        super(adi, soyadi, telefonNo, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.makamAraci = makamAraci;
    }
    public void bilgisiniYaz(Mudur mudur){
        System.out.println("Adı: " + mudur.getAdi());
        System.out.println("Sicil No: " + mudur.getSicilNo());
        System.out.println("Soyadı: " + mudur.getSoyadi());
        System.out.println("Tahsil Durumu: " + mudur.getTahsilDurumu());
        System.out.println("Sicil No.: " + mudur.getSicilNo());
        // TODO bu kısma gelecek şeyler var.

        System.out.println("Makam Araç Durumu: " + mudur.getMakamAraci());
    }
}

