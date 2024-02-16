package homework.day5.playground.essense.creatures;

public class Beetle extends Insect {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        int massCompare =home.getMass()/mass;
     if (mass< home.getMass()){
         System.out.println("I am " + name + " and I will nest there with " + massCompare + " my family members!");
     }
    else {
        System.out.println("This carrot is too small for nesting :(");
     }
    }
}
