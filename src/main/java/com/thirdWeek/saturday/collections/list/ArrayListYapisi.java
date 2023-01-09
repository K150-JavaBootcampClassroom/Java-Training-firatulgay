package com.thirdWeek.saturday.collections.list;


import com.thirdWeek.saturday.collections.dizi.Ogretmen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListYapisi {
    public static void main(String[] args) {

        /**
         * hafızaları dinamik büyüyüp küçülebilir.
         * Listeyi oluşturduğumuz tipte veri eklememiz gerekir.
         * primitive tip kabul etmez. Sadece Nesne tipi alır.
         * Dizilere göre daha esnektir.
         */

        int s = 5;
        ArrayList numbers = new ArrayList();
        numbers.add("Fırat");
        numbers.add("Murat");
        numbers.add(s);
        numbers.add(new Ogretmen());

        /**
         *listeye veri ekleme
         */
        List<String> list = new ArrayList<>();
        list.add("Fırat");//0
        list.add("Doruk");//1

        /**
         * listeden veri alma
         */
        String str = list.get(0);
        System.out.println(str);

        /**
         * size
         */
        System.out.println("integer listesi uzunluğu: " + list.size());

        /**
         * Lİst verileri içerisinde dolanma
         */

        List<String> isimListesi = new ArrayList<>();
        isimListesi.add("Murat");
        isimListesi.add("Ahmet");
        isimListesi.add("Mehmet");
        isimListesi.add("Ayşe");
        isimListesi.add("Fatma");

        int sayac = 1;
        for (String isim : isimListesi) {
            System.out.println(sayac + ".Kullanıcı: " + isim);
            sayac++;
        }

        for (int i = 0; i < isimListesi.size(); i++) {
      //      System.out.println(i + ".Kullanıcı: " + isimListesi.get(i));
        }


        for (int i = 0 ; i < isimListesi.size(); i++) {
            String isim = isimListesi.remove(i);
            System.out.println("Silinen Kullanıcı adı:" + isim);
        }



//        int i = 1;
//        for (String isim : isimListesi) {
//            System.out.println(i + "." + isim);
//            i++;
//        }

//        System.out.println("isim listesi uzunluğu: " + isimListesi.size());

        /**
         * sort işlemi
         */


        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(1);
        integerList.add(12);
        integerList.add(155);
        integerList.add(61);
        Collections.sort(integerList);


        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
