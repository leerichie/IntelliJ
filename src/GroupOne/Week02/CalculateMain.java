package GroupOne.Week02;

import java.util.Scanner;

public class CalculateMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();


        double a;
        double b;

        System.out.println("provide number: ");
        a = scanner.nextDouble();
        System.out.println("area of square: " + calculate.square(a));
        System.out.println("provide no. ");
        b = scanner.nextDouble();
        System.out.println("area of triangle: " + calculate.triangle(a,b));

    }
}
