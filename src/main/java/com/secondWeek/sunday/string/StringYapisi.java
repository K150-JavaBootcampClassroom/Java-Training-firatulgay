package com.secondWeek.sunday.string;

public class StringYapisi {

    /**
     * Text tutmak için kullanılırlar.
     */

    public static void main(String[] args) {
        /**
         * Çeşitli oluşturulma şekilleri vardır.
         */

        String str = new String("Fırat");
        String str3 = new String("Fırat");

        Test test = new Test();
        Test test1 = new Test();

        test.equals(test1);

        if (test == test1){

        }


        String str1 = "Fırat";
        String str2 = "Fırat";
        str1 = "Murat";

        if (str1 == str2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (str == str3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        if (str.equals(str1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


        /**
         * == ve .equals kullanım farkı.
         */

        if (str.equals(str1)) {
            System.out.println("yeap");
        } else {
            System.out.println("no");
        }

        /**
         * substring kullanımı
         */

        String cumle = "Bu bir cümledir";
        cumle = cumle.substring(3, 8);//index önemli.
        System.out.println(cumle);

        /**
         * String immutable
         *
         * Immutable (değişmez), nesneler bir kez oluşturulduktan sonra içeriği değiştirilemeyen sınıflardır.
         */

        String name = "Fırat";
        name = "Fırat" + " Ülgay";
        System.out.println(name);
        //Hafızada Fırat ve Fırat Ülgay eklenmiş oldu.



        /**
         * String builder / StringBuffer kullanımı
         */
        StringBuilder stringBuilder = new StringBuilder("son durumdaki sayac degeri= ");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
            System.out.println(stringBuilder.toString());
        }
        System.out.println(stringBuilder.toString());
    }
}
