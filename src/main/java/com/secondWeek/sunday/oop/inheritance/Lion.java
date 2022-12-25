package com.secondWeek.sunday.oop.inheritance;

public class Lion extends Animal {

    private String yeleRenk;
    private int kukremeDesibeli;

    public void kukre(){
        System.out.println("Aslan kükredi.");
    }

    public String getYeleRenk() {
        return yeleRenk;
    }

    public void setYeleRenk(String yeleRenk) {
        this.yeleRenk = yeleRenk;
    }

    public int getKukremeDesibeli() {
        return kukremeDesibeli;
    }

    public void setKukremeDesibeli(int kukremeDesibeli) {
        this.kukremeDesibeli = kukremeDesibeli;
    }
}
