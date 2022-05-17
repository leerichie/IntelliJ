/*
package JavaAdvanced.Streams;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalExample {
    static Optional<Integer> libraryMethod() {
        if (new Random().nextBoolean()) {
//            return Optional.of(6);
            return Optional.of(Random.nextInt(20));
        } else {
            return Optional.empty();
        }
    }

    static String getName(int i) {
        List<String> names = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero");
        return names.get(i)
    }

    public static void main(String[] args) {
//        List<String> names = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero");
        Optional<Integer> result = libraryMethod();

//        if (result.isPresent()) {
//            System.out.println(result.get());

//        result.ifPresent(
//            i -> System.out.println(i)
//        );

        result
                .map(i -> getName(i))
//                .map(i -> names.get(i))
//                .filter(s -> s.contains("v"))
                .ifPresent(s -> System.out.println(s))
        ;


//        System.out.println(result.orElse(0));
    }
}
*/
