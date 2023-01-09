package com.thirdWeek.saturday.rentacar;

public class RentInfo {
    private RentType rentType;
    private double dailyRentPrice;
    private double mounthlyRentPrice;
    private double totalPrice;

    public RentInfo(RentType rentType, double dailyRentPrice, double mounthlyRentPrice) {
        this.rentType = rentType;
        this.dailyRentPrice = dailyRentPrice;
        this.mounthlyRentPrice = mounthlyRentPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public double getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(double dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

    public double getMounthlyRentPrice() {
        return mounthlyRentPrice;
    }

    public void setMounthlyRentPrice(double mounthlyRentPrice) {
        this.mounthlyRentPrice = mounthlyRentPrice;
    }
}
