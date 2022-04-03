package GroupOne.Week01;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner myTest = new Scanner(System.in);

        int number1; // first to compare
        int number2; // second to compare

        System.out.print( "Input first integer: " );
        number1 = myTest.nextInt(); // read first number from user

        System.out.print( "Input second integer: " );
        number2 = myTest.nextInt(); // read second number from user

        System.out.println("Is the first integer bigger than the second?");
        number2 = myTest.nextInt();


        if (number1 > number2) {
            System.out.println("correct");
        } else {
            System.out.println("try again");
        }


    }
}
