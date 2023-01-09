package com.thirdWeek.sunday.polimorfizm.casting;

public class Dog extends Animal{

    public void growl (){
        System.out.println("Dog is growling!!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog makes noise!!");
    }
}
