package com.secondWeek.sunday.oop.thisSuperOverride.bitkihiyerarsi;

public class FlowerBase {

    private String name = "FlowerBase";
    private String type = "";

    public FlowerBase(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public FlowerBase() {
    }

    public void test(){
        System.out.println("test");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
