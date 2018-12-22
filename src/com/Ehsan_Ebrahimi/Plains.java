package com.Ehsan_Ebrahimi;

public class Plains extends Territorial {
    private  String name;
    private boolean hasRichSoil;

    public Plains(double extent, boolean isShared, String name, boolean hasRichSoil) {
        super(extent, isShared);
        this.name = name;
        this.hasRichSoil = hasRichSoil;
    }

    public String getName() {
        return name;
    }

    public boolean isHasRichSoil() {
        return hasRichSoil;
    }
}
