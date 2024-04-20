package com.yakuperenermurat.tasit;

import com.yakuperenermurat.kural.HavacikDernegi;
import com.yakuperenermurat.kural.Kanun;
import com.yakuperenermurat.base.Arac;
import lombok.*;

@Setter
@Getter
@ToString (callSuper = true)
public class Ucak extends Arac implements Kanun , HavacikDernegi {
    @Override
    public int hizSibiri() {
        return 35_000;
    }

    @Override
    public String bakimDurumu() {
        return "Haftalık";
    }

    @Override
    public int tasitVergi() {
        return 18_000;
    }

    @Override
    public Boolean dernekUyeDurumu() {
        return true;
    }

    @Override
    public int aidat() {
        return 2_000;
    }
}
