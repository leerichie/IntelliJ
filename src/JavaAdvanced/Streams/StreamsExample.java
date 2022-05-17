package JavaAdvanced.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        List<String> names = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero");

        Integer[] arr = {1, 2, 3, 4, 5,};

        var x =
//                Stream.of(1,2,3)
//                Arrays.stream(arr)
//                Stream.generate(() -> 7)
                Stream.iterate(6, i -> i + 3)

                        .peek(System.out::println)
//                        .limit(3)
                        .takeWhile(i -> i < 11)

//                numbers.stream()
                        .filter(integer -> integer % 2 == 1)
                        .map(names::get)
//                        .filter(i -> i < 7)
                        .filter(s -> s.length() > 3)        // get string bigger than 3 chars
                        .map(s -> s.charAt(2))          // 3rd char of each string

//                        .map(i -> i - i)
//                        .map(i -> numString.get(i))

                        .collect(Collectors.toList());
        System.out.println(x);

//        var y =
//                numbers.stream()
//                        .filter(j -> j % 2 == 0)
//                        .filter(j -> j < 7)
//                        .map(j -> names.subList(0,3))
//                        .collect(Collectors.toList());
//        System.out.println(y);

    }
}
//ZADANIE:
//        * Zaczynamy od listy numbers
//        * otrzymujemy nazwy liczb nieparzystych
//        * wybieramy nazwy dłuższe niż 3 znaki
//        * bierzemy 3 znak z każdej nazwy
//        * */
