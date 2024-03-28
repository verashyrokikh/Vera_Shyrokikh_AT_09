package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarsCollection {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try {
            BufferedWriter writeElement = new BufferedWriter(new FileWriter("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\cars.txt", true));
            for (String carsElement : cars) {
                writeElement.write(carsElement);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String carElement = iterator.next();
            if (carElement.length() > 4) {
                iterator.remove();
            }
        }

        for (String carsElement : cars) {
            System.out.print(carsElement + " ");
        }
    }
}

