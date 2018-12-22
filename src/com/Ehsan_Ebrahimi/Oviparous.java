package com.Ehsan_Ebrahimi;

public class Oviparous extends Animal {
    private String name;
    private boolean eggType;
    private boolean isPrey;

    public Oviparous(int size, int name, boolean liveOnSoil, boolean isPrimal, String name1, boolean eggType, boolean isPrey) {
        super(size, name, liveOnSoil, isPrimal);
        this.name = name1;
        this.eggType = eggType;
        this.isPrey = isPrey;
    }
}
