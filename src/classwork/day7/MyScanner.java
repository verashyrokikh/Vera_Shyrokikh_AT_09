package classwork.day7;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("homework")) {
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
