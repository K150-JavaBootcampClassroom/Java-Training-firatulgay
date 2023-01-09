package com.thirdWeek.saturday.odev;

public class SedanRentStrategyImpl implements IRentStrategy {
    @Override
    public void rentCar(Car car, Customer customer) {
        double sedanCarParam = 1.1;

        if (RentType.DAILY.equals(car.getRentInfo().getRentType())){



        }else if (RentType.MONTHLY.equals(car.getRentInfo().getRentType())){
            double lastRentPrice = calculateMountlyPrice(car, sedanCarParam);
            System.out.println(customer.getId() +  " id customer rent a car with price = " + lastRentPrice);
        }else {
            System.out.println("RentType is not correct.");
        }
    }

    private double calculateMountlyPrice(Car car, double sedanCarParam) {
        double rentDailyPrice = car.getRentInfo().getRentDailyPrice();
        double lastRentPrice = rentDailyPrice * 30 * sedanCarParam;
        return lastRentPrice;
    }


}
