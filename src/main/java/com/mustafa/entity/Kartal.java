package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;
import com.mustafa.repository.Hayvan;

public class Kartal implements Hayvan {
    private String tur;
    private BeslenmeSekli beslenmeSekli;

    public Kartal(String tur, BeslenmeSekli beslenmeSekli) {
        this.tur = tur;
        this.beslenmeSekli = beslenmeSekli;
    }

    @Override
    public void sesCikar() {
        System.out.println("Kartal ses çıkarıyor.");
    }

    @Override
    public void yemekYe() {
        System.out.println("Kartal yemek yiyor");
    }

    @Override
    public String toString() {
        return "Kartal{" +
                "tur='" + tur + '\'' +
                ", beslenmeSekli=" + beslenmeSekli +
                '}';
    }
}
