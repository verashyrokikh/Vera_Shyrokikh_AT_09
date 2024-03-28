package homework.day9;

import project.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> streamFromDoubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        streamFromDoubles
                .mapToLong(Math::round)
                .boxed()
                .map(s -> new Random().nextInt(0, Math.toIntExact(s) + 1))
                .distinct()
                .flatMap(s -> IntStream.range(0, s).mapToObj(i -> new Bubble(s, "Bubble vol-" + s)))
//                second possible solution:
//                .flatMap(integer -> {
//                    List<Bubble> listBubbles = new ArrayList<>();
//                    for (int i = 0; i < integer; i++) {
//                        listBubbles.add(i, new Bubble(integer, "Bubble vol-" + integer));
//                    }
//                    return listBubbles.stream();
//                })
                .forEach(System.out::println);
    }
}
