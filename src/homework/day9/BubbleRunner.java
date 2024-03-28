package homework.day9;

import project.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleRunner {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));
        System.out.println(bubbles.stream()
                .filter(s -> s.volume > 3)
                .sorted((s1, s2) -> s1.name.compareTo(s2.name))
                .map(s -> (s.volume*3))
                .reduce(Double::sum));
    }
}
