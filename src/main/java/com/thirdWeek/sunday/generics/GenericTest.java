package com.thirdWeek.sunday.generics;

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
        
        Plane plane = new Plane();
        plane.setColor("white");
        plane.setModel("Boeng");
        plane.setPassengerCount(200);
        plane.setWingLength(80);

        Plane plane1 = new Plane();
        plane1.setColor("white");
        plane1.setModel("Boeng");
        plane1.setPassengerCount(200);
        plane1.setWingLength(80);
        
        List<Plane> planeList = new ArrayList<>();
        planeList.add(plane);
        planeList.add(plane1);
        
        

        VehicleServiceV1<Car> vehicleServiceV1 = new VehicleServiceV1<>();
        vehicleServiceV1.printFeature(carList);
        
        VehicleService<Plane> vehicleServicePlane = new VehicleService<>();
        List<Plane> planes = vehicleServicePlane.printFeatures(planeList);


    }

 }
