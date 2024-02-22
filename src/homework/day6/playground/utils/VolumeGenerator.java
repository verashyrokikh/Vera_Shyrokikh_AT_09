package homework.day6.playground.utils;

import homework.day6.playground.essense.material.Diesel;
import homework.day6.playground.essense.material.Petrol;
import homework.day6.playground.essense.material.Pourable;
import homework.day6.playground.essense.material.Water;

import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        Random random = new Random();
        int volume = 0;
        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(50);
        }
        if (pourable instanceof Water) {
            volume = random.nextInt(50, 100);
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %s.\n", pourable.getClass().getSimpleName(),volume);
        return volume;
    }
}

