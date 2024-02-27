package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class CountriesCollection {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String countriesElement : countries) {
            System.out.print(countriesElement + ", ");
        }
        System.out.println();

        for (String countriesElement : countries) {
            int counter = 0;
            if (countriesElement.length() < 7) {
                counter++;
            }
            System.out.println(counter);
        }

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
