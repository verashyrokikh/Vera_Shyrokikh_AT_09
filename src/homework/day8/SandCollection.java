package homework.day8;


import homework.day8.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandCollection {
    public static void main(String[] args) {
        List<Sand> sand = new ArrayList<>();
        sand.add(new Sand(2, "Речной"));
        sand.add(new Sand(4, "Речной"));
        sand.add(new Sand(2, "Карьерный"));
        sand.add(new Sand(7, "Речной"));

        for (Sand sandElement : sand) {
            System.out.print(sandElement.getWeight() + " ");
        }
        System.out.println();

        for (Sand sandElement : sand) {
            System.out.print(sandElement.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();
        for (int i = 0; i < sandMap.size(); i++) {
            sandMap.put(i, sand.get(i));
        }


    }
}
