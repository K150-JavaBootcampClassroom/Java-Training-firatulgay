package com.thirdWeek.saturday.rentacar.strategies;

import com.thirdWeek.saturday.rentacar.Car;
import com.thirdWeek.saturday.rentacar.Customer;
import com.thirdWeek.saturday.rentacar.Person;
import com.thirdWeek.saturday.rentacar.RentType;

public class HatchBackStrategyImpl implements IRentStrategy {
    @Override
    public void rentaCar(Car car, Customer customer) {

        double hathBackMounthlyParam = 1.1;

        if (customer instanceof Person){
            System.out.println("you re not allowed for this operation!!");
        }else {
            if (RentType.MOUNTHLY.equals(car.getRentInfo().getRentType())){
   //             RentInfo rentInfo = new RentInfo();
     //           double mouthlyPrice = hathBackMounthlyParam * car.getRentInfo().getMounthlyRentPrice();
       //         rentInfo.setTotalPrice(mouthlyPrice);
            }
        }
        System.out.println("Hatchback Kiralama");
    }
}
