package com.thirdWeek.sunday.polimorfizm.personhiyerarsi;

public class Employee {

    private int tckn;
    private String adi;
    protected int calistigiYil;

    public void work(){
        System.out.println("Person çalışır");
    }

    public int maasHesapla(){
        int maas = getCalistigiYil() * 500;
        return maas;

    }

    public int getTckn() {
        return tckn;
    }

    public void setTckn(int tckn) {
        this.tckn = tckn;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getCalistigiYil() {
        return calistigiYil;
    }

    public void setCalistigiYil(int calistigiYil) {
        this.calistigiYil = calistigiYil;
    }
}
