package JavaAdvanced.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GroupingStreams {

    private record Person(String name, List<String> cars) {

        public String getName() {
            return name;
        }

        public List<String> getCars() {
            return cars;
        }
    }

    public static void main(String[] args) {

        var map = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(Collectors.groupingBy(i -> i % 3));
        System.out.println(map);

        var map2 = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(map2);

        // zadanie 1: podziel ludzi na posiadających i nieposiadających samochód
        // zadanie 2: posegreguj ludzi według liczby posiadanych przez nich samochodów

        List<Person> people = List.of(
                new Person("Adam", List.of("Ford")),
                new Person("Bartek", List.of("Fiat", "Mercedes")),
                new Person("Celina", List.of()),
                new Person("Darek", List.of("Mercedes", "Opel")),
                new Person("Ewa", List.of("Fiat"))
        );

        var map3 = people.stream()
                .map(Person::getCars)
                .collect(Collectors.partitioningBy(s -> !s.isEmpty()));
        System.out.println(map3);

        var map4 = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getCars().isEmpty()));

        System.out.println(map4);

        var map5 = people.stream()
                .map(Person::getCars)
                .collect(Collectors.groupingBy(i -> i.size()));
        System.out.println(map5);

        var map6 = people.stream()
                .collect(Collectors.groupingBy(p -> p.getCars().stream().count()));
        System.out.println(map6);

        var result1 = people.stream()
                .collect(Collectors.groupingBy(person -> person.getCars().size()));
        System.out.println(result1);


        System.out.println(
                Stream.of("ab", "bc", "cd")
                        .collect(Collectors.toMap(
                                s -> s.charAt(0),
                                s -> s.charAt(1)
                        ))
        );

        System.out.println(
                Stream.of("abcd", "bcd", "cd")
                        .collect(Collectors.toMap(
                                String::length,
                                s -> s.charAt(1)
                        ))
        );

        System.out.println(
                Stream.of("ab", "ac", "bc", "cd")
                        .collect(Collectors.groupingBy(
                                s -> s.charAt(0),
                                Collectors.mapping(s -> s.charAt(1), Collectors.toList())
                        ))
        );

        // Zadanie: pogrupuj ludzi po liczbie posiadanych przez nich samochodów.
        // W mapie zachowaj tylko liczbę samochodów i imiona

//        System.out.println(people
//                .stream(Collectors.groupingBy(person -> person.getCars().size(),
//                        Collectors.mapping(person -> person.getName(),
//                                Collectors.toList())))
//        );
    }
}