package homework.day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        Stream<PersonForRunner> people = Stream.of(
                new PersonForRunner(32, "Коля"),
                new PersonForRunner(24, "Оля"),
                new PersonForRunner(55, "Вася"),
                new PersonForRunner(63, "Маша"));
        System.out.println(people
                .filter(s -> s.age < 60)
                .sorted((s1, s2) -> s1.name.compareTo(s2.name))
                .mapToInt(s -> s.age + 4)
                .average()
        );
        try {
            FileWriter writer = new FileWriter(("average_age.txt"));
            writer.write(String.valueOf(people));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());

        }
    }
}
