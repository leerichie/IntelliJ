package GroupOne.Week01;

import java.util.Scanner;

public class VariableScan {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        System.out.println("Provider a number:");
        Scanner myInt = new Scanner(System.in);
        a = myInt.nextInt();

        System.out.println("Provide another number:");
        b = myInt.nextInt();

        if (a > b) {
            System.out.println("First no. is bigger");
        } else if (a == b) {
            System.out.println("They are the same");
        } else {
            System.out.println("Second no. is bigger");
        }
        System.out.println("");

        System.out.println("Enter the total of your numbers +10:");
        Scanner myInt1 = new Scanner(System.in);
        c = myInt1.nextInt();
        System.out.print("Your answer should be: ");
        System.out.println(a+b+10);

        a+=10;
        b+=10;
        System.out.println("First no. plus 10 is: " + a);
        System.out.println("Second no. plus 10 is: " + b);


    }
}
