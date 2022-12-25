package com.secondWeek.saturday.oop.method;

import java.util.Scanner;

public class MethodYapisi {

    public static void main(String[] args) {

        toplama(5,8);
//        kullaniciVerisiIsleme();

    }

    /**
     * Methodlar Erişim belirleyici (opsiyonel), Ekstra özellikler , Dönüş Tipi, Method adı (parametreler)
     */

    public static void toplama(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
    }


    public static void carpma(String str, int... sayilar) {
        int carpim = 1;
        for (int sayi : sayilar) {
            carpim *= sayi;
        }
        System.out.println(carpim);
    }



    /**
     * Method yazarken dikkat edilmesi gerekenler:
     * 1) SOLID prensiplerine uymamız gerekir.
     * S harfi(Single responsibility)
     * 2) MEthod parametre sayısına dikkat edilmeli
     * 3) Bir methodda  15, 20 adetten fazla method olmamalı.
     * .
     * .
     * .
     */
    public void carpmaIslemi(int ilkSayi, int ikinciSayi, int ucuncuSayi, int dorduncuSayi) {
        int i = ikinciSayi * ikinciSayi;

        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
    }


    /**
     * kullanıcıdan 2 veri alalım.
     * toplamı 5 ten küçükse sonucun 2 ile kalanı ekrana yazdır.
     * toplam 5 ten büyükse sonucun üzerine kendisi kadar değer ekle
     */

    public void kullaniciVerisiIsleme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcıdan ilk veri al");
        int sayi1 = scanner.nextInt();
        System.out.println("Kullanıcıdan ikinci veri al");
        int sayi2 = scanner.nextInt();

//        int toplam = sayi1 + sayi2;
        int toplam = toplamaYap(sayi1, sayi2);

        karsilastirmaYap(toplam);
        scanner.close();

    }

    public int toplamaYap(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        return toplam;

    }

    public static void karsilastirmaYap(int toplamDegeri) {
        if (toplamDegeri < 5) {
            int kalan = toplamDegeri % 2;
            System.out.println("kalan değeri:" + kalan);
        } else {
            toplamDegeri += toplamDegeri;
            System.out.println("toplam değeri" + toplamDegeri);
        }
    }

}
