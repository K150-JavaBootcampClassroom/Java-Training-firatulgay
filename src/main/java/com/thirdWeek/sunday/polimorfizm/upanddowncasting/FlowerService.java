package com.thirdWeek.sunday.polimorfizm.upanddowncasting;

public class FlowerService {

    public void getFlowers(Flower flower){
        if(flower instanceof Rose){
            Rose rose = (Rose) flower;
            rose.thorn = true;
        } else if (flower instanceof Daisy) {
            Daisy daisy = (Daisy) flower;
            daisy.color = "yellow";
        }


    }



}
