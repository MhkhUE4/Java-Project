package com.Ehsan_Ebrahimi;

public class Herb extends GreenLife {
    private String name;
    private  String howToUse;
    private boolean isAddictive;
    private String mostlyUsedFor;

    public Herb( String name, String howToUse, boolean isAddictive, String mostlyUsedFor) {
        super("Herb", true);
        this.name = name;
        this.howToUse = howToUse;
        this.isAddictive = isAddictive;
        this.mostlyUsedFor = mostlyUsedFor;
    }

    public String getName() {
        return name;
    }

    public String getHowToUse() {
        return howToUse;
    }

    public boolean isAddictive() {
        return isAddictive;
    }

    public String getMostlyUsedFor() {
        return mostlyUsedFor;
    }
}
