package homework.day5.playground.processors;

import homework.day5.playground.essense.Flyable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {


    public static void runFlyable(Flyable flyable){
    flyable.fly(generateDirection());

    }
    public static void runFlyable(Flyable flyable, String direction){
        flyable.fly(direction);
    }
}
