package com.secondWeek.saturday.kapsam;

public class Scope {
    /**
     * Değişkenler tanıtıldıkları yerdeki blok içerisindeki yaşam süresidir.
     *
     */


    public int sayi = 5; // nesne değişkeni / instance variable

    public static void main(String[] args) {

        int sayi = 3;
        String isim = "Fırat"; // Yerel değişken / local variable

        for (int i = 0; i <5; i++) {
            int yas = i; //blok içerisindeki yerel değişkenler.
            isim = "Fırat";
        }
    }

    public void toplama(int ilkSayi, int ikinciSayi){
        int deger = 0;
    }

    /**
     * Aynı kapsamda aynı isimli iki değişken bulunamaz.
     * Aynı kapsamda biri yerel, biri nesne değişkeni oalcak şekilde iki değişken bulunabilir.
     */


}
