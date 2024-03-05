package homework.day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SandRunner {
    public static void main(String[] args) {
        List<SandForRunner> sandbox = new ArrayList<>();
        sandbox.add(new SandForRunner(12, "Речной"));
        sandbox.add(new SandForRunner(8, "Речной"));
        sandbox.add(new SandForRunner(15, "Карьерный"));
        sandbox.add(new SandForRunner(7, "Карьерный"));
        sandbox.add(new SandForRunner(11, "Речной"));

//        sandbox.stream()
//                .filter(s -> (s.weight > 9 && s.name.contains("ч")))
//                .sorted((s1, s2) -> s1.weight.compareTo(s2.weight))
//                .map(s -> (s.weight * 2 && s.name.toUpperCase()))
//                .collect(Collectors.toMap(s -> s.weight, s -> s.name));
//        try {
//            FileWriter writer = new FileWriter(("sand.txt"));
//            writer.write(s.name:s.weight);
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
    }
}
