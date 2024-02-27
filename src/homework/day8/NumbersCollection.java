package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersCollection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        for (Integer numberElement : numbers) {
            System.out.println(numberElement);
        }

        int sum = 0;
        for (Integer numberElement : numbers) {
            sum += numberElement;
        }
        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
        Collections.reverse(numbers);

        for (Integer numberElement : numbers) {
            System.out.print(numberElement + " ");
        }
    }
}
