package com.secondWeek.saturday.oop.encapsulation;

import java.util.Objects;

public class Araba {
    private String renk;
    private int kapiSayisi;
    private int beygir;
    private String marka;
    private boolean sunRoof;

    public Araba(String renk, int kapiSayisi, int beygir, String marka) {

        this.renk = renk;
        this.kapiSayisi = kapiSayisi;
        this.beygir = beygir;
        this.marka = marka;

        System.out.println("Araba nesnesi oluştu...");
    }


    public Araba() {
        System.out.println("Araba nesnesi oluştu...");
    }

    public void calistir() {
        System.out.println("Araba çalıştı...");
    }

    public void printInfo() {
        System.out.println("Renk : " + this.renk);
        System.out.println("Kapı sayısı : " + this.kapiSayisi);
        System.out.println("Beygir : " + this.beygir);
        System.out.println("Marka : " + this.marka);
    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi < 0) {
            System.out.println("Kapı sayısı 0 dan küçük olamaz!!");
        }else if (kapiSayisi > 4){
            System.out.println("Kapı yasıısı 4 den büyük olamaz");
        }
        else{
            this.kapiSayisi = kapiSayisi;
        }
    }

    public int getBeygir() {
        return beygir;
    }

    public void setBeygir(int beygir) {
        this.beygir = beygir;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Araba araba = (Araba) o;
        return kapiSayisi == araba.kapiSayisi &&
                beygir == araba.beygir &&
                sunRoof == araba.sunRoof &&
                Objects.equals(renk, araba.renk) &&
                Objects.equals(marka, araba.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(renk, kapiSayisi, beygir, marka, sunRoof);
    }
}
