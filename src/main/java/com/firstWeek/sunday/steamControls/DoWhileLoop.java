package com.firstWeek.sunday.steamControls;

import java.util.Random;

public class DoWhileLoop {

    public static void main(String[] args) {
        /**
         * while ile tek farkı döngü başlamadan önce bir değer ataması yapılmak istenir.
         * en az bir kere çalışması garanti.
         *
         */
        Random random = new Random();
        int randomSayi;
        do {
            randomSayi = random.nextInt(10);
            System.out.println("sayının değeri:" + randomSayi);

        } while (randomSayi < 7);

        System.out.println("çıkış değeri:" + randomSayi);
    }
}
