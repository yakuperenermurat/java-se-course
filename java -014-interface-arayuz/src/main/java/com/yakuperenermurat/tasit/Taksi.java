package com.yakuperenermurat.tasit;

import com.yakuperenermurat.kural.Kanun;
import com.yakuperenermurat.kural.UlastirmaDairesi;
import com.yakuperenermurat.base.Arac;
import lombok.*;

@Setter
@Getter
@ToString (callSuper = true)
public class Taksi extends Arac implements Kanun , UlastirmaDairesi {
    @Override
    public int hizSibiri() {
        return 120;
    }

    @Override
    public String bakimDurumu() {
        return "Haziran";
    }

    @Override
    public int tasitVergi() {
        return 1000;
    }

    @Override
    public Boolean ruhsatDurumu() {
        return Boolean.TRUE;
    }

    @Override
    public Boolean ehliyetDurumu() {
        return Boolean.TRUE;
    }
}
