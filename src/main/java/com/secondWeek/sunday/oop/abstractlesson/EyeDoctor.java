package com.secondWeek.sunday.oop.abstractlesson;

public class EyeDoctor extends AbstractDoctor  {

    private int tecrubeYili;

  //  public EyeDoctor(int tecrubeYili){
   //     this.tecrubeYili = tecrubeYili;
 //   }

    public void uzmanlik(){
        System.out.println("Doktor lisans mezunudur.");
    }


    public int getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(int tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }

    @Override
    public void muayene() {
        System.out.println("göz numası kontrolü. ");

    }

    @Override
    public void maasZamHesaplama(Integer mevcutMaas, int calistigiYilSuresi, int zamKatsayisi) {
        int yuzde10 = ((mevcutMaas * calistigiYilSuresi) * 10) / 100;
        mevcutMaas = ( mevcutMaas * calistigiYilSuresi * zamKatsayisi) + yuzde10;
        System.out.println(mevcutMaas);

    }

}
