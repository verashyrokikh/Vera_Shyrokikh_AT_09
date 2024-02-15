//используя for вывести в консоль каждое нечетное число от 3 до 19 включительно

package homework.day1.cycletask;

public class ForMethod {
    public void forCycleMethod() {
        for (int i = 3; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
