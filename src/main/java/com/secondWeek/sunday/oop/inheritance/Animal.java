package com.secondWeek.sunday.oop.inheritance;

//SuperClass - BaseClass
public class Animal {

    private String tür ;
    private String name;
    private boolean ayak ;
    private int kilo;
    private int boy ;
    private String renk;
    private boolean ucuyorMu;

    public void feed(){
        System.out.println("Animal has fed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public boolean isAyak() {
        return ayak;
    }

    public void setAyak(boolean ayak) {
        this.ayak = ayak;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isUcuyorMu() {
        return ucuyorMu;
    }

    public void setUcuyorMu(boolean ucuyorMu) {
        this.ucuyorMu = ucuyorMu;
    }
}
