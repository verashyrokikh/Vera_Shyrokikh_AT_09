package homework.day7;

import java.util.Scanner;

public class TypeConsole {

    public static void main(String[] args) {
        Scanner typeFrase = new Scanner(System.in);

        while (typeFrase.hasNext()) {
            String typed = typeFrase.nextLine();
            System.out.println("Hello, I just got " + typed + " from you!");
        }
    }
}
