package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class PerfectNo {

    static long isPerfect(long num) {
        //variable stores the sum
        long sum = 0;
        //runs until the condition becomes false
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                //calculates the sum of factors
                sum = sum + i;
            }
        }
        //returns the sum of factors
        return sum;
    }       //end of method

    public static void main(String[] args) {

        long number;
        long s;

        Scanner perfect = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = perfect.nextLong();
        s = isPerfect(number);
        if (s == number)
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");


        // perfect number - RANGE from - to

        System.out.println("Enter Start Number");
        int start = perfect.nextInt();
        System.out.println("Enter End Number");
        int end = perfect.nextInt();

        System.out.println("Perfect Numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum = sum + j;
            }
            if (i == sum) System.out.print(i + "\t");
        }

    }
    public static boolean isPerfectNumber(int number) {         // boolean PERFECT NUMBER
        if (number % 2 == 1)
            return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                if (sum > number) {
                    return false;
                }
            }
        }
        return sum == number;
    }
}
