package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CitiesRunner {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        System.out.println(Stream.of("Минск", "Москва", "Берлин").mapToInt(String::length).sum());

    }
}
