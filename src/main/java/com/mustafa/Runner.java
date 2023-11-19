package com.mustafa;

import com.mustafa.entity.*;
import com.mustafa.enums.BeslenmeSekli;

public class Runner {
    public static void main(String[] args) {

        Memeli fil = new Fil("Asya Fili", 10, BeslenmeSekli.OTUBUR);
        Kartal kartal = new Kartal("Sah Kartal",BeslenmeSekli.ETOBUR);
        Surungen timsah = new Timsah("Nil Timsahı",4,BeslenmeSekli.ETOBUR);
        Kopekbaligi kopekbaligi = new Kopekbaligi("Beyaz Köpekbalığı",BeslenmeSekli.ETOBUR);
        Memeli keci = new Keci("Ankara Keçisi",3,BeslenmeSekli.OTUBUR);

        System.out.println("Fil Türü: " + fil.getTur()); // get ile tur ve yas çağırma
        System.out.println("Fil Yaşı: " + fil.getYas());
        System.out.println();

        System.out.println(fil);
        fil.sesCikar();
        fil.yemekYe();
        fil.emzir();
        System.out.println();

        System.out.println(kartal);
        kartal.sesCikar();
        kartal.yemekYe();
        System.out.println();

        System.out.println(timsah);
        timsah.sesCikar();
        timsah.yemekYe();
        timsah.deriDegistir();
        System.out.println();

        System.out.println(kopekbaligi);
        kopekbaligi.sesCikar();
        kopekbaligi.yemekYe();
        System.out.println();

        System.out.println(keci);
        keci.sesCikar();
        keci.yemekYe();
        keci.emzir();






    }// main sonu
}// class sonu