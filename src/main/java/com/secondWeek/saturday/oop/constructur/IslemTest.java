package com.secondWeek.saturday.oop.constructur;

public class IslemTest {

    public static void main(String[] args) {
        DortIslem islem = islem(2, 3);

        System.out.println(islem.getToplam());
        System.out.println(islem.getCikar());
        System.out.println(islem.getBol());
        System.out.println(islem.getCarp());

    }


    public static DortIslem islem(int ilkSayi, int ikinciSayi){

        int toplam = ilkSayi + ikinciSayi;

        DortIslem dortIslem = new DortIslem(toplam);

        dortIslem.setCikar(ilkSayi - ikinciSayi);
        dortIslem.setCarp(ilkSayi * ikinciSayi);
        dortIslem.setBol(ilkSayi / ikinciSayi);

        return dortIslem;

    }
}
