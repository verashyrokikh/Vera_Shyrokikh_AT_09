package homework.day6.playground.essense.creatures.playground.essense.material;

import homework.day6.playground.essense.creatures.playground.essense.Matter;

public class Water extends Matter implements Pourable {
    public Water(int mass) {
        super(mass);
    }

    @Override
    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s.\n", getClass().getSimpleName(), storeName);
        System.out.println("whobl-whobl..");
    }

}
