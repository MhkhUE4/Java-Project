package com.Ehsan_Ebrahimi;

public class Sea extends Territorial{
    private String name;
    private double depth;
    private boolean hasFossilFuel;

    public Sea(double extent, boolean isShared, String name, double depth, boolean hasFossilFuel) {
        super(extent, isShared);
        this.name = name;
        this.depth = depth;
        this.hasFossilFuel = hasFossilFuel;
    }

    public String getName() {
        return name;
    }

    public double getDepth() {
        return depth;
    }

    public boolean isHasFossilFuel() {
        return hasFossilFuel;
    }
}
