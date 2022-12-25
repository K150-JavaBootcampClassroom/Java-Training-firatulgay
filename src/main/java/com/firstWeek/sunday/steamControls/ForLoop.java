package com.firstWeek.sunday.steamControls;

public class ForLoop {
    public static void main(String[] args) {
        /**
         * tekrarlı çalıştırmada kullanılır.
         * yapısı:
         * çalışma şekli: başlangıç değeri belirlenir, sonra bitiş şartına bakar. sonra cümle çalışır, sonra
         * değişime bakar.
         */

//         int i = 0;

        for (int i = 0; i <= 5; i++) { // başlangıç değeri , döngü koşulu ve değişim(arttırma veya azaltma).
                System.out.println("Sayinin değeri : " + i);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.format("%5d", i * j);
            }
            System.out.println("asdasd");
        }

        /**
         * for döngüsü farklı formları daha sonra anlatılacak.
         * Nesne, list yapısı özelindeki örneklerde anlatılacak
         */

        /**
         * break, continue
         */

        for (int i = 10; i <= 10; i--) {
            if (i % 5 == 0) { //5'e tam bölünen.
                System.out.println("5 ile tam bölünen sayı ile karşılaşıldı, Akışa devam etme" + " " + "Karşılaşılan sayı = " + i);
                break;
            }
            System.out.println("Akış devam ediyor. Sayı değeri:" + i);
        }
        System.out.println("dışarı çıkıldı.");

        int sayi = 3;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.println("2 ile tam bölünen sayı ile karşılaşıldı, Akışa devam etme");
                continue;
            }

            System.out.println("Akış devam ediyor. Sayı değeri:" + i);

//            sayi ++;
//            i = sayi + i;
//            System.out.println(i);
        }
    }
}
