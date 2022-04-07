package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class BMI {

    // Prints BMI
    private static void printBMI(float bmi) {
        if (bmi <= 18.5) {
            System.out.println("You are underweight");
        } else if (bmi <= 24.9) {
            System.out.println("You are normal");
        } else if (bmi <= 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }

        // scanner
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = s.nextLine();
        System.out.print("Please enter your weight in kg: ");
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();

        // multiplication 100*100 for cm to m conversion
        float bmi = (100 * 100 * weight) / (height * height);

        System.out.println("Your BMI is: " + bmi);
        printBMI(bmi);
    }
}