package homework.day6.playground.essense.creatures.playground.essense.craft.air;

import homework.day6.playground.essense.creatures.playground.essense.Flyable;
import homework.day6.playground.essense.creatures.playground.essense.Matter;
import homework.day6.playground.essense.creatures.playground.essense.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        int distance = pointB - pointA;
        System.out.printf("I am %s, my name is %s and I am moving from %s to %s.\n", this.getClass().getSimpleName(), this.getName(), pointA, pointB);
        return distance;
    }
}
