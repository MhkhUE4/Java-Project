package com.Ehsan_Ebrahimi;

public class Jungle extends Territorial {
    private String name;
    private String jungleType;
    private boolean isProtected;

    public Jungle(double extent, boolean isShared, String name, String jungleType, boolean isProtected) {
        super(extent, isShared);
        this.name = name;
        this.jungleType = jungleType;
        this.isProtected = isProtected;
    }

    public String getName() {
        return name;
    }

    public String getJungleType() {
        return jungleType;
    }

    public boolean isProtected() {
        return isProtected;
    }
}
