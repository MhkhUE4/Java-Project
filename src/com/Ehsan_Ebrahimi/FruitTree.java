package com.Ehsan_Ebrahimi;

public class FruitTree extends GreenLife{
    private String name;
    private String fruitName;
    private String fruitSeason;
    private boolean isProductive;

    public FruitTree(String type, boolean isBenefitial, String name, String fruitName, String fruitSeason, boolean isProductive) {
        super("Fruit Tree", true);
        this.name = name;
        this.fruitName = fruitName;
        this.fruitSeason = fruitSeason;
        this.isProductive = isProductive;
    }

    public String getName() {
        return name;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitSeason() {
        return fruitSeason;
    }

    public boolean isProductive() {
        return isProductive;
    }
}
