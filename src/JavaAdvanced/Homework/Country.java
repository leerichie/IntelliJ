package JavaAdvanced.Homework;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("ClassCanBeRecord")
class Country {
    private final String name;
    private final Long population;

    Country(String name, Long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public Optional<Long> getPopulation() {
        return Optional.ofNullable(population);
    }
}

enum Gender {
    MALE, FEMALE, NON_BINARY;
}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final Country country;

    Person(String name, int age, Gender gender, Country country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    /*
     * Ogólne uwagi:
     * pracujemy tylko w funkcji main;
     * staramy się używać metod dostarczonych przez bibliotekę standardową;
     * piszemy program tak, żeby działał dla każdych danych, nie tylko dla podanej próbki;
     * można zmieniać dane testowe, ale pamiętamy o punkcie wyżej;
     * jeśli nie jesteśmy w stanie wykonać wszystkich punktów, wykonujemy niektóre;
     * jeśli nie jesteśmy w stanie zrealizować jakiegoś punktu w całości, robimy ile damy radę;
     * wiem, że jeszcze nie mieliśmy enumów; myślę, że domyślicie się, jak je obsłużyć, a jeśli nie, to nic nie szkodzi;
     * do każdego punktu trzeba osobno wywołać getPersonStream lub getCountryStream (jednego streama można użyć tylko raz)
     *
     * Zadania (każde realizujemy osobno i wyświetlamy wynik):
     * 1. Wypisujemy imiona dłuższe niż 3 znaki
     * 2. Wypisujemy wszystkie imiona wielkimi literami z pominięciem duplikatów
     * 3. Wypisujemy wiek najstarszego człowieka
     * 4. Wypisujemy imiona ludzi po przecinku
     * 5. Wypisujemy imię dowolnej osoby niebinarnej z UK
     * 6. Wypisujemy imiona mężczyzn, każde w nowej linii, a na końcu imiona kobiet w jednej linii, oddzielone przecinkami
     *       podpowiedź: na zajęciach zapomniałem powiedzieć, że lambda może być dłuższa niż 1 linia; przykład w kodzie
     * 7. Wypisujemy kraje jedno pod drugim w formacie "nazwa: populacja"; dla kraju bez populacji wypisujemy "nazwa: brak danych"
     * 8. Dla mężczyzn z pozycji 3-7 na liście, dla których mamy dane o populacji kraju, wypisujemy ich imię i populację
     *
     * Zadania dodatkowe:
     * 1. Wypisujemy statystyki wieku ludzi (min, max, średnia) używając metody summaryStatistics klasy IntStream
     * */


    private static final Country france = new Country("France", null); // brak danych o populacji
    private static final Country canada = new Country("Canada", 37_653_095L);
    private static final Country uk = new Country("United Kingdom", 67_791_734L);

    private static Stream<Country> getCountryStream() {
        return Stream.of(france, canada, uk);
    }

    private static Stream<Person> getPersonStream() {
        return Stream.of(
                new Person("John", 50, Gender.MALE, canada),
                new Person("May", 12, Gender.FEMALE, france),
                new Person("Tiff", 23, Gender.NON_BINARY, uk),
                new Person("Alex", 23, Gender.MALE, uk),
                new Person("Alex", 20, Gender.FEMALE, uk),
                new Person("Azul", 15, Gender.FEMALE, france),
                new Person("Samantha", 67, Gender.FEMALE, canada),
                new Person("Napoleon", 50, Gender.MALE, france)
        );
    }

    public static void main(String[] args) {
        getPersonStream()           // task 1
                .map(Person::getName)
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);

        List<String> filteredDistinctNames = getPersonStream()      // task 2
                .map(Person::getName)
                .distinct()
                .map(String::toUpperCase)
                .toList();
        filteredDistinctNames.forEach(System.out::println);

        getPersonStream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(s -> System.out.println(s.getName() + " " + s.getAge()));

        var b = getPersonStream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println(b);

        var c = getPersonStream()
                .filter(Person -> Person.getCountry().equals(uk))
                .filter(Person -> !Person.getGender().equals(Gender.NON_BINARY))
                .map(Person::getName)
                .findAny()
                .orElse("No such person");
        System.out.println(c);

        var x = getPersonStream()
                .peek(person -> {
                    if (person.getGender().equals(Gender.MALE)) {
                        System.out.println(person.getName());
                    }
                })
                .filter(person -> person.getGender() == Gender.FEMALE)
                .map(person -> person.getName())
                .collect(Collectors.joining(", "));
        System.out.println(x);

    }

}