package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BirdsCollection {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String birdsElements : birds) {
            System.out.println("--" + birdsElements + "--");
        }

        for (String birdsElements : birds) {
            int number=0;
         //   int vowelsInName = countVowels(birdsElements);
          //  if (vowelsCount > 1){
          //      number++};
          //  System.out.println(number);
        }

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(2, "Синица");

        for (String birdsElements : birds) {
            System.out.println(birdsElements + " ");
        }
    }
}
