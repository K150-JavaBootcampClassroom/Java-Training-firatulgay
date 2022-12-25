package com.secondWeek.sunday.memory;


//import ikincihafta.cmt.oop.encapsulation.Ogrenci;

import com.secondWeek.saturday.oop.encapsulation.Araba;

import java.util.ArrayList;
import java.util.List;

/**
 * Kısaca Stack
 *
 * LIFO (Last in First out) son giren ilk çıkar mantığında çalışır.
 * Veri depolama alanı çok geniş olmadığından kullanımı kolay ve hızlıdır.
 * Veriler Big and Little Endian (artan ya da azalan) adres mantığında tutulur.
 * Derleme zamanında oluşturulur.
 * Life time (yaşam süresi) kısa olan değişkenler tutulur. Ör; local variables (yerel değişkenler).
 * Static allocation (Kullanılacak depolama alanının boyutu biliniyorsa stack işe yarayacaktır.)
 * Bir Java uygulamasında sadece tek bir stack yoktur. Her bir thread’in kendi stack’i vardır.
 * Bir stack üzerindeki veriye kendi thread’inden başka bir thread erişemez.
 * Doğru kullanılmadığında java.lang.StackOverFlowError hatası alınır.
 *
 *
 * Kısaca Heap
 *
 * Heap stack’e göre daha büyük boyuta sahiptir.
 * Stack’e göre daha fazla alana sahip olduğundan stack’e göre daha yavaştır.
 * Class tipindeki değişkenler referans tipleridir ve referansları Stack’de kendisi ise Heap’de saklanır.
 * Heap’teki veriler karışık şekilde sıralanır.
 * Çalışma zamanında oluşturulur.
 * Dynamic allocation (Kullanılacak depolama alanının boyutu bilinmiyorsa ya da sürekli değişken olacak ise heap kullanmak doğru olacaktır.)
 * Bir Java uygulamasında tüm thread’ler için sadece bir tane heap bulunmaktadır.
 * Doğru kullanılmadığında java.lang.OutOfMemoryError hatası alınır.
 */


public class MemoryStackhHeap {
    public static void main(String[] args) {
        /**
         * Method değişkenleri stackte tutulur. Object değişkenleri heapte tutulur.
         */

        Araba araba = new Araba(); //Araba nesnesi heapte oluşur. araba referansı stacktedir
        araba.setRenk("Mavi"); //renk heaptedir
        araba.setKapiSayisi(2);

        Araba araba1 = new Araba();
        araba1.setRenk("Sarı");

        araba = araba1;


       /**
        * ilkel veri tipleri veriye sahiptir.
        * Referans veri tipleri ise veriyi gösterir.
        */

        int a = 3;
        int b = a;
        a = 4;



        System.out.println("a nın değeri" + a);
        System.out.println("b nin değeri" + b);
//


        String str1 = new String("a");
        String str2 = new String("b");
        String temp = str1; //a
        str1 = str2; //b
        str2 = temp;
//
        System.out.println("str1 nin değeri: " + str1); // b
        System.out.println("str2 nin değeri: " + str2); // a
        System.out.println("temp nin değeri: " + temp); // a


//         Araba araba1= new Araba();
//         araba1 = null; // kayıp onject olarak hafızada kalır.memory leak oluşabilir, GC bunu halleder.

        /**
         * örnek: heap memory hatası
         */


//        stackOverFlowExp(1);
        heapMemory();

    }


    public static void stackOverFlowExp(int num) {
        System.out.println("Number: " + num);
        if (num == 0)
            return;
        else
            stackOverFlowExp(num += 10000000);
    }


    public static void heapMemory() {
        List<String> list = new ArrayList<>();

        int i = 0;

        while (true) {
            Araba araba = new Araba();
            System.out.println(araba + "." + i);
            i++;
//            list.add(araba);

            //List içine eklenmez ise GC çalışır
        }

    }

    /**
     * Heap GC tarafından temizlenir.
     * objenin referansı boşa çıkınca toplamaya başlar.
     * Heapte yer kapladığı halde kendisini referans eden bir veri yoksa silinir.
     */

}
