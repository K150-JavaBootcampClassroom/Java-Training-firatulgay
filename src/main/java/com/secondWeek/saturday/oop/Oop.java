package com.secondWeek.saturday.oop;

public class Oop {

    /**
     * Class'lar bizim için şablondur.
     * Bu classları ele alarak oluşturduğumuz örneklemelerden nesneleri oluştururuz.
     * Araba classında renk, kapiSayisi vs gibi alanları vardır. Bu tüm arabalar için geçerli bir şablondur
     * Araba classından markası Kia olan rengi Siyah 100 beygir olan özel bir araba oluşturabiliriz.
     * İşte bu şekilde Araba classından bir örnekleme bir nesne oluşturmuş olduk.
     * Nesne olan somut olanı temsil eder.
     */
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.beygir = 100;
        araba.marka ="Kia";
        araba.renk = "Siyah";
//        araba.kapiSayisi = 4;

        araba.calistir();

        araba = new Araba();
        // devamını oluştur


//        int kapiSayisi = araba.kapiSayisi;


    }

    /**
     * Nesneler state'lere ve behavior'a sahiptir.
     * Methodlar olarak bilinen behavior'ın yapısı
     */

    /**
     * method adı: calistir
     * method return type: void
     * method parametresi: isim
     * @param isim
     */

}
