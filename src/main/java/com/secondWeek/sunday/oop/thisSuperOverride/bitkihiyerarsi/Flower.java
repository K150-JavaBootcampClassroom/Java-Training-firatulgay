package com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi;

public class Flower extends FlowerBase{

    private static String color;
    private String height;
    public String name = "Çiçek";

    public Flower(String color){
        super("asdf","asdfa");
        this.color = color;
//        this("gül","çicek","150cm");
//        super.getName();
    }

    public Flower(String name, String type, String height) {
        super(name, type);
        this.height = height;
    }

    public void smell(){
        System.out.println("flower smells good");
    }

    public  void feed(){
        System.out.println("flower has fed");
    }


}
