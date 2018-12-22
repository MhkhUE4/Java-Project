package com.Ehsan_Ebrahimi;

public class Men extends HumanBeings {
    private boolean hasServed;
    private boolean hasWife;
    private String wifeName;
    private String wifeIDNumber;
    private boolean haschildren;
    private int howManykids;

    public Men(String name, String idNumber, String religion, String racial, String birthDate, boolean isEducated, String educationalDegree, boolean isAlive, boolean hasServed) {
        super(name, idNumber, religion, racial, birthDate, isEducated, educationalDegree, isAlive);
        this.hasServed = hasServed;
    }

    public boolean isHasServed() {
        return hasServed;
    }

    public boolean isHasWife() {
        return hasWife;
    }

    public String getWifeName() {
        return wifeName;
    }

    public String getWifeIDNumber() {
        return wifeIDNumber;
    }

    public boolean isHaschildren() {
        return haschildren;
    }

    public int getHowManykids() {
        return howManykids;
    }
}
