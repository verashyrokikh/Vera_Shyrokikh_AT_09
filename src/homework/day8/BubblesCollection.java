package homework.day8;


import homework.day8.objects.Bubble;

import java.util.*;

public class BubblesCollection {
    public static void main(String[] args) {
        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4,"O2"), new Bubble(5,"CO")));

        for (Bubble bubbleElement : bubbles) {
            System.out.print(bubbleElement.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubbleElement : bubbles) {
            System.out.print(bubbleElement.getName() + " ");
        }

        int jointVolume = 0;
        for (Bubble bubbleElement : bubbles) {
            jointVolume += bubbleElement.getVolume();
            System.out.println(jointVolume);
            }

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}