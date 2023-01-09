package com.thirdWeek.sunday.generics;

import java.util.List;

public class VehicleServiceV1<E> {

    public List<E> printFeature(List<E> list){
        for (E e : list) {
            System.out.println(e.toString());
        }

        return  list;
    }








    public void printCarFeatures(List<Car> carList){
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    public void printPlaneFeature(List<Plane> planeList){
        for (Plane plane : planeList) {
            System.out.println(plane.toString());
        }
    }

    public void printShipFeatures(List<Ship> shipList){
        for (Ship ship : shipList) {
            System.out.println(ship.toString());
        }
    }

}
