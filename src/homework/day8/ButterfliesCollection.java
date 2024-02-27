package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesCollection {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String listElement : butterflies) {
            System.out.printf(" '%s' \n", listElement);
        }

        for (String listElement : butterflies) {
            int number = 0;
            if (listElement.contains("o")) {
                number++;
            }
            System.out.println(number);
        }

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i).toString() + " ");
        }
        System.out.println();

        for (String listElement : butterflies) {
            System.out.println(listElement);
        }
    }
}
