package com.Ehsan_Ebrahimi;

import java.util.Date;

public class HumanBeings  {
    private String name;
    private String idNumber;
    private String religion;
    private String  racial;
    private boolean isEducated;
    private String educationalDegree;

    private boolean isAlive;
    private String birthDate;
    private int age;
    private String dateOfDeath;

    public HumanBeings(String name, String idNumber, String religion, String racial, String birthDate, boolean isEducated, String educationalDegree, boolean isAlive) {
        this.name = name;
        this.idNumber = idNumber;
        this.religion = religion;
        this.racial = racial;
        this.birthDate = birthDate;
        this.isEducated = isEducated;
        this.educationalDegree = educationalDegree;
        this.isAlive = isAlive;
    }
    public int howOld() {
        if(isAlive)
        {
    }
        else{
        }
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getReligion() {
        return religion;
    }

    public String getRacial() {
        return racial;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean isEducated() {
        return isEducated;
    }

    public String getEducationalDegree() {
        return educationalDegree;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }
}
