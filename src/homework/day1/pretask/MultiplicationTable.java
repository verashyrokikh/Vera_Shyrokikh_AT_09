//класс MultiplicationTable, используя цикл for,
// выведите на экран таблицу умножения для числа 5 (1 5, 2 5, и так
package homework.day1.pretask;

public class MultiplicationTable {

    public static void main(String[] args) {
        int a = 5;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(a +" * "+ i + " = "+ a*i);
        }

    }
}
