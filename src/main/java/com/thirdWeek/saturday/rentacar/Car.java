package com.thirdWeek.saturday.rentacar;

public class Car {
    private int doorCount;
    private String fuelType;
    private int maxSpeed;
    private CarType carType;
    private RentInfo rentInfo;

    public Car(CarType carType, RentInfo rentInfo) {
        this.carType = carType;
        this.rentInfo = rentInfo;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public RentInfo getRentInfo() {
        return rentInfo;
    }

    public void setRentInfo(RentInfo rentInfo) {
        this.rentInfo = rentInfo;
    }
}
