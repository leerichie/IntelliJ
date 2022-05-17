package JavaAdvanced.Streams;

import java.util.Comparator;
import java.util.List;

public class StreamsTwo {

    private record Person(String name, List<String> cars) {
        public String getName() {
            return name;
        }
        public List<String> getCars() {
            return cars;
        }
    }
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Adam", List.of("Ford")),
                new Person("Bartek", List.of("Fiat", "Mercedes")),
                new Person("Celina", List.of()),
                new Person("Darek", List.of("Mercedes", "Opel")),
                new Person("Ewa", List.of("Fiat"))
        );

        people
                .stream()
                .flatMap(p -> p.getCars().stream())
                .sorted(Comparator.comparing(String::length))
                .distinct()
                .toList();
        System.out.println(people);

        // zadanie: wypisz wszystkie samochody, posortowane po długości nazwy, bez duplikatów
    }

}