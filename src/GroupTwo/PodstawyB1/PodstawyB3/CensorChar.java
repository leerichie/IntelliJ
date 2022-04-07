package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class CensorChar {
    public static void main(String[] args) {

        Scanner censor = new Scanner(System.in);
        System.out.print("Name: ");
        String name = censor.nextLine();
        System.out.print("Age: ");
        int age = censor.nextInt();
        censor.nextLine();           // needed after int
        System.out.println("Enter sentence for censoring: ");
        String str = censor.nextLine();     // next() looks for next char/string
        System.out.println("Enter character for replacing: ");
        char c = censor.next().charAt(0);    // (0) returns range of chars
        System.out.println("Enter replacement character: ");
        char r = censor.next().charAt(0);

        String replacedstring = str.replace(c, r); // chars
        System.out.println("Censored version: " + replacedstring);
    }

    public String censorNames(String text) {        // ver.1
        char[] chars = text.toCharArray();
        boolean isName = false;

        for (int i = 1; i < text.length(); i++) {
            char current = chars[i];
            if (current >= 'A' && current <= 'Z') {
                isName = true;
            } else if (isName && current >= 'a' && current <= 'z') {
                chars[i] = '*';
            } else {
                isName = false;
            }
        }

        return String.valueOf(chars);
    }
    public static String censoreNames(String text) {
        String words[] = text.split(" ");
        String result = words[0];

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0);
            if (firstLetter >= 'A' && firstLetter <= 'Z') {
                word = firstLetter + createLongCensorship(word.length());
            }
            result += " " + word;
        }
        return result;
    }

    private static String createLongCensorship(int length) {    // ver.2 with String
        String result = "";
        for (int i = 0; i < length - 1; i++) {
            result += "*";
        }
        return result;
    }

    public static String censoreNameRegExp(String text) {       // regex
        String namePattern = "[A-Z][a-z].*";
        String words[] = text.split(" ");
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (word.matches(namePattern)) {
                word = word.replaceAll("[a-z]", "*");
            }
            result += " " + word;
        }
        return result;

    }
}
