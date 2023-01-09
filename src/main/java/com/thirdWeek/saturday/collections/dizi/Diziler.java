package com.thirdWeek.saturday.collections.dizi;

import java.util.Arrays;

public class Diziler {

    public static void main(String[] args) {

        /**
         * Aynı türden verileri tutarlar
         * Sıralı tutarlar
         * uzunlukları sabittir. Başlarken verilmelidir.
         * @param args
         */


        Integer[] sayiDizi = new Integer[3];
        sayiDizi[0] = 4;   //0'ıncı indexe eleman ekleniyor
        sayiDizi[1] = 5;
        sayiDizi[2] = 8;
        System.out.println();
       // sayiDizi[3] = 10; // 3. indexi yoktur. Runtime hatası alır.

        Integer[] strDizisi = {3, 4, 5};

        int[] sayiDizi2 = new int[3];

        /**
         * nesne tanımlanabilir
         */
        Ogretmen[] ogretmenDizisi = new Ogretmen[4];
        ogretmenDizisi[0] = new Ogretmen();
        ogretmenDizisi[1] = new Ogretmen();

        for (int i = 0; i < ogretmenDizisi.length; i++) {

        }

        for (Ogretmen ogretmen : ogretmenDizisi) {
            if (ogretmen != null)
            ogretmen.setAdi("Akın");
        }




        /**
         * dizinin son değerini alma
         */
        int[] arrDizi = new int[5];
        arrDizi[0] = 28;
        arrDizi[arrDizi.length - 1] = 234;


        //foreach

        for (int i = 0; i < arrDizi.length ; i++) {
            int i1 = arrDizi[i];
        }


        for (int diziElamani : arrDizi) {
            System.out.println(diziElamani);
        }


        int[] arr = new int[5];
        char c = 'c';
        long longValue = 10;
        String str = "Doruk";

        arr[1] = c;
//        arr[2]= longValue;
     //   arr[4]= str;
        arr[4]= 5;
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        System.out.println((int) c);


        /**
         * Dizi uzunluğu .length methodu ile alınır.
         */
        int[] dizi = new int[5];
        int length = dizi.length;
//        System.out.println("Dizinin uzunluğu:" + length);


        /**
         * Dizi uzunluğu
         */
        Integer[] dizi2 = new Integer[5];
        dizi2[0] = 5;
        dizi2[1] = 23;
        dizi2[2] = 12;
        dizi2[3] = 213;
        dizi2[4] = 2156;

        //dizi2.length yaparsam ne olur??
        for (int i = 0; i <= dizi2.length-1; i++) {
            int dizininDegeri = dizi2[i];
            System.out.println(dizininDegeri);
        }

        System.out.println("dizi2 nin 1. indexi, 2. elemanı: " + dizi2[1]);

        Integer ikinciDeger = dizi2[1];
        Integer ikinciIndexDegeri = dizi2[2];

        int toplam = dizi2[1] + ikinciIndexDegeri;
        System.out.println(toplam);


        String[] isimDizisi = {"Fırat", "Murat", "Batuhan"};
        for (String isim : isimDizisi) {
            System.out.println(isim);
        }

        Ogretmen birinciOgretmen = new Ogretmen();
        birinciOgretmen.setAdi("Ahmet");

        Ogretmen ikinciOgretmen = new Ogretmen();
        ikinciOgretmen.setAdi("Mehmet");

        Ogretmen[] ogretmenDizi = new Ogretmen[2];
        ogretmenDizi[0] = birinciOgretmen;
        ogretmenDizi[1] = new Ogretmen();

        ogretmenDizi[1].getAdi();

        for (Ogretmen ogretmen : ogretmenDizi) {
            String adi = ogretmen.getAdi();
        }

        /**
         * Arrays.sort Arrays.equals
         */

        Arrays.sort(dizi2);

    }
}
