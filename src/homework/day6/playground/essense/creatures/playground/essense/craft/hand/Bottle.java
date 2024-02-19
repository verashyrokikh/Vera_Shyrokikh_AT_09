package homework.day6.playground.essense.creatures.playground.essense.craft.hand;


import homework.day6.playground.essense.creatures.playground.essense.material.Pourable;

public class Bottle extends Container implements Storable {
    public Bottle(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        System.out.printf("I am %s, my name is %s and I received %s of %s.\n", getClass().getSimpleName(), this.getName(),amount,pourable.getClass().getSimpleName());
        if (amount > mass){
        System.out.println("wooh-wooh-wooh-hh..");
        }
    }
}

