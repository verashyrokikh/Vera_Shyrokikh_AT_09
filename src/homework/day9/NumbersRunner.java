package homework.day9;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        Stream<Integer> streamFromNumbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        System.out.println(streamFromNumbers
                .peek(System.out::println)
                .sorted()
                .reduce(0, Integer::sum));
    }

}
