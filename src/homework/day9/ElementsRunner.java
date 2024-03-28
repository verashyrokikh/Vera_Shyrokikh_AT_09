package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        Stream<String> streamFromElements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        streamFromElements
                .map(s -> {
                    List<String> newList = Arrays.asList(s.split(" "));
                    for (int i = 0; i < newList.size(); i++) {
                        if (i % 2 == 0) {
                            newList.set(i, newList.get(i).replaceAll("e", "o"));
                        } else {
                            newList.set(i, String.valueOf(newList.get(i).length()));
                        }
                    }
                    return String.join("",newList);
                })
                .distinct()
                .forEach(System.out::println);
    }
}
