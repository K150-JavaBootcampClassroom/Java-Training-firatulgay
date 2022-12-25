package com.secondWeek.sunday.oop.inheritance;

public class Dog extends Animal{

    private String kopekCinsi;
    private boolean egitimliMi;

    public void havla (){
        System.out.println("Köpek havladı");
    }


    public String getKopekCinsi() {
        return kopekCinsi;
    }

    public void setKopekCinsi(String kopekCinsi) {
        this.kopekCinsi = kopekCinsi;
    }

    public boolean isEgitimliMi() {
        return egitimliMi;
    }

    public void setEgitimliMi(boolean egitimliMi) {
        this.egitimliMi = egitimliMi;
    }
}
