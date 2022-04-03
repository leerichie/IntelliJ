package GroupOne.Week03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPattern {       // Regex = Regular Expressions
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("L{1,4}e{2,8}");      //("[0-10]+5")
        Matcher matcher = pattern.matcher("Leeeeeee");       // "15"
        // System.out.println(matcher.pattern()); // outputs pattern
        System.out.println(matcher.matches()); // outputs match
        System.out.println(matcher.find(8));




//        Scanner scanner = new Scanner(System.in);
//        String name;
//        System.out.println("Enter name: ");
//        name = scanner.nextLine();

    }
}
