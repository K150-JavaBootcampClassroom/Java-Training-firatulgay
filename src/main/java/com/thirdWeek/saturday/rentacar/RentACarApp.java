package com.thirdWeek.saturday.rentacar;

import com.thirdWeek.saturday.rentacar.strategies.HatchBackStrategyImpl;

import java.util.Date;

public class RentACarApp {
    public static void main(String[] args) {

        Car car = new Car(CarType.HATCHBACK,new RentInfo(RentType.MOUNTHLY,150,2500));

        Person person = new Person();
        person.setTCKN(12321436);
        person.setBirthDate(new Date());


        HatchBackStrategyImpl hatchBackStrategy = new HatchBackStrategyImpl();
        RentCarServiceImpl rentCarService = new RentCarServiceImpl(hatchBackStrategy);
        rentCarService.rentACar(car, person);

    }
}
