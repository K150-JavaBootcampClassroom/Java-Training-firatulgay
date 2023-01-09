package com.thirdWeek.sunday.generics.genericMethod;

public class Car extends AbstractVehicle {


    private String color;
    private int HP;
    private String brand;
    private int doorCount;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }


    @Override
    public String getVehicleInfo() {
        return "Car{" +
                "color='" + color + '\'' +
                ", HP=" + HP +
                ", brand='" + brand + '\'' +
                ", doorCount='" + doorCount + '\'' +
                '}';
    }
}
