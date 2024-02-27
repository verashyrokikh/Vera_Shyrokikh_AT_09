package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class NoodlesCollection {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodlesElement : noodles){
            System.out.print(noodlesElement + "-");
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            String newNoodle = noodles.get(i).replace('a','o');
            System.out.println(newNoodle);
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
