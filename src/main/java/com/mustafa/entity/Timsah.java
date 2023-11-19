package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;

public class Timsah extends Surungen{

    public Timsah(String tur, int yas, BeslenmeSekli beslenmeSekli) {
        super(tur, yas, beslenmeSekli);
    }

    @Override
    public void deriDegistir() {
        System.out.println("Timsah deri değiştiriyor.");
    }

    @Override
    public void sesCikar() {
        System.out.println("Timsah ses çıkarıyor");
    }
}
