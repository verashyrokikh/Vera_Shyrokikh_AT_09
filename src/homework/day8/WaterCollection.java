package homework.day8;

import homework.day8.objects.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterCollection {
    public static void main(String[] args) {
        List<Water> water = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная","Нет"), new Water("Мутная","Аммиачный")));

        for(Water waterElement : water){
            System.out.println(waterElement.getColor() + "-" + waterElement.getSmell());
        }
    }
}
