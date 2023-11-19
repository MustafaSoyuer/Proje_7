package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;
import com.mustafa.repository.Hayvan;

public abstract class Surungen implements Hayvan {
    private String tur;
    private int yas;
    private BeslenmeSekli beslenmeSekli;

    public Surungen(String tur, int yas, BeslenmeSekli beslenmeSekli) {
        this.tur = tur;
        this.yas = yas;
        this.beslenmeSekli = beslenmeSekli;
    }

    public abstract void deriDegistir();

    public void yemekYe(){
        System.out.println(getClass().getSimpleName()+" sürüngen yemek yiyor");
    }


    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Surungen{" +
                "tur='" + tur + '\'' +
                ", yas=" + yas +
                '}';
    }
}
