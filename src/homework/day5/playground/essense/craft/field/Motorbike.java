package homework.day5.playground.essense.craft.field;

import homework.day5.playground.essense.craft.Rideable;
import homework.day5.playground.essense.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

}
