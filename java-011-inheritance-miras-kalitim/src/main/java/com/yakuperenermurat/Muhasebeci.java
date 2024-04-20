package com.yakuperenermurat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Muhasebeci extends Personel{

    private String Unvani;
    private Boolean YeminDurumu;

    public void bilgisiniYaz(Muhasebeci muhasebeci){
        System.out.println("Adı: " + muhasebeci.getAdi());
        System.out.println("Sicil No: " + muhasebeci.getSicilNo());
        System.out.println("Soyadı: " + muhasebeci.getSoyadi());
        System.out.println("Tahsil Durumu: " + muhasebeci.getTahsilDurumu());
        System.out.println("Sicil No.: " + muhasebeci.getSicilNo());


        String yemin;
        if(muhasebeci.getYeminDurumu()) { // true
            yemin = "Yeminli";
        }else {
            yemin = "Yeminsiz";
        }

        System.out.println("Yemin Durumu:" + yemin);
        System.out.println("Ünvan: " + muhasebeci.getUnvani());
        // TODO bu kısma gelecek şeyler var.

    }
}
