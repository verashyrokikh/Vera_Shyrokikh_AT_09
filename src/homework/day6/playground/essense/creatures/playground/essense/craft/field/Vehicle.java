package homework.day6.playground.essense.creatures.playground.essense.craft.field;

import homework.day6.playground.essense.creatures.playground.essense.Matter;
import homework.day6.playground.essense.creatures.playground.essense.craft.Rideable;
import homework.day6.playground.essense.creatures.playground.essense.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int move(int pointA, int pointB) {
        int distance = pointB - pointA;
        System.out.printf("I am %s, my name is %s and I am moving from %s to %s.\n", this.getClass().getSimpleName(), this.getName(), pointA, pointB);
        return distance;
    }

    @Override
    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I amd drive to %s%n", this.getClass().getSimpleName(), this.name, direction);
    }
}
