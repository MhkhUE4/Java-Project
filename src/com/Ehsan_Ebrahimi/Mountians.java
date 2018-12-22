package com.Ehsan_Ebrahimi;

public class Mountians extends Territorial {
    private  String name;
    private double height;

    public Mountians(double extent, boolean isShared, String name, double height) {
        super(extent, isShared);
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
