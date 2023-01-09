package com.thirdWeek.saturday.enums;

public enum CarType {
    SUV("Suv"),
    HATCHBACK("Hatchback"),
    SEDAN("Sedan"),
    STATION("Station");

    String type;

    CarType(String type) {
        this.type = type;
    }

    public String getValue(){
        return type;
    }

}
