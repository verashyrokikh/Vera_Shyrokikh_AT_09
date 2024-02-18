package homework.day6.playground.essense.creatures.playground.essense.creatures;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }
    public void eat(Insect food) {
        System.out.println("I am " + name + "and I'm eating " + food);
    }
}
