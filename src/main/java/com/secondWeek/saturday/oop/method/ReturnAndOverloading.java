package com.secondWeek.saturday.oop.method;

public class ReturnAndOverloading {


    public static void main(String[] args) {
        ikiSayininToplami("15",20);
        int toplam = toplamaIslemi();

//        int sayi
//        System.out.println(sayi);
    }

    /**
     * Method'un içindeki işlemler sonucunda elde edilen değer başka bir yerde kullanılmak isteniyorsa return kullanılır.
     *
     */

    //void
    public static void toplama() {
        int ilkSayi = 5;
        int ikinciSayi = 10;
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
    }

    public static int toplamaIslemi() {
        int toplam = 5 + 6;
        return toplam;
    }



    // parametreler virgülle ayrılır
    public static int ikiSayininToplami(int ilkSayi, int ikinciSayi) {
        int toplam = ilkSayi + ikinciSayi;
        System.out.println(toplam);
        return toplam;
    }

    /**
     * Overloading
     */

    public static  int ikiSayininToplami(String ilkSayiString, int ikinciSayi){
        int toplam = Integer.valueOf(ilkSayiString) + ikinciSayi;
        return toplam;
    }

    /**
     * soru
     */

//    public static long ikiSayininToplami(String ilkSayiString, int ikinciSayi){
//        int toplam = Integer.valueOf(ilkSayiString) + ikinciSayi;
//        return Long.valueOf(toplam);
//    }

    /**
     * Method imzası: methodun adı ve parametre listesinden oluşur.
     * imza: methodAdı(toplamaIslemi) ve methodParam(int ilkSayi, int ikinciSayi)
     * NOT: aynı method imzasına sahip iki method yazılamaz.
     * Aynı isimle bir methodu farklı parametrelerle yazarsak overload etmiş oluruz.
     */

    public static void hesapla(int intdeger) {
        System.out.println("int değeri aldı: " + intdeger);
    }

    /**
     * dönüş tipi farklı olması overload yapısını etkilemez.
     * çunku methodun kullanıldığı yerde return tipi kullanım zorunluğu yok.
     */

    public static void hesapla(short shortDeger) {
        System.out.println("short değeri aldı: " + shortDeger);
    }

    public static void hesapla(long shortDeger) {
        System.out.println("long değeri aldı: " + shortDeger);
    }

}



