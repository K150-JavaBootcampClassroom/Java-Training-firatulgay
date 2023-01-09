package com.thirdWeek.sunday.generics.genericMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("Black");
        car.setDoorCount(2);
        car.setHP(200);

        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setColor("Black");
        car1.setDoorCount(2);
        car1.setHP(200);

        List<Car>  carList = new ArrayList<>();
        carList.add(car);
        carList.add(car1);

        VehicleService<Car> vehicleService = new VehicleService<>();
        List<Car> carList1 = vehicleService.printFeatures(carList);
    }



 }
