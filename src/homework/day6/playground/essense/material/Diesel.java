package homework.day6.playground.essense.material;

import homework.day6.playground.essense.Matter;

public class Diesel extends Matter implements Pourable, Powerable {
    public Diesel(int mass) {
        super(mass);
    }

    @Override
    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s.\n", getClass().getSimpleName(), storeName);
        System.out.println("whooh..");
    }
}
