package com.thirdWeek.sunday.polimorfizm.upanddowncasting;

import com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi.Flower;
import com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi.FlowerBase;
import com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi.Rose;
import com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi.Sunflower;


public class Downcasting {

    public static void main(String[] args) {
        /**
         * primitve type'larda gördüğümüz gibi birbirinden kalıtım alan sınıflar üzerinde de upcasting, downcasting işlemleri yapılabilir.
         * Java upcasting işlemini dolaylı olarak yapar
         */

        //Upcasting: bir nesnenin refreansını bir üst nesneye atama işlemidir.
        //UpCastingte client gerçek nesneyi bilmek zorunda kalmadan işlem yapabilir.
        //polymorfizm sadece nesneler üzerinde olmaz. methodlarda olur. farklı imp. olan methodlar örnek.
        //Flower flower = new Rose("Red");

        /**
         * UpCasting
         */

        Flower rose = new Rose("red");


        //Downcasting
            //Rose rose = new Flower("blue"); // bu şekilde downcasting yapamam.

        /**
         * birinci tip downcasting yöntemi.
         */
        //  Flower flowerr = (Rose) new Flower("Blue");
        // System.out.println(flowerr);


//        Flower flower2 = new Flower("blue");
//        Rose flower21 = (Rose) flower2;
//           flower21.smell();


        /**
         * ikinci tip downcasting yöntemi.
         */
        Flower rose11 = new Rose("red");
        rose11.smell();
        Flower sunflower = new Sunflower("");
        FlowerService flowerService = new FlowerService();


        //upcasting işleminde hiyerarşi önceliği önemlidir.
        Rose rose1 = new Rose("");
        if (rose1 instanceof Flower) {
            System.out.println("");
        } else if (rose1 instanceof FlowerBase) {
            System.out.println("");
        }

        if (rose1 instanceof FlowerBase) {
            System.out.println("flowerbase içerisine girer");
        } else if (rose1 instanceof Flower) {
            System.out.println("");
        }
    }


}
