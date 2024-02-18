package homework.day5.playground.essense.creatures;

import homework.day5.playground.essense.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s.\n", getClass().getSimpleName(), this.getName(), direction);
    }
}
