package com.thirdWeek.saturday.rentacar;

import com.thirdWeek.saturday.rentacar.strategies.IRentStrategy;

public class RentCarServiceImpl implements IRentCarService {

    IRentStrategy iRentStrategy;

    @Override
    public void rentACar(Car car, Customer customer) {
        iRentStrategy.rentaCar(car,customer);
    }

    public RentCarServiceImpl(IRentStrategy iRentStrategy) {
        this.iRentStrategy = iRentStrategy;
    }
}
