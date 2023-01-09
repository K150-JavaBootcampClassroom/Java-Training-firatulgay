package com.thirdWeek.sunday.solid.OpenClosed.beforeOC;

public class Application {
    public double getTotalVolume(Cuboid[] cGeoObjects,
                                 Sphere[] sGeoObjects)
    {
        double volSum = 0;

        for (Cuboid geoObj : cGeoObjects) {
            volSum += geoObj.length * geoObj.breadth * geoObj.height;
        }

        for (Sphere geoObjbj : sGeoObjects) {
            volSum += (4 / 3) * Math.PI * geoObjbj.radius
                    * geoObjbj.radius * geoObjbj.radius;
        }

        return volSum;
    }
}
