// пройти по массиву и вывести в консоль все элементы
// вывести в консоль все элементы массива в обратном порядке

package homework.day1.cycletask;

import java.util.Random;

public class PrintArrayMethod {


    public void printArray(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[newArray.length - 1 - i] + " ");
        }
        System.out.println();
    }
}

