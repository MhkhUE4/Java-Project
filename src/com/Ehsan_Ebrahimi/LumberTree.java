package com.Ehsan_Ebrahimi;

public class LumberTree extends GreenLife {
    private String name;
    private String woodType;
    private String industrialUse;

    public LumberTree(String type, boolean isBenefitial, String name, String woodType, String industrialUse) {
        super("Lumber", true);
        this.name = name;
        this.woodType = woodType;
        this.industrialUse = industrialUse;
    }

    public String getName() {
        return name;
    }

    public String getWoodType() {
        return woodType;
    }

    public String getIndustrialUse() {
        return industrialUse;
    }
}
