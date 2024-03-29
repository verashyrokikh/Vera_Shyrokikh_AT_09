package homework.day6.playground.essense.creatures;

import homework.day6.playground.essense.Matter;


public abstract class Plant extends Matter {
    protected String name;

    public Plant(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
