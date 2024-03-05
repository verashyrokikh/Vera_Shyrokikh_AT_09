package classwork.day10;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Alfabet {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Minsk", "Riga", "Warsaw", "Vilnius", "Ankara");
        cities.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

        cities.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        people.stream()
                .sorted((s1,s2)->{
                    if (s1.sex!=s2.sex) {
                        return s1.sex.compareTo(s2.sex);
                    }else{
                        return s1.age - s2.age;
                    }
                })
                .peek(s->System.out.println(s.name))
                .collect(Collectors.toList());
    }
}
