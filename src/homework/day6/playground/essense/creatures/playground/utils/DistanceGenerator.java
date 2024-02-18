package homework.day6.playground.essense.creatures.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance(){
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.printf("DistanceGenerator: I have generated distance with value:.\n", x );
        return x;
    }
}
