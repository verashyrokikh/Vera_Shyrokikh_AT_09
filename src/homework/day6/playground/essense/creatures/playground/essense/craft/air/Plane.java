package homework.day6.playground.essense.creatures.playground.essense.craft.air;

import homework.day6.playground.essense.creatures.playground.essense.Flyable;
import homework.day6.playground.essense.creatures.playground.essense.craft.Transportable;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s.\n", getClass().getSimpleName(), this.getName(), direction);
    }

}
