//создать пустой массив типа int и размера n = 7 и
// заполнить его случайными элементами используя Random.nextInt(n)

package homework.day1.cycletask;

import java.util.Random;

public class RandomIntoArray {
    public void randomArray() {
        int[] fillInArray = new int[7];
        Random random = new Random();
        for (int i = 0; i < fillInArray.length; i++) {
            fillInArray[i] = random.nextInt(100);
            System.out.println(fillInArray[i]);
        }
    }
}

