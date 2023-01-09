package com.thirdWeek.saturday.odev;

import java.util.ArrayList;
import java.util.List;

public class RentACarApp {
    public static void main(String[] args) {

        List<Car> carList = generateCatalog();

        SedanRentStrategyImpl sedanRentStrategy = new SedanRentStrategyImpl();
        RentServiceImpl rentService = new RentServiceImpl(sedanRentStrategy);

        Customer customer = new Person();
        customer.setId(1);

        System.out.println("-----Katalog-------");
        int i = 0;
        for (Car car : carList) {
            if (customer instanceof Person) {
                if (CarType.HATCHBACK.equals(car.getCarType())) {
                    continue;
                } else {
                    System.out.println("car" + ++i);
                    System.out.println("type" + car.getCarType());
                }
            } else {
                System.out.println("car" + ++i);
                System.out.println("type" + car.getCarType());
            }

        }

//        rentService.rentCar(car,customer);
    }

    private static List<Car> generateCatalog() {
        List<Car> carList = new ArrayList<>();

        Car car1  = new Car();
        car1.setCarType(CarType.HATCHBACK);
        car1.setRentInfo(new RentInfo(100,RentType.DAILY,0));
        carList.add(car1);

        Car car2  = new Car();
        car2.setRentInfo(new RentInfo(200,RentType.DAILY,0));
        car2.setCarType(CarType.SEDAN);
        carList.add(car2);

        Car car3  = new Car();
        car3.setRentInfo(new RentInfo(300,RentType.DAILY,0));
        car3.setCarType(CarType.SEDAN);
        carList.add(car3);

        Car car4  = new Car();
        car4.setRentInfo(new RentInfo(400,RentType.DAILY,0));
        car4.setCarType(CarType.SUV);
        carList.add(car4);

        return carList;

    }


}
