package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> streamFromElements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        streamFromElements
                .flatMap(s -> Stream.of(s.split(" ")))
                .map(s -> {
                    if (s.length() % 2 != 0) {
                        return s.replaceAll("e", "o");
                    } else {
                        return String.valueOf(s.length());
                    }
                })
                .distinct()
                .forEach(System.out::println);
    }
}
