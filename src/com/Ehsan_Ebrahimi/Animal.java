package com.Ehsan_Ebrahimi;

public class Animal extends NaturalResources {
    private int size ;
    private int name;
    private boolean liveOnSoil;
    private boolean isPrimal;

    public Animal(int size, int name, boolean liveOnSoil, boolean isPrimal) {
        this.size = size;
        this.name = name;
        this.liveOnSoil = liveOnSoil;
        this.isPrimal = isPrimal;
    }
}
