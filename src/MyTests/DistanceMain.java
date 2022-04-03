package MyTests;

import java.util.Scanner;

public class DistanceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mySpeed;
        int myDistance;

        System.out.println("enter a speed: ");
        mySpeed = scanner.nextInt();

        System.out.println("enter a distance: ");
        myDistance = scanner.nextInt();

        if (mySpeed <= 0) {
            System.out.println("invalid speed");
        }
        if (myDistance <= 0) {
            System.out.println("invalid distance");
        }

        int myTime;
        myTime = mySpeed/myDistance;
        System.out.println("time to destination: " + myTime + "mins");

    }
}
