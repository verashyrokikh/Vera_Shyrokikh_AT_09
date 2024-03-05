package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> streamFromCountries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        streamFromCountries
                .filter(s->s.matches(".*[аоиеу].*"))
                .filter(s->s.length()<7)
                .map(String::valueOf)
                .map(String::toUpperCase)
                .map(s -> "\"" + s + "\"")
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }
}
