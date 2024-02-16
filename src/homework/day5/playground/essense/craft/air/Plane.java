package homework.day5.playground.essense.craft.air;

import homework.day5.playground.essense.Flyable;
import homework.day5.playground.essense.craft.Transportable;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }
}
