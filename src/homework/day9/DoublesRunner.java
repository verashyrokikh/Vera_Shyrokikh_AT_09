package homework.day9;

import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> streamFromDoubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        streamFromDoubles
                .map(s->s.intValue())

                .forEach(System.out::println);
    }
}
