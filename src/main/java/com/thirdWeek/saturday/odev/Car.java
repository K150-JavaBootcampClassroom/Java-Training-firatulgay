package com.thirdWeek.saturday.odev;

public class Car {

    private int doorCount = 4;
    private String color = "White";
    private String brand;
    private int hp = 84;
    private CarType carType = CarType.SEDAN;
    private RentInfo rentInfo;

    public Car(RentInfo rentInfo) {
        this.rentInfo = rentInfo;
    }
    public Car (){

    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
