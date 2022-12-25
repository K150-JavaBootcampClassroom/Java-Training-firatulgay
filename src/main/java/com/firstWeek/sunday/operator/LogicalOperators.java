package com.firstWeek.sunday.operator;

public class LogicalOperators {
    public static void main(String[] args) {
        /**
         * and : a && b  -> Bütün sonuçlar kendi içinde true ise genel sonuç true. Biri bile false ise sonuç false.
         * or : a || b   -> En az biri true ise sonuç true.
         * not : !(a&&b)
         */
        int a = 5;
        int b = 4;
        int c = 5;
        int d = 4;

        System.out.println((a == c) && (b == d));
        System.out.println((a == b) && (b == c));//false
        System.out.println((a == b) || (a == c));//true


        /**
         * Soru
         */
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = true;

        String s1 = "hello";
        String s2 = "deniz";

        String s3 = "kodluyoruz";
        String s4 = "firat";



        boolean bool = b1 && (b2 || b3);
        System.out.println(bool);

    }
}
