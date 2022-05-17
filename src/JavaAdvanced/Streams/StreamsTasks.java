package JavaAdvanced.Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamsTasks {
    static Optional<Character> fifthLetter(String s) {
        return s.length() < 5 ? Optional.empty() : Optional.of(s.charAt(4));
    }

    public static void main(String[] args) {
        Stream<String> strings = Stream.of("one", "two", "three", "four");

        Character x = strings
                .sorted()
                .findFirst()
                .flatMap(s -> fifthLetter(s))
                .orElse('x');
        System.out.println(x);
    }
}


        /*
         * zadanie: wypisz piątą literę pierwszego alfabetycznie elementu w strumieniu lub 'x' jeśli element jest zbyt krótki;
         * staramy się napisać program w jednym wyrażeniu (bez zmiennych pomocniczych);
         * metody, na które warto zwrócić uwagę (nie wszystkie będą potrzebne, można też używać innych):
         * min
         * sorted
         * findFirst
         * String::compareTo
         * Optional::flatMap
         * ifPresent
         * orElse
         */