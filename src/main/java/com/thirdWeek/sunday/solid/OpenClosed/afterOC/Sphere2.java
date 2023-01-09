package com.thirdWeek.sunday.solid.OpenClosed.afterOC;

public class Sphere2 extends GeoObjects{

    public double radius;

    @Override
    public double getVolume()
    {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
