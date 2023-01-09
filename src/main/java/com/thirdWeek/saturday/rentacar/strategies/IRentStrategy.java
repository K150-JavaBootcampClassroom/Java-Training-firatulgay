package com.thirdWeek.saturday.rentacar.strategies;

import com.thirdWeek.saturday.rentacar.Car;
import com.thirdWeek.saturday.rentacar.Customer;

public interface IRentStrategy {
    void rentaCar(Car car, Customer customer);
}
