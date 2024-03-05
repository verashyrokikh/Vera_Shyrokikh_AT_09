package homework.day9;

import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> streamFromNumbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        streamFromNumbersMod
                .map(s -> s.toString())
                .filter(s -> s.contains("3"))
                .flatMap(s -> Stream.of(s.split("")))
                .map(s -> s.replaceAll("1", "one"))
                .map(s -> s.replaceAll("2", "two"))
                .map(s -> s.replaceAll("3", "three"))
                .map(s -> s.replaceAll("4", "four"))
                .map(s -> s.replaceAll("5", "five"))
                .map(s -> s.replaceAll("6", "six"))
                .map(s -> s.replaceAll("7", "seven"))
                .map(s -> s.replaceAll("8", "eight"))
                .map(s -> s.replaceAll("9", "nine"))
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}

