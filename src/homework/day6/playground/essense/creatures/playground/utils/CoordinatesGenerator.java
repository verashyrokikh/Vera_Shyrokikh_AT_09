package homework.day6.playground.essense.creatures.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate(){
        Random random = new Random();
        int x = random.nextInt(79);
        System.out.println("CoordinatesGenerator: I have generated point with value: " +x);
        return x;
    }
}
