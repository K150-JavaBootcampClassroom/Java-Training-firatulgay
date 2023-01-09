package com.thirdWeek.saturday.odev;

public class RentServiceImpl implements IRentService {

    IRentStrategy iRentStrategy;

    public RentServiceImpl(IRentStrategy rentStrategy) {
        this.iRentStrategy = rentStrategy;
    }

    @Override
    public void rentCar(Car car, Customer customer) {
        iRentStrategy.rentCar(car,customer);
    }
}
