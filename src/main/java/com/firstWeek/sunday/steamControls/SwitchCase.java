package com.firstWeek.sunday.steamControls;

import java.util.Random;

public class SwitchCase {
    /**
     * if else if else gibi uzun yapıların muadili olarak kullanılır.
     * switch içerisnde int/string gibi yapılar olmalı
     * koşulu ilk sağladığı yerde break olmazsa altındaki tüm satırlar çalışır
     * @return
     */
    public static void main(String[] args) {

        Random random = new Random();
        int sayi = 2;


        switch (sayi){
            case 1 :
                System.out.println("Sayı 1 case'ine girdi");
                break;
            case 2:
                System.out.println("satı 2 ye girdi");
            case 3:
                System.out.println("Sayı 3 case'ine girdi");
                break;
            default:
                System.out.println("Sayı 1, 2, 3 değerlerini sağlamıyor");

        }
    }


    public void test(){
        String s = "";
        //code
        return ;

    }
}
