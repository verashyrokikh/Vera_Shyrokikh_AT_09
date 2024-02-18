package homework.day6.playground.essense.creatures.playground.essense.craft.hand;

import homework.day6.playground.essense.creatures.playground.essense.Matter;

public abstract class Container extends Matter {
    protected String name;

    public Container(int mass, String name) {
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
