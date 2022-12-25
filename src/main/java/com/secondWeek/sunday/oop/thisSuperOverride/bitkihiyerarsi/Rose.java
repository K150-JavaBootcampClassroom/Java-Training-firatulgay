package com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi;

public class Rose extends Flower {

    protected String name = "Gül";

    public Rose(String color) {
        super("kırmızı");//süper üst sınıfn kurucularına erişmek için kullanılır.
    }

    @Override
    public void smell() {
        System.out.println("rose smells good ");
    }

    public void smellRose() {
        super.smell();
        System.out.println("Rose smell is good");
    }

    /**
     * Ovveriding:
     * Nesne methodu nesne methodunu ezer adı ovverriding tir.
     * Class methodu class methodunuj gizler.
     */

    @Override
    public  void feed() {
        System.out.println("Rose has fed");
    }


    /**
     * super üst sınıfın değişkenlerine erişebilri
     */
    public void info() {
        System.out.println("Name:" + name);//gizleme yapmış oluyorum. child class içerisinde name tanımlanmamış olsaydı
        //üst sınıftakini super yazmadan alabilirdim.
        System.out.println("Name:" + super.name);
//         super.color; static verilere erişemem
    }

    public static void main(String[] args) {

    }

}
