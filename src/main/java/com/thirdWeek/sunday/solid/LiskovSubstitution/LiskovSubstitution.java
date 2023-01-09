package com.thirdWeek.sunday.solid.LiskovSubstitution;

public class LiskovSubstitution {

    /**
     * “Alt seviye sınıflardan oluşan nesnelerin,
     * üst sınıfın nesneleri ile yer değiştirdikleri zaman,
     * aynı davranışı sergilemesi gerekmektedir.
     * Türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanabilmelidir.
     */

    public void client() {
        Car car = new Murat131();

        car.openAirConditioning();

    }

}
