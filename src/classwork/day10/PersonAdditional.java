package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonAdditional {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        long count = people.stream()
                .filter(s -> s.age >= 18)
                .filter(s -> (s.age < 55 && s.sex == Person.Sex.WOMEN) || (s.age < 60 && s.sex == Person.Sex.MAN))
                .count();

        System.out.println(count);
    }
}
