package homework.day8;

import java.util.*;

public class DoublesCollection {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (Double doubleElement : doubles) {
            System.out.print(doubleElement + " ");
        }
        System.out.println();

        double multiply = 1;
        for (Double doubleElement : doubles) {
            multiply *= doubleElement;
        }
        System.out.printf(" %.2f ", multiply);

        //найти сумму всех дробных частей и вывести результат в консоль

        //Вывести целые части в консоль

        for (int i = 0; i < doubles.get(i); i++) {
            System.out.print( doubles + " ");

        }
    }

}

