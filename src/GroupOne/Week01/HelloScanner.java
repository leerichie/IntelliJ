package GroupOne.Week01;

import java.util.Scanner;

        /* working scanner & switch */

public class HelloScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give fave no.: ");
        int myInt = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Fave no. is: " + myInt);
        System.out.println("Give fave colour: ");
        String myFaveColour = scanner.nextLine();
        System.out.println("Fave colour is: " + myFaveColour);
        System.out.println("Give fave car: ");
        String myFaveCar = scanner.nextLine();
        System.out.println("Fave car is: " + myFaveCar);
        System.out.println("Have you had enough?");
        String allDone = scanner.nextLine();
        switch (allDone) {
            case "yes":
                System.out.println("OK then that's all for today!");
                break;
        }
        switch (allDone){
            case "no":

                System.out.println("Let's continue then...");
                break;

        }
        System.out.println("Thank you!");
        scanner.close();




    }
}
