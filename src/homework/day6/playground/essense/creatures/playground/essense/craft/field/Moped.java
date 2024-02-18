package homework.day6.playground.essense.creatures.playground.essense.craft.field;

import homework.day6.playground.essense.creatures.playground.essense.craft.Rideable;
import homework.day6.playground.essense.creatures.playground.essense.craft.Transportable;

public class Moped extends Vehicle implements Transportable, Rideable {
    public Moped(int mass, String name) {
        super(mass, name);
    }
}


