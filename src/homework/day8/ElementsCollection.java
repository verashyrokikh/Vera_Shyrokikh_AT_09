package homework.day8;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ElementsCollection {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String elementsElement : elements) {
            System.out.print(elementsElement + " ");
        }
        System.out.println();

        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        try {
            int number = 0;
            for (String elementsElement : elements) {
                if (elementsElement.contains("-") | elementsElement.contains(" ")) {
                    number++;
                }
            }
            System.out.println(number);
        } catch (ConcurrentModificationException e) {
            System.out.println("An error here " + e.getMessage());


            for (int i = 0; i < elements.size(); i++) {
                System.out.print(elements.get(i) + " ");
            }
            System.out.println();

            elements.add(4, "Spinner");
            elements.remove(1);
            elements.set(4, "Switch");
        }

        for (String elementsElement : elements) {
            System.out.print(elementsElement + " ");
        }
    }
}
