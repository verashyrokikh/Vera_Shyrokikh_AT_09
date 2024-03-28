package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));
        Arrays.stream(birds.stream()
                        .map(s -> s.replaceAll("о", "а"))
                        .collect(Collectors.joining())
                        .toLowerCase()
                        .replaceAll("ь", "")
                        .split("б"))
                .forEach(s -> System.out.println("--" + s + "--"));
    }
}
