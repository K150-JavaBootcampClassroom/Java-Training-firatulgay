package com.firstWeek.saturday.dataTypesAndVariables.primitiveTypes;

import java.math.BigDecimal;

public class PrimitiveNumeric {

    public static void main(String[] args) {

        //---------------------------------- TAM SAYILAR -----------------------------------
        /**
         * byte : -2^8 ile 2^8
         */
        byte byteValue = 127;
          System.out.println("byte max value:" + Byte.MAX_VALUE);
          System.out.println("byte min value:" + Byte.MIN_VALUE);
        //   System.out.println("byte value:" + byteValue);

        /**
         * short : -2^16 ile 2^16
         */
        short shortValue = 45;
         System.out.println("short MAX value:" + Short.MAX_VALUE);
         System.out.println("short MIN value:" + Short.MIN_VALUE);


        /**
         * int : -2^32 ile 2^32 (32 Bit yer kaplar)
         * bir değişkene direkt bir tam sayı değeri atanırsa default olarak int tipinden işlem görür.
         */
        int sayi = 556464654;
         System.out.println("int max value:" + Integer.MAX_VALUE );
         System.out.println("int min value:" + Integer.MIN_VALUE );


        /**
         * long : -2^64 ile 2^64
         */
        long longValue = 5564646;
         System.out.println("long max value:" + Long.MAX_VALUE );
         System.out.println("long min value:" + Long.MIN_VALUE );

        //---------------------------------- KAYAN NOKTALI (GERÇEK) SAYILAR -----------------------------------


        /**
         *  int --> float --> double
         */

        /**
         * float -2^32 ile 2^32
         * Varsayılan Tip double
         */

        float asd = (float) 87.5;
        System.out.println(Float.MAX_VALUE);

        float f1 = 5;
        System.out.println(f1);
        float float1 = (float) 5.0;
        float float2 = 1.1f;
      //  System.out.println("Float Value" + float1);

        /**
         * double : -2^64 ile 2^64
         */
        double doubleValue = 1.1;
        //System.out.println("Double value:" + doubleValue);

        /**
         * NOT: Double ve float gerçek sayılar kümesinin elemanlarını tutarlar.
         * Yani 1.2 ile 2.1 arasında sonsuz sayıda değer vardır.
         * Bilgisayarında tutabileceği sayı değeri sınırlıdır.
         * Bu sebeple matematiğin doğasından kaynaklı aksamalar yaşanabilir.
         * Kullanırken dikkat etmek gerekir. Bigdecimal yapıları daha çok kullanılır profesyonel yaşamda
         */

        Double aDouble = 0.1d + 0.1d + 0.1d+ 0.1d+ 0.1d+ 0.1d + 0.1d ;
        Float aFloat = 0.1f + 0.1f + 0.1f+ 0.1f+ 0.1f+ 0.1f ;//aynı durumu float olarak dene.
         System.out.println("double sayının değeri: " + aDouble);
         System.out.println("float sayının değeri: " + aFloat);

        BigDecimal number1 = new BigDecimal(aFloat);
//        number1.round()


        /**
         *  Aynı değerdeki 3  farklı type'ın farkını görelim.
         */
        int a  = 22 / 7;
        float b = 22f / 7f;
        double c = 22d / 7d;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);


        /**
         * _ kullanımı.
         * Java 7 ile beraber büyük sabit sayılarda kolaylık olması açısından sayılarda rakamlar arası _ işareti konulabilmeye başlandı
         * ancak bu ifadeyi şu durumlarda kullanmamalıyız.
         * başta ve sonda, "." nın yanında f, F, d, D gibi ifadelin yanında kullanılmaz. çünkü amacı sayıları ayırmak.
         */

        int sayiValue = 100_000_00;
        System.out.println(sayiValue);

    }
}
