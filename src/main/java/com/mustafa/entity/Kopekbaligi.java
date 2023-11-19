package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;
import com.mustafa.repository.Hayvan;

public class Kopekbaligi implements Hayvan {
    private String tur;

    private BeslenmeSekli beslenmeSekli;

    public Kopekbaligi(String tur, BeslenmeSekli beslenmeSekli) {
        this.tur = tur;
        this.beslenmeSekli = beslenmeSekli;
    }

    @Override
    public void sesCikar() {
        System.out.println("Köpekbalığı ses çıkarıyor.");
    }

    @Override
    public void yemekYe() {
        System.out.println("Köpekbalığı yemek yiyor.");
    }

    @Override
    public String toString() {
        return "Kopekbaligi{" +
                "tur='" + tur + '\'' +
                ", beslenmeSekli=" + beslenmeSekli +
                '}';
    }
}
