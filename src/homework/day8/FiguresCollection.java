package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresCollection {
    public static void main(String[] args) {
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        try {
            BufferedWriter writeElement = new BufferedWriter(new FileWriter("C:\\Users\\vera.shyrokikh\\Github_repo\\Vera_Shyrokikh_AT_09\\out\\production\\First_project\\homework\\figures.txt", true));
            //в файл печататется только первое слово
            for (String figuresElement : figures) {
                writeElement.write(figuresElement + "-");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Writing done");

        for (String figuresElement : figures) {
            int number = 0;
            if (!figuresElement.contains("и")) {
                number++;
            }
            System.out.println(number);
        }

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i).toString() + " ");
        }
        System.out.println();

        figures.add(3, "Треугольник");

        for (String listElement : figures) {
            System.out.print(listElement + " ");
        }
    }
}

