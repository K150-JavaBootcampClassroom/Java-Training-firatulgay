package com.firstWeek.saturday.typeConversion;

public class PrimitiveTypeConversion {

    public static void main(String[] args) {
        /**
         * Verileri Büyükten küçüğe veya küçükten büyüğe çevirebiliriz.
         * byte --> short --> int --> long
         * int --> long --> double --> float geçiş yapabilir.
         * Bir tanımlama yapılmaz ise default type int'tir.
         *
         */
        byte byteValue = 127;
        short shortValue = 129;
        int intValue = 5_555_777;
        long longValue = 70000000000L;
        char charValue = 65;
        double doubleValue = 3.14d;


        shortValue = byteValue;
        longValue = intValue;
        int i = shortValue / 3;
        System.out.println("shortValue değeri: " + shortValue);
        System.out.println("longValue değeri: " + longValue);
        System.out.println("int değeri: " + i);

        intValue = (int)longValue; //compile error, değeri daha küçük olsa bile.

        /**
         * soru
         */

        byte a1 = 100;
//        byte b1 = (a1/2);




        /**
         * Büyükten küçüğe geçişler sorunludur, doğrudan yapılmaz.
         *
         */

        /**
         * soru: aşağıdaki gibi değişken tanımlayabilir miyim?
         */
        // int sayi = 5l;


        /**
         * cast işlemi yapılabilir.
         */
        int ii = (int) 5455555555555555555L; // bu şekilde cast edebilrisiniz. Ancak çok büyük bir sayı olursa yine sorun yaşanacaktır
        System.out.println("ii:" + ii);
        /**
         * casting işleminde de veri kaybı olur
         */
        int a = 2102147299;

        long l1 = 100_000_000_000L;
        int i1 = (int) l1;
        System.out.println("cast edilmemiş l1: " + l1);
        System.out.println("cast edilmiş l1  : " + i1);

        /**
         * Integer cache: -127 ile 128 arasındaki sayılar cache lenir.
         * aynı referans gösterilir. böylece performans anlamında faydası olur.
         * Ancak new anahtar kelimesi ile oluşturulan değerler hariç.
         */
        Integer intValue1 = 800;
        Integer intValue2 = 800;
        System.out.println(intValue1 == intValue2);
    }

}
