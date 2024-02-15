//- поменять местами первый и последний элементы и вывести результат в консоль

package homework.day1.cycletask;


public class ArraySorting {
    public void changeArrayValues() {

        int[] someArray = {3, 5, 2, 8, 9, 4, 2, 6, 7, 1};
        for (int i = 0; i < someArray.length; i++) {
            someArray[0] = someArray[someArray.length - 1];

            System.out.print(someArray[i] + " ");
        }
    }
}
