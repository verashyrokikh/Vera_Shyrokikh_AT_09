package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {

        Random random = new Random();

        String direction;
        int num = random.nextInt(40);

        if (num < 10) {
            direction = "NORTH";
        } else if (10<num && num<20) {
            direction = "SOUTH";
        }
        else if (20<num && num<30){
            direction = "WEST";
        }
        else {
            direction = "EAST";
        }
        return direction;
    }
}
