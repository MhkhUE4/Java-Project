package com.Ehsan_Ebrahimi;

public class Provender extends GreenLife {
    private String name;
    private String isFoodfor;
    private boolean isNuturious;

    public Provender( String name, String isFoodfor, boolean isNuturious) {
        super("Provender", true);
        this.name = name;
        this.isFoodfor = isFoodfor;
        this.isNuturious = isNuturious;
    }

    public String getName() {
        return name;
    }

    public String getIsFoodfor() {
        return isFoodfor;
    }

    public boolean isNuturious() {
        return isNuturious;
    }

}
