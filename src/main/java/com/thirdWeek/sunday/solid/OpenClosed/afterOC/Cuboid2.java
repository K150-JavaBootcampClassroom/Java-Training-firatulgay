package com.thirdWeek.sunday.solid.OpenClosed.afterOC;

public class Cuboid2 extends GeoObjects {
    public double length;
    public double breadth;
    public double height;

    @Override
    public double getVolume()
    {
        return length * breadth * height;
    }
}
