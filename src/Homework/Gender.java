package Homework;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("*********************************************************\n"
                            + "\t\t\tWelcome to 'Gender Check'\n"
                            + "Let's say that names generally ending in 'a' are feminine\n"
                            + "*********************************************************\n");

        System.out.println("Wpisz imie (sprawdzamy płeć): ");
        name = scanner.nextLine();

        if (name.endsWith("a")){
            System.out.println("Kobieta");
        } else {
            System.out.println("Mezyczyzna");
        }



    }
}
