package MyTests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[3];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Want to enter width and height? (y/n)");

            char choice = input.next().charAt(0);
            if (choice == 'y') {
                System.out.println("Enter width and height: ");

                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }else if (choice == 'n')
                System.out.println("invalid answer");
            else
                rectangles[i] = new Rectangle();
        }


        System.out.println("Rectangles are: ");
        for (int i = 0; i < rectangles.length; i++)
            System.out.println("rectangle " + (i + 1)
                + ": width" + rectangles[i].getWidth()
                + ", height: " + rectangles[i].getHeight());
    }
}