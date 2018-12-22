package com.Ehsan_Ebrahimi;

public class Women extends HumanBeings {
    private boolean isMarried;
    private String husbandName;
    private String husbandIDNumber;
    private boolean haschildren;
    private int howmanykids;

    public Women(String name, String idNumber, String religion, String racial, String birthDate, boolean isEducated, String educationalDegree, boolean isAlive, boolean isMarried) {
        super(name, idNumber, religion, racial, birthDate, isEducated, educationalDegree, isAlive);
        this.isMarried = isMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public String getHusbandIDNumber() {
        return husbandIDNumber;
    }

    public boolean isHaschildren() {
        return haschildren;
    }

    public int getHowmanykids() {
        return howmanykids;
    }
}
