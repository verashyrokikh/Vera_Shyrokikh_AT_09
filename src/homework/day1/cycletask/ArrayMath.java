//- каждый элемент массива умножить на 5 и вывести результат в консоль
//- каждый элемент массива возвести в квадрат и вывести результат в консоль

package homework.day1.cycletask;

public class ArrayMath {
    int[] array = new int[10];

    public void arrayMath() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

