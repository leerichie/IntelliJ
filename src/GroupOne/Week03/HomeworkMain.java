package GroupOne.Week03;

import java.util.Scanner;
import java.util.SplittableRandom;

public class HomeworkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homework myHomework = new Homework("King", "British", 2018);
        System.out.println(myHomework.dogName + myHomework.breed + myHomework.yearOfBirth);

        String name = myHomework.dogName;
        String breed = myHomework.breed;
        int year = myHomework.yearOfBirth;

        System.out.println("Enter pet name: ");
        name = scanner.nextLine();
        System.out.println("Enter breed: ");
        breed = scanner.nextLine();
        System.out.println("Date of birth: ");
        year = scanner.nextInt();

        System.out.println("Name: " + name +
                             "\nBreed: " + breed +
                                "\nBirth year: " + year);



    }



}
