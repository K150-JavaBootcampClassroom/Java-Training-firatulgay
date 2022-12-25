package com.secondWeek.saturday.oop.constructur;

public class DortIslem {
    private int toplam;
    private int cikar;
    private double bol;
    private int carp;

    public DortIslem(int toplam){
        this.toplam = toplam;
    }

    public int getToplam() {
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }

    public int getCikar() {
        return cikar;
    }

    public void setCikar(int cikar) {
        if(cikar < 0){
            System.out.println("Çıkarma işlemi sonucu negatif olamaz.");
            return;
        }
        this.cikar = cikar;

    }

    public double getBol() {
        return bol;
    }

    public void setBol(double bol) {
        this.bol = bol;
    }

    public int getCarp() {
        return carp;
    }

    public void setCarp(int carp) {
        this.carp = carp;
    }
}
