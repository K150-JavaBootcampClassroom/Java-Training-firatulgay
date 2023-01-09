package com.thirdWeek.sunday.generics.genericMethod;

public class Ship extends AbstractVehicle {

    private int passengerCount;
    private String type;
    private int maxSpeed;
    private int size;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String getVehicleInfo() {
        return  "Ship { " +
                "passengerCount : " + this.passengerCount +
                " type : " + this.type +
                " maxSpeed : " + this.maxSpeed +
                " size : " + this.size;
    }
}