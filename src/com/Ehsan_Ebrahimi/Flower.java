package com.Ehsan_Ebrahimi;

public class Flower extends GreenLife {
    private String name;
    private String isInSeason;
    private String color;
    private boolean hasFlavour;
    private String flavourName;

    public Flower( String name, String isInSeason, String color, boolean hasFlavour) {
        super("Flower",true);
        this.name = name;
        this.isInSeason = isInSeason;
        this.color = color;
        this.hasFlavour = hasFlavour;
    }

    public String getName() {
        return name;
    }

    public String getIsInSeason() {
        return isInSeason;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasFlavour() {
        return hasFlavour;
    }

    public String getFlavourName() {
        return flavourName;
    }
}
