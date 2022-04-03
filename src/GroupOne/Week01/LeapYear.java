package GroupOne.Week01;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner leapYear = new Scanner(System.in);
        System.out.println("Type a year:");

        int myInt = leapYear.nextInt();
        leapYear.nextLine();

        int a = 2022;
        int b = 4;
        int c = 100;
        int d = 400;

        if ((a%b==0) && (a%c!=0) || (a%d==0)) {
        System.out.println("It's a Leap year");
    } else {
            System.out.println("It's not a Leap year");
        }
    }
}
