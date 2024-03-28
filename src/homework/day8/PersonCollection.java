package homework.day8;


import homework.day8.objects.Person;

import java.util.ArrayList;
import java.util.List;


public class PersonCollection {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(32, "Коля"));
        persons.add(new Person(24, "Оля"));
        persons.add(new Person(55, "Вася"));
        persons.add(new Person(63, "Маша"));

        for (Person personElement : persons) {
            System.out.print(personElement.getAge() + " ");
        }
        System.out.println();

        for (Person personElement : persons) {
            System.out.print(personElement.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).toString());
        }
    }
}
