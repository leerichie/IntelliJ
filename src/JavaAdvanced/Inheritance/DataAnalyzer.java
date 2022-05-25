package JavaAdvanced.Inheritance;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class DataAnalyzer {
    private final Supplier<List<String>> dataSource;
    private final Function<List<String>, Integer> dataAnalysis;

    DataAnalyzer(Supplier<List<String>> dataSource, Function<List<String>, Integer> dataAnalysis) {
        this.dataSource = dataSource;
        this.dataAnalysis = dataAnalysis;
    }

    final int analyze() {
        List<String> data = dataSource.get();
        return dataAnalysis.apply(data);
    }
}

class AbstractClassExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<List<String>> stdInReader =
                () -> Stream
                        .generate(() -> scanner.next())
                        .limit(5)
                        .toList();

        Supplier<List<String>> randomUuidGenerator =
                () -> Stream
                        .generate(() -> UUID.randomUUID().toString())
                        .limit(5)
                        .toList();

        Function<List<String>, Integer> threeLetterComparator =
                data -> (int) data.stream()
                        .map(s -> s.length() >= 3 ? s.substring(0, 3) : s)
                        .distinct()
                        .count();

        Function<List<String>, Integer> firstCharComparator =
                data -> (int) data.stream()
                        .map(s -> s.length() >= 3 ? s.substring(0, 1) : s)
                        .distinct()
                        .count();

        System.out.println(
                new DataAnalyzer(stdInReader, threeLetterComparator)
                        .analyze()
        );

        DataAnalyzer dataAnalyzer2 = new DataAnalyzer(randomUuidGenerator, threeLetterComparator);
        System.out.println(dataAnalyzer2.analyze());

        DataAnalyzer dataAnalyzer3 = new DataAnalyzer(randomUuidGenerator, firstCharComparator);
        System.out.println(dataAnalyzer3.analyze());

    }
}