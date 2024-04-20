package com.yakuperenermurat;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString (callSuper = true)
public class Yazilimci extends Personel {

   private String calismaDurumu;
/*
    public Yazilimci(String adi, String soyadi, String telefonNo, String departmani,
                     String sicilNo, String tahsilDurumu, short tecrubeYili,
                     String calismaDurumu) {
        super(adi, soyadi, telefonNo, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.calismaDurumu = calismaDurumu;

    }

 */
public void bilgisiniYaz(Yazilimci yazilimci){
   System.out.println("Adı: " + yazilimci.getAdi());
   System.out.println("Sicil No: " + yazilimci.getSicilNo());
   System.out.println("Soyadı: " + yazilimci.getSoyadi());
   System.out.println("Tahsil Durumu: " + yazilimci.getTahsilDurumu());
   System.out.println("Sicil No.: " + yazilimci.getSicilNo());
   // TODO bu kısma gelecek şeyler var.

   System.out.println("Çalışma Durumu: " + yazilimci.getCalismaDurumu());
}

}
