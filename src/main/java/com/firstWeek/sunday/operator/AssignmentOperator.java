package com.firstWeek.sunday.operator;


public class AssignmentOperator {

    public static void main(String[] args) {
        /**
         * Atama operatorü = ile ifade edilir.
         * Atama işlemi sağdan sola yapılır.
         */
        int sayi = 5;

        /**
         * sonuc?
         */
        boolean a, b;
        a = b = false;
        System.out.println(a);

        //   System.out.println("a nın değeri:  " + a);
        //   System.out.println("c nin değeri:  " + c);
        //   System.out.println("d nin değeri:  " + d);


        /**
         * Bir değişkenin değerini güncelledikten sonra tekrar kendi üzerine atabiliriz.
         * Kod basitliği sağlar.
         */

        int i = 5;
        int sonuc = i + 2;
        System.out.println(sonuc);


        i = i + 2;
        System.out.println(i);

        i = i + 3;
        System.out.println(i);

    }
}
