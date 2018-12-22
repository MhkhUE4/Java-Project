package com.Ehsan_Ebrahimi;

public class Desert extends Territorial {
    private String name;
    private boolean isInhabitted;

    public Desert(double extent, boolean isShared, String name, boolean isInhabitted) {
        super(extent, isShared);
        this.name = name;
        this.isInhabitted = isInhabitted;
    }

    public String getName() {
        return name;
    }

    public boolean isInhabitted() {
        return isInhabitted;
    }
}
