package homework.day6.playground.essense.craft.field;

import homework.day6.playground.essense.craft.Rideable;
import homework.day6.playground.essense.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }


}
