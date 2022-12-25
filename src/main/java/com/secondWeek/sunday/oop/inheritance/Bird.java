package com.secondWeek.sunday.oop.inheritance;

public class Bird extends Animal {

    private String gagaYapisi;
    private String kanatAcikligi;
    private int maxHiz;
    private int ucusMenzili;

    public void ot(){
        System.out.println("Kuş ötüyor");
    }


    public String getGagaYapisi() {
        return gagaYapisi;
    }

    public void setGagaYapisi(String gagaYapisi) {
        this.gagaYapisi = gagaYapisi;
    }

    public String getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(String kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }

    public int getUcusMenzili() {
        return ucusMenzili;
    }

    public void setUcusMenzili(int ucusMenzili) {
        this.ucusMenzili = ucusMenzili;
    }

    @Override
    public void feed() {
        System.out.println("Bird id fed mama");
    }

    public void flying() {
        System.out.println("Bird is flied");
    }

}
