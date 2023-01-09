package com.thirdWeek.saturday.rentacar.strategies;

import com.thirdWeek.saturday.rentacar.Car;
import com.thirdWeek.saturday.rentacar.Customer;

public class SedanStrategyImpl implements IRentStrategy {
    @Override
    public void rentaCar(Car car, Customer customer) {
        System.out.println("Sedan Kiralama");
    }
}
