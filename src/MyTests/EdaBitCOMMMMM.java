package MyTests;

import java.util.Scanner;

public class EdaBitCOMMMMM {
    public static void main(String[] args) {

        EdaBitCom obj = new EdaBitCom();
        int num1;
        int num2;
        String name1;
        String name2;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Enter a number: ");
        num1 = sc.nextInt();
        System.out.println("2. Enter a second number: ");
        num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name: ");
        name1 = sc.nextLine();
        System.out.println("Enter second name: ");
        name2 = sc.nextLine();

        int result = obj.numbers(num1, num2);
        String result1 = obj.name(name1,name2);

        System.out.println("Result: " + result);
        System.out.println("Names: " + result1);

    }
}
