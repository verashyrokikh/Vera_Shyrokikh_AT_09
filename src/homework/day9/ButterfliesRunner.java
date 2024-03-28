package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        String butterfly = String.valueOf(butterflies.stream()
                .map(s -> "\"" + s + "\"")
                .filter(s -> s.contains("a") && s.contains("o"))
                .collect(Collectors.toList()));
        System.out.println(butterfly);
    }
}
