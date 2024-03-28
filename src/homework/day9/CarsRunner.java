package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
        Stream<String> streamFromCars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
        streamFromCars
                .distinct()
                .filter(s -> s.contains("и"))
                .skip(1)
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
