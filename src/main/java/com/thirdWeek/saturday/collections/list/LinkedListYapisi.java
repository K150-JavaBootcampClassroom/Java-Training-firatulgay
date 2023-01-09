package com.thirdWeek.saturday.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListYapisi {


    public static void main(String[] args) {

        LinkedList<String> linkedlist  = new LinkedList<String>();
        ArrayList<String> arraylist =  new ArrayList<String>();

        LinkedList<Integer> linkedlistInt  = new LinkedList<Integer>();
        ArrayList<Integer> arraylistInt =  new ArrayList<Integer>();

        zamanHesapla("ArrayList",arraylistInt);
        zamanHesapla("LinkedList",linkedlistInt);

        System.out.println("******** Normal **********");

        arraylist.add("fırat");
        arraylist.add("mahmut");
        arraylist.add("ahmet");
        arraylist.add("nesrin");
        arraylist.add("banu");

        for (String s : arraylist) {
            System.out.println(s);
        }

        System.out.println("******** Normal **********");



        System.out.println("*********** Sorted **********");

        Collections.sort(arraylist);

        for (String s : arraylist) {
            System.out.println(s);
        }

        System.out.println("*********** Sorted **********");

    }
    public static void zamanHesapla(String veri_tipi, List<Integer> list) {

        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0 ; i< 100000 ; i++) {
            list.add(0,i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");

    }

}
