package Homework;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        int b;
        int d;

        Scanner temp = new Scanner(System.in);

        System.out.println("Enter Fahrenheit temperature: ");
        b = temp.nextInt();

        System.out.println("Temperature in Celsius is: " + celsius(b));

        System.out.println("Enter temp in Celsius: ");
        d = temp.nextInt();

        System.out.println("Temp in Fahrenheit is: " + fahren(d));

    }
    static int celsius(int f)
    {
        return  (f-32)*5/9;
    }
    static int fahren(int c)
    {
        return (c*2)+30;
    }
}
