package com.firstWeek.sunday.steamControls;

import java.util.Random;

public class WhileLoop {

    /**
     * While
     * mantıksal ifade doğru olduğu sürece devam eder.
     */
    public static void main(String[] args) {
        int i = 10;

        while(i < 20){
            System.out.println("i = " + i);
            i++;
        }


        Random random = new Random();
        int randomSayi = random.nextInt(10);

         while (randomSayi < 7){ // 11 olursa sonuç ne olur?
             System.out.println("sayının değeri:" + randomSayi);
             randomSayi = random.nextInt(10);
         }
         System.out.println("sayının değeri:" + randomSayi);

    }
}
