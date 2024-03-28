package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class CitiesCollection {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String citiesElement : cities) {
            System.out.println(citiesElement);
        }

        int sumChars = 0;
        for (String citiesElement : cities) {
            sumChars += citiesElement.length();
        }
        System.out.println(sumChars);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i).toString() + " ");
        }
    }
}
