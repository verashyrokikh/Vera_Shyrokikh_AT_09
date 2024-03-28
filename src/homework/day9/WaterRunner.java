package homework.day9;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<WaterForRunner> water = Stream.of(
                new WaterForRunner("Прозрачная", "Нет"),
                new WaterForRunner("Прозрачная", "Нет"),
                new WaterForRunner("Мутная", "Аммиачный"),
                new WaterForRunner("Синяя", "Мятный"));
        System.out.println(water
                .filter(s -> s.color != "Прозрачная")
                .sorted((s1, s2) -> -s1.smell.compareTo(s2.smell))
                .map(s->s.smell.replaceAll("ы", "ыы"))
                .collect(Collectors.joining())
                .length());
    }
}

