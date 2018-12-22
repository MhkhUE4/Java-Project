package com.Ehsan_Ebrahimi;

public class Mamal extends Animal {
    private String Name;
    private String skinType;
    private boolean isPrey;
    private boolean isCarniHerbivious;

    public Mamal(int size, int name, boolean liveOnSoil, String name1, String skinType, boolean isPrey, boolean isCarniHerbivious) {
        super(size, name, liveOnSoil, false);
        Name = name1;
        this.skinType = skinType;
        this.isPrey = isPrey;
        this.isCarniHerbivious = isCarniHerbivious;
    }

    public String getName() {
        return Name;
    }

    public String getSkinType() {
        return skinType;
    }

    public boolean isPrey() {
        return isPrey;
    }

    public boolean isCarniHerbivious() {
        return isCarniHerbivious;
    }
}
