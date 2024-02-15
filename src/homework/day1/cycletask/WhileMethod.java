//используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел

package homework.day1.cycletask;

public class WhileMethod {
    public void whileMethod() {
        int x = 0;

        while (x < 20) {
            System.out.print(" " + x++);
        }
    }
}

