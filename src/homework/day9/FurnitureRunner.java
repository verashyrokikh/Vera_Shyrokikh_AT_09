package homework.day9;

import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        Stream<ChairForRunner> furniture = Stream.of(
                new ChairForRunner(120, 40),
                new ChairForRunner(90, 30),
                new ChairForRunner(100, 50),
                new ChairForRunner(110, 45));
//        furniture
//                .filter(s -> (s.height >= 100 && s.width <= 50))
//                .sorted((s1,s2)-> {
//                    if (s1.height!=s2.height) {
//                        return s1.height.compareTo(s2.height);
//                    }else{
//                        return -s1.width.compareTo(s2.width);
//                    }
//                })
//                .map(s->(s.height%2 && s.width*random[3,8]))
//                .map(s->s.height*s.width)
//                .distinct
//                .max()
            }
}
