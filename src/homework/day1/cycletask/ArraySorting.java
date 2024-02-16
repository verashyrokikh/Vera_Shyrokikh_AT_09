//- поменять местами первый и последний элементы и вывести результат в консоль
//- найти минимальный элемент массива и вывести результат в консоль
// отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
package homework.day1.cycletask;


public class ArraySorting {
    int[] someArray = {3, 5, 2, 8, 9, 4, 2, 6, 7, 1};

    public void changeArrayValues() {

        int temp;
        temp = someArray[0];
        someArray[0] = someArray[someArray.length - 1];
        someArray[someArray.length - 1] = temp;
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + " ");
        }
        System.out.println();
    }

    public void findMin() {
        int tempMin = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (someArray[i] < tempMin) {
                tempMin = someArray[i];

            }
        }
        System.out.println(tempMin);
    }

//    public void reverseSorting() {
//
//        System.out.println();
//    }

}

