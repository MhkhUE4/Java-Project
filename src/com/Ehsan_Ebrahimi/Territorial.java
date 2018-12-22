package com.Ehsan_Ebrahimi;

public class Territorial extends NaturalResources {

    private double extent;
    private boolean isShared;

    public Territorial(double extent, boolean isShared) {
        this.extent = extent;
        this.isShared = isShared;
    }
}
