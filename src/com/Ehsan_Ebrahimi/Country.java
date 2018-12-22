package com.Ehsan_Ebrahimi;

public class Country {
    private String name;
    private int provinces;
    private int population;
    public Country(String name, int provinces, int population){
        this.name=name;
        this.provinces=provinces;
        this.population=population;
    }

    public String getName() {
        return name;
    }

    public int getProvinces() {
        return provinces;
    }

    public int getPopulation() {
        return population;
    }
}
