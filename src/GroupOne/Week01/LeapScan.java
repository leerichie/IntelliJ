package GroupOne.Week01;

import java.util.Scanner;

public class LeapScan {
    public static void main(String[] args) {

        int year;
        System.out.println("Enter a year to check:");

        Scanner myLeap = new Scanner(System.in);
        year = myLeap.nextInt();

        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("--> " + year + " is a leap year (Jest rok przystępny)");
        } else {
            System.out.println("--> " + year + " is not a leap year (Nie jest rok przystępny)");
        }
    }
}
