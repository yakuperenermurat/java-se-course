package com.yakuperenermurat.tasit;

import com.yakuperenermurat.kural.Kanun;
import com.yakuperenermurat.base.Arac;
import lombok.*;

@Setter
@Getter
@ToString (callSuper = true)
public class Bisiklet  extends Arac implements Kanun {
    @Override
    public int hizSiniri() {
        return 30;
    }

    @Override
    public String bakimDurumu() {
        return "Mart";
    }

    @Override
    public int tasitVergi() {
        return 0;
    }
}
