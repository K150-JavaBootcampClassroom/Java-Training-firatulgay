package com.secondWeek.saturday.oop.encapsulation;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.setBeygir(84);
        araba.setKapiSayisi(4);
        araba.setMarka("Kia");
        araba.setRenk("Siyah");

//        araba.printInfo();

        Araba araba1 = new Araba();

        araba1.setBeygir(84);
        araba1.setKapiSayisi(4);
        araba1.setMarka("Kia");
        araba1.setRenk("Siyah");


        if (araba == araba1){

        }else {

        }
        araba = araba1;

 //       Araba1 araba 2 ye eşit mi

    }

}
