package GroupOne.Week01;

import java.util.Scanner;

public class Scan5No {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers below");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Provide 5 numbers");
        int numberOfNumbersInArray = input.nextInt();
        int array[] = new int [numberOfNumbersInArray];

        for(int i=0; i<array.length; i++){
            System.out.println();
            array[i] = input.nextInt();
            input.nextLine();
            sum+= array[i];
        }

        System.out.println(sum);


    }
}
