package com.thirdWeek.sunday.polimorfizm.upanddowncasting;

public class Client {

    public static void main(String[] args) {

        Rose rose = new Rose();
        rose.color = "red";
        rose.smell();
        rose.thorn = true;

        FlowerService flowerService = new FlowerService();
        Flower flower = new Rose();
        flower.color = "red";
        flower.smell();
        Rose rose1 = (Rose) flower;

        flowerService.getFlowers(rose1);

        Flower daisy = new Daisy();
        daisy.color = "red";
        daisy.smell();
        Daisy daisy1 = (Daisy) daisy;
        flowerService.getFlowers(daisy1);

        /*
           Soru
        */

//      Rose rose12 = new Flower();

        /*
          Soru
        */

//        Flower flower1 = new Flower();
//        flower1.color = "red";
//
//        Rose flower11 = (Rose) flower1;
//        flowerService.getFlowers(flower11);


    }
}
