package MyTests;

import java.util.Scanner;

public class WorkRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int hoursPerMonth;
        int monthlySalary;

        System.out.println("Forget RODO, provide some details");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Hours worked per month: ");
        hoursPerMonth = scanner.nextInt();
        System.out.println("Monthly salary: ");
        monthlySalary = scanner.nextInt();

        System.out.println("Current hourly rate is " + monthlySalary/hoursPerMonth
                + "zł" + " for " + name);


    }
}
