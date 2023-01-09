package com.thirdWeek.saturday.odev;

public class RentInfo {
    private double rentDailyPrice;
    private RentType rentType;
    private int dayCount;

    public RentInfo(double rentDailyPrice, RentType rentType, int dayCount) {
        this.rentDailyPrice = rentDailyPrice;
        this.rentType = rentType;
        this.dayCount = dayCount;
    }

    public double getRentDailyPrice() {
        return rentDailyPrice;
    }

    public void setRentDailyPrice(double rentDailyPrice) {
        this.rentDailyPrice = rentDailyPrice;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
}
