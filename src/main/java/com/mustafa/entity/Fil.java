package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;

public class Fil extends Memeli{

    public Fil(String tur, int yas, BeslenmeSekli beslenmeSekli) {
        super(tur, yas, beslenmeSekli);
    }

    @Override
    public void emzir() {
        System.out.println("Fil yavrusunu emziriyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println("Fil ses çıkarıyor.");
    }

}
