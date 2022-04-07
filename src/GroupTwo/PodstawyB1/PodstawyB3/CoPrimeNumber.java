package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class CoPrimeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, p, i, x = 0;
        System.out.println("Enter first number: ");
        a = in.nextInt();

        System.out.println("Enter second number: ");
        b = in.nextInt();

        p = a * b;

        for (i = 1; i < p; i++) {
            if (a % i == 0 && b % i == 0) {
                x = i;
            }
        }
        if (x == 1) {
            System.out.println("Numbers are Co prime : " + a + " & " + b);
        } else {
            System.out.println("Numbers are not Co prime : " + a + " & " + b);
        }
    }


    public static void showCoprimeTable(int n) {            // ver. learn
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    System.out.print(j);
                } else if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(areCoprime(i, j)? "+" : ".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static boolean areCoprime(int a, int b) {
        int min = Math.min(a, b);
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                return false;
        }
        return true;
    }
}


