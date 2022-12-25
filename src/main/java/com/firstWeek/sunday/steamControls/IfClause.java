package com.firstWeek.sunday.steamControls;

import java.util.Random;
import java.util.Scanner;

public class IfClause {

    /**
     *  Kontrol ifaderleri:
     *  Kontrol yapıları
     *  Karar yapıları ( if-else, switch-case)
     *  Tekrarlama yapıları (for, while, do while)
     *  recursive
     *
     */

    public static void main(String[] args) {

        int ilkSayi = 10;
        int ikinciSayi = 250;

        int toplam = ilkSayi + ikinciSayi;

        if(toplam < 40){
            System.out.println("iki sayının toplamı 40'den küçük");
        }else {
            System.out.println("iki sayının toplamı 40'den büyük");
        }


        Random random = new Random();
        int sayi = random.nextInt(100);
        if(sayi < 10){
            System.out.println("Sayının değeri 10'dan küçüktür.");
        }else{
            System.out.println("Sayının değeri 10 dan büyüktür.");
        }

        /**
         * if, else-if, else
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bir not girin ;");
//        int not = scanner.nextInt();
//
//
//        if (not >= 85){
//            System.out.println("AA");
//        }else if (not >= 80){
//            System.out.println("BA");
//        }else if (not >= 75){
//            System.out.println("BB");
//        }else if (not >= 65){
//            System.out.println("CB");
//        }else if (not >= 60) {
//            System.out.println("CC");
//        }else if (not >= 50){
//            System.out.println("DC");
//        }else if (not >= 40){
//            System.out.println("DD");
//        }else {
//            System.out.println("Bütünlemede görüşmek üzere!!");
//        }


        boolean isAuthorized = false;
        if(isAuthorized == true){
            System.out.println ("izin verildi");
        }else{
            System.out.println ("izin verilmedi");
        }


        /**
         * Ternary conditional operator ( Üçlü şartlı işlemci)
         */

        int sayi3 = random.nextInt(100);
        String sonuc = sayi3 > 10 ? " Alınan random sayı 10'dan büyüktür" : "Alınan sayı 10'dan küçüktür.";
        System.out.println(sonuc);


        if(sayi3> 10){
            System.out.println(" Alınan random sayı 10'dan büyüktür");
        }else{
            System.out.println(" Alınan random sayı 10'dan küçüktür");
        }


    }

}
