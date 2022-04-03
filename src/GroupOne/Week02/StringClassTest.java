package GroupOne.Week02;

import java.util.Scanner;

public class StringClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Informatyka :)";
        String a;
        String b;
        String c;
        name.toUpperCase();
        System.out.println(name.toUpperCase());

        String text1 = name;
        System.out.println(name);
        System.out.println(text1 !=name);
        System.out.println(name.length() + " " + text1);
        System.out.println(name.indexOf("s"));

        System.out.println("enter word: ");
        a = scanner.nextLine();
        System.out.println("that in caps: " + a.toUpperCase());
        System.out.println("Wpisz rozmiar obwod klatke: ");
        b = scanner.nextLine();
        System.out.println("Wpisz rozmiar miska: ");
        c = scanner.nextLine();


    }
}
