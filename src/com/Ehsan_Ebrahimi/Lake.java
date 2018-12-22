package com.Ehsan_Ebrahimi;

public class Lake extends Territorial{
    private String name;
    private  boolean isSaltLake;

    public Lake(double extent, boolean isShared, String name, boolean isSaltLake) {
        super(extent, false);
        this.name = name;
        this.isSaltLake = isSaltLake;
    }

    public String getName() {
        return name;
    }

    public boolean isSaltLake() {
        return isSaltLake;
    }

}
