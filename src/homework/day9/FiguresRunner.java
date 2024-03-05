package homework.day9;

import java.util.stream.Stream;


public class FiguresRunner {
    public static void main(String[] args) {

        Stream<String> streamFromFigures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        streamFromFigures
                .mapToInt(String::length)
                .filter(length -> length > 4)
                .forEachOrdered(System.out::println);
    }
}
