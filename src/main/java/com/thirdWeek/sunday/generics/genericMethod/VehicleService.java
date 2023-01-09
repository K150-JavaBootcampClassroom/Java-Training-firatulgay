package com.thirdWeek.sunday.generics.genericMethod;

import java.util.List;

public class VehicleService<E extends AbstractVehicle>{

    public List<E> printFeatures(List<E> vehicles){

        for (E vehicle : vehicles) {
            System.out.println(vehicle.getVehicleInfo());
        }
        return vehicles;
    }
}
