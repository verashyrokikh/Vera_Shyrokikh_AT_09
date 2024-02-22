package homework.day6.playground.runners;

import homework.day6.playground.essense.Matter;
import homework.day6.playground.essense.craft.hand.Bottle;
import homework.day6.playground.essense.craft.hand.Can;
import homework.day6.playground.essense.craft.hand.Container;
import homework.day6.playground.essense.craft.hand.Storable;
import homework.day6.playground.essense.material.*;

import homework.day6.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
    public static void main(String[] args) {
        StorableProcessor storableProcessor = new StorableProcessor();
        // первая группа:
        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");
        //вторая группа:
        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
        storableProcessor.runStorable((Storable) containerBottle, pourableDiesel);
        storableProcessor.runStorable((Storable) matterBottle, (Pourable) powerableDiesel);
        storableProcessor.runStorable(can, (Pourable) matterPetrol);
        storableProcessor.runStorable(storableCan, water);
        storableProcessor.runStorable((Storable) containerCan, pourableWater);
        storableProcessor.runStorable((Storable) matterCan, water);

    }
}
