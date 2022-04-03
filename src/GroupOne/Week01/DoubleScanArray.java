package GroupOne.Week01;

import java.util.Scanner;

public class DoubleScanArray {
    public static void main(String[] args) {
        float [] array = new float[5];
        array[0] = 1.11f;
        array[1] = 2.22f;
        array[2] = 3.33f;
        array[3] = 4.44f;
        array[4] = 5.55f;

        float roundTotal = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println("Round total: " + roundTotal);
        float difference = array[0] - array[1] - array[2] - array[3] - array[4];
        System.out.println("Deduction total: " + difference);
        float multiplyILOCZYN = array[0] * array[1] * array[2] * array[3] * array[4];
        System.out.println("Multiplied total: " + multiplyILOCZYN);
        float divideILORAZ = array[0] / array[1] / array[2] / array[3] / array[4];
        System.out.println("Divided total: " + divideILORAZ);


        // from student MY EDIT

        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double diFference = 1;
        double multiply = 2;
        double divide = 3;

        double array1[] = new double [5];

        for (int i=0; i<array.length; i++)
        {
            System.out.println("Enter a number: ");
            array1[i] = scanner.nextDouble();
            total += array[i];
            diFference -= array[i];
            multiply *= array[i];
            divide /= array[i];


        }
        System.out.println("Round total is: " + total);
        System.out.println("Difference is: " + diFference);
        System.out.println("Multiplied is: " + multiply);
        System.out.println("Division is: " + divide);




    }
}
