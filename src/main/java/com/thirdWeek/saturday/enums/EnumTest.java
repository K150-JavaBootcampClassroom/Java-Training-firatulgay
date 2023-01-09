package com.thirdWeek.saturday.enums;

public class EnumTest {
    public static void main(String[] args) {

        Car car = new Car();
        car.setCarType(CarType.HATCHBACK);
        //DB kaydet

        System.out.println(car.getCarType().getValue());
    }
}
