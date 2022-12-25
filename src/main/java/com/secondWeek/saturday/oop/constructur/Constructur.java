package com.secondWeek.saturday.oop.constructur;

public class Constructur {

    /**
     * Kurucu methodlardır. Tek tek bütün alanları set metodu ile vermek yerine obje oluşturulurken değerleri atayabiliriz.
     * Bir class'tan nesne üretmek istediğimiz zaman JVM tarafı bu işlemi consturctur ile yapar.
     * Yani nesne oluşturmanın temel şartıdır.
     * Eğer biz bir consturtur oluşturmazsak JVM default boş bir consturctur oluşturur.
     * Bu oluşturulan constructur'u ezebiliriz.
     * Önemli nokta: Constructur'lar class isimleri ile aynı olmak zorundadır.
     * Ve dönüş tipi olmayan tek method biçimidir. JVM void olarak algılar.
     * Constructurlar ovverload edilebilir.
     */

    public Constructur(String isim){

    }

}
