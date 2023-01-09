package com.thirdWeek.sunday.generics;

import java.util.List;

public class VehicleService<E>{

    public List<E> printFeatures(List<E> vehicles){
        for (E vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
        return vehicles;
    }
}
