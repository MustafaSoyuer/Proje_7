package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;

public class Keci extends Memeli{

    public Keci(String tur, int yas, BeslenmeSekli beslenmeSekli) {
        super(tur, yas, beslenmeSekli);
    }

    @Override
    public void emzir() {
        System.out.println("Keçi yavrusunu emziriyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println("Keçi ses çıkarıyor");
    }


}
