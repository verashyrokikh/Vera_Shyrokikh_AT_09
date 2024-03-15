package homework.day9;


import project.Bubble;

import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        Stream<ChairForRunner> furniture = Stream.of(
                new ChairForRunner(120, 40),
                new ChairForRunner(90, 30),
                new ChairForRunner(100, 50),
                new ChairForRunner(110, 45));
        furniture
                .filter(s -> (s.height >= 100 && s.width <= 50))
                .sorted((s1, s2) -> {
                    if (s1.height != s2.height) {
                        return s2.height - s1.height;
                    } else {
                        return s2.width - s1.width;
                    }
                })
                .map(s -> new ChairForRunner(s.height % 2, s.width * (new Random().nextInt(6) + 3)))
                .map(s -> s.height * s.width)
                .distinct()
                .max(Integer::compareTo)
                .map(number -> {
                    char[] charArray =Integer.toString(number).toCharArray();
                    StringBuilder bubbleName = new StringBuilder();

                    for (char ch : charArray){
                        switch (ch){
                            case '0' -> bubbleName.append("zero");
                            case '1' -> bubbleName.append("one");
                            case '2' -> bubbleName.append("two");
                            case '3' -> bubbleName.append("three");
                            case '4' -> bubbleName.append("four");
                            case '5' -> bubbleName.append("five");
                            case '6' -> bubbleName.append("six");
                            case '7' -> bubbleName.append("seven");
                            case '8' -> bubbleName.append("eight");
                            case '9' -> bubbleName.append("nine");
                            default -> bubbleName.append(" ");
                        }
                    }
                    return new Bubble(number, bubbleName.toString());
                });

    }
}

