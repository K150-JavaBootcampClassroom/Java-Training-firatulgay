package com.thirdWeek.sunday.generics;

public class Ship {

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
    public String toString() {
        return "Ship{" +
                "passengerCount=" + passengerCount +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", size=" + size +
                '}';
    }
}
