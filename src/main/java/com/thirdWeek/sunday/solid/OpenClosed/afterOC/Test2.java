package com.thirdWeek.sunday.solid.OpenClosed.afterOC;

public class Test2 {
    public static void main(String args[])
    {

        Cuboid2 cb1 = new Cuboid2();

        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;


        Cuboid2 cb2 = new Cuboid2();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;


        Cuboid2 cb3 = new Cuboid2();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;


        Sphere2 sp1 = new Sphere2();
        sp1.radius = 5;

        Sphere2 sp2 = new Sphere2();
        sp2.radius = 2;

        Sphere2 sp3 = new Sphere2();
        sp3.radius = 3;

        GeoObjects[] geoArr = new GeoObjects[6];

        geoArr[0] = cb1;
        geoArr[1] = cb2;
        geoArr[2] = cb3;

        geoArr[3] = sp1;
        geoArr[4] = sp2;
        geoArr[5] = sp3;

        Application app = new Application();

        double vol = app.getTotalVolume(geoArr);

        System.out.println("The total volume is " + vol);
    }
}
