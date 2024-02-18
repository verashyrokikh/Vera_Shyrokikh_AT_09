package homework.day6.playground.essense.creatures.playground.essense.creatures;

import homework.day6.playground.essense.creatures.playground.essense.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s.\n", getClass().getSimpleName(), this.getName(), direction);
    }
}
