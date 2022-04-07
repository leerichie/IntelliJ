package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

import static GroupTwo.PodstawyB1.PodstawyB3.BMIStatus.calculateBMI;

public class BMImanager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you weight [kg]: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter you height [m]: "); // decimal with metre
        double height = scanner.nextDouble();

        BMIStatus bmiStatus = calculateBMI(weight, height);

        System.out.println(bmiStatus.getMessage());
    }
}
