package com.thirdWeek.sunday.generics.genericMethod;

public class Plane extends AbstractVehicle{

    private String color;
    private int wingLength;
    private String model;
    private int passengerCount;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }


    @Override
    public String getVehicleInfo() {
        return "Plane{" +
                "color='" + color + '\'' +
                ", wingLength=" + wingLength +
                ", model='" + model + '\'' +
                ", passengerCount=" + passengerCount +
                '}';    }
}
