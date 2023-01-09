package com.thirdWeek.sunday.solid.OpenClosed.beforeOC;

public class TestOC {

    public static void main(String[] args) {

        Cuboid cb1 = new Cuboid();
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;


        Cuboid cb2 = new Cuboid();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;


        Cuboid cb3 = new Cuboid();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;

        Cuboid[] CbArr = new Cuboid[3];
        CbArr[0] = cb1;
        CbArr[1] = cb2;
        CbArr[2] = cb3;


        Sphere sp1 = new Sphere();
        sp1.radius = 5;

        Sphere sp2 = new Sphere();
        sp2.radius = 2;

        Sphere sp3 = new Sphere();
        sp3.radius = 3;

        Sphere[] spArr = new Sphere[3];
        spArr[0] = sp1;
        spArr[1] = sp2;
        spArr[2] = sp3;

        Application app = new Application();

        double vol = app.getTotalVolume(CbArr, spArr);

        // Print and display the total volume
        System.out.println("The total volume is " + vol);
    }


}
