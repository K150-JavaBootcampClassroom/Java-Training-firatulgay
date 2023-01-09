package com.thirdWeek.sunday.solid.LiskovSubstitution;

public abstract class Car {
    String marka ;
    String model ;

    public void run() {
        System.out.println("Run");
    }
    public abstract void openAirConditioning();
}
