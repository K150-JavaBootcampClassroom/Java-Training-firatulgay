package com.thirdWeek.sunday.solid.LiskovSubstitution;

public class Ferrari extends Car {

    @Override
    public void openAirConditioning() {
        System.out.println("air conditioner turned on");

    }
}
