package com.firstWeek.sunday.operator;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /**
         * 5 tanedir
         * --> +  Toplama
         * --> -  Çıkarma
         * --> /  Bölme
         * --> *  Çarpma
         * --> %  Kalan
         */

        int p = 3 * 5;
//       System.out.println(p);

        int j = 10 / 3;
        System.out.println(j);

        int k = 10 % 3;
         System.out.println(k);

        double m = 10.0 / 3.0;
        //   System.out.println(m);//sonucu ne olur

        double n = 10.0 % 3.0;
        System.out.println(n);

        double z = (double) 10 / (double) 3;
//        System.out.println(z);

        int i = 5;
        int yy = i + 2;
        // System.out.println(yy);

        i = i + 2;
        i += 2;
          System.out.println(i);

        i = i - 1;
        i -= 1;

            System.out.println(i);
        //System.out.println(i + 2);
        // System.out.println(i += 2);


        /**
         * soru:
         */

        int x = 1, y = 2, r = 3;
//        r = x + y * r;
//        System.out.println("r : " + r);

//        r = (x + y) * r;
//        System.out.println(r);

        /**
         * sonuç ?
         */
//        r *= x + y * r;
//        r = r * (x + y * r);

        r = r * x + y * r;
        System.out.println(r);

        /**
         * sonuc?
         */

        int t = 32324234;
        System.out.println(t);


        /**
         * Aşağıdaki 3 değerin çıktısı aynıdır.
         */

        int sayi = 0;
        sayi = sayi + 1;
        sayi += 1;
        sayi++; // postfix   --> The prefix operator ++ adds one to its operand / variable and returns the value before it is assigned to the variable
        ++sayi; // prefix   -->  The postfix operator ++ adds one to its operand / variable and returns the value only after it is assigned to the variable

//        System.out.println("-> "+ sayi);


        /**
         * tekli operator kullanımının öncesi ve sonra kullanımı önemlidir.
         *
         */
        int sayi1 = 10;
        sayi1++;

        System.out.println(sayi1);


        int ilkSayi = 5;
        int ikinciSayi= ilkSayi++;
        int ucuncuSayi = ++ilkSayi;

        System.out.println("İlkSayi: " + ilkSayi);
        System.out.println("ikinci Sayi:" + ikinciSayi);
        System.out.println("üçüncü Sayi:" + ucuncuSayi);


        /**
         * soru
         */
        int a = 2;
        int b = 3;
        int c = ++b;
        int d = a++;
        System.out.println("a : " + a); //3
        System.out.println("b : " + b);  // 3
        System.out.println("c : " + c);  // 4
        System.out.println("d : " + d); // 2


        /**
         * Compound Assginmentlarda cast otomatik yapılır
         */

        long w = 12L;
        int q = 5;

        q = (int)(q + w) ;
        q += w;


        /**
         * String ile kullanımı farklı sonuç verecektir.
         * NOT: + işlemcisi işleme soldan başlar. Soldaki işlenenin tipine göre karar verililir.
         */
        System.out.println("20" + "30");
        System.out.println(20 + 10 + "Hello");

        System.out.println("Hello" + (20 + 10));//sonuc?

        System.out.println(25 + 2 + "Hello" + 4 + 5);//sonuc?

    }


}
