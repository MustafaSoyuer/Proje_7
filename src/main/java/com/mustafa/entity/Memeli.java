package com.mustafa.entity;

import com.mustafa.enums.BeslenmeSekli;
import com.mustafa.repository.Hayvan;

public abstract class Memeli implements Hayvan {
    private String tur;
    private int yas;
    private BeslenmeSekli beslenmeSekli;

    public Memeli(String tur, int yas, BeslenmeSekli beslenmeSekli) {
        this.tur = tur;
        this.yas = yas;
        this.beslenmeSekli = beslenmeSekli;
    }

    public abstract void emzir();

    public void yemekYe(){
        System.out.println(getClass().getSimpleName()+" 'memeli hayvan' yemek yiyor.");
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
        return "Memeli{" +
                "tur='" + tur + '\'' +
                ", yas=" + yas +
                ", beslenmeSekli=" + beslenmeSekli +
                '}';
    }
}
