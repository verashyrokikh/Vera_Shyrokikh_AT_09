package homework.day6.playground.essense.creatures.playground.processors;

import homework.day6.playground.essense.creatures.playground.essense.craft.Rideable;
import homework.day6.playground.essense.creatures.playground.utils.DirectionGenerator;

public class RideableProcessor{

    public void runRideable(Rideable rideable){
        rideable.drive(DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction){
        rideable.drive(direction);
    }
}
