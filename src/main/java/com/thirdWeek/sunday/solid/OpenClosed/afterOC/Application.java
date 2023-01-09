package com.thirdWeek.sunday.solid.OpenClosed.afterOC;

public class Application {

    public double getTotalVolume(GeoObjects[] geoObjects)
    {
        double volSum = 0;

        for (GeoObjects geoObject : geoObjects) {
            volSum += geoObject.getVolume();
        }

        return volSum;
    }
}
