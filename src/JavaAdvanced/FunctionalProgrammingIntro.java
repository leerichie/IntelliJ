package JavaAdvanced;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "UseCompareMethod", "ComparatorCombinators"})
class FunctionalProgrammingIntro {
    static int compare(String s1, String s2) {
        System.out.println("compare " + s1 + " i " + s2);
        return Integer.compare(s1.length(), s2.length());
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("one", "two", "three"));

        list.sort(
                (s1, s2) -> Integer.compare(s1.length(), s2.length())
        );

        list.forEach(System.out::println);
    }
}