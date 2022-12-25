package com.firstWeek.saturday.dataTypesAndVariables.nonPrimitiveTypes;

public class nonprimitivetypes {

    public static void main(String[] args) {
        /**
         * String: text verileri tutmayı sağlar.
         * Hafıza yapısı anlatılırken daha detaylı anlatılacak.
         */
        String stringValue = "Kodluyoruz eğitim";
        String stringValue2 = new String("Kodluyoruz eğitim");

        String s1 = "Hello";
        String s2 = "Kodluyoruz";

        String s1s2 = s1+s2;

        String concatedStr = "Hello" +" "+ "Kodluyoruz";

        System.out.println(stringValue);
        System.out.println(stringValue2);
        System.out.println(concatedStr);


        String a = "Hello";
        System.out.println(a.hashCode());
        a = "asd";
        System.out.println(a.hashCode());

        int b  = 15;

        System.out.println(a + b);

        /**
         * Non primitive tiplerin oluşturulma yöntemleri farklılıklar oluşturur.
         * Bu konu OOP konusu işlendiği zaman detaylı anlatılacaktır.
         */

    }
}
