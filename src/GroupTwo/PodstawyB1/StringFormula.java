package GroupTwo.PodstawyB1;

import java.util.Scanner;

public class StringFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ala ma kota a kot ma Ale");

        String findLetter;
        System.out.println("provide letter: ");
        findLetter = scanner.next();
        System.out.println(findLetter.indexOf(1));

    }
}
