package com.secondWeek.sunday.oop.inheritance;

public class Inheritance {
    /**
     * Aralarında yapılsal ve davranışsal benzerlik olan classlar dolayısıyla nesneler arasında
     * miras alma ilişkisi vardır.
     * DRY -- Kod tekrarını azaltır.
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * is-a ya da is like a ilişkisi vardır aralarında.
         * Okuma şekli şöyledir:
         * Her Köpek aynı zamanda bir Hayvandır.
         * Her Köpek bir Hayvan gibidir.
         */

        Lion lion = new Lion();
        lion.kukre();
        lion.setKukremeDesibeli(100);
        lion.setAyak(true);
        lion.setName("Coco");
        lion.feed();

        Bird bird = new Bird();
        bird.setName("Coco");
        bird.flying();
        bird.feed();

        /**
         * Çoklu miras alma:
         * Java da aynı anda miras alma yoktur.
         * Bunun yerine miras aldığın class başka bir classın sub classı ise en üstteki classın da verisini alabilir
         * Örnek:
         */

    }
}
