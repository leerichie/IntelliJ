package MyTests;

import java.util.Scanner;
import java.util.Stack;

public class ForLoop {
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "everybody";
//        for (int i = 0; i <= s1.length(); i++) ;
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.charAt(4));
//        System.out.println(s1 + " " + s2);
//        System.out.println(s1.concat(s2));

        int[] array1 = {1,2,3};
        int[] array2 = new int[3];
        String[] array3 = {"Want", "a", "beer", "?"};
        array2[0] = 4;
        array2[1] = 5;
        array2[2] = 6;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        System.out.println(array3[2] + " " + array3[0].toLowerCase());
        System.out.println(array3[0] + " " + array1[1] + " " + array3[2] + "s" + " ?");

        int[][] array4 = new int[2][2];
        array4[0][0] = 10;
        array4[0][1] = 20;
        array4[1][0] = 30;
        array4[1][1] = 40;
        int str = array4[0][0] + array4[0][1] + array4[1][0];
//        int[][] str = array4;
        System.out.println(array4[0][1]);
        for (int i = 0; i<= array4.length; i++) ;
        for (int j=0; j<= array4.length; j++);
            System.out.print(str);



        // times table

//        int a;
//        int b;
//        String leftAlignFormat = "| %-15s | %-4d | %n"; //unused
//        for (a = 1; a <= 10; ++a) {
//            for (b = 1; b <= 10; ++b) {
//                System.out.format("%4d", (a * b));
//            }
//            System.out.println(); // goes to next line after 10
//        }
//        System.out.println();
//
//
////        // scanner times table
////        int i,k;
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the Number for the table: ");
////
////        int n = sc.nextInt();
////        for (i=1;i<=10;i++){
////            k = n * i;
////            //n + "*" + c + " = " + (n*c))
////            System.out.println(n + "*"+ i + " = " + k);
////
////        // table with borders
////
////
////
////        for (int a = 0; a < 5; a++) {       //loop line x1 *
////            System.out.println("*"); }
////
////        for (int b = 0; b < 5; b++){        ////loop line x1 #
////            System.out.println("#");
//
////
////        // triangle
////
////        for(int i =0;i<=5;i++)      // left triangle
////        {
////            for(int j=0;j<i;j++)        // loop in loop
////            {
////                System.out.print("* ");
////            }
////            System.out.println(" ");
//
//        String[] myArray = {"Never", "Odd", "or", "Even"};
//        for (String madeUpName : myArray) {
//            System.out.print(madeUpName + " ");
//
//        }
//        System.out.println();
//        String[] myArray1 = {"Never", "Odd", "or", "Even"};
//        System.out.println(myArray1[3] + myArray1[2] + myArray1[1] + myArray1[0]);
//        {
//
//        }
////        System.out.println();
////
////        String[] myArray2 = {"Never Odd or Even"};
////        String reverse = new StringBuffer(myArray2[0]).reverse().toString();
////        System.out.println(reverse.toLowerCase());
//        {
//
//        }
//        System.out.println();

//        System.out.println("Wpisz slowa do sprawdzanie: ");
//        Scanner in = new Scanner(System.in);
//        String inputString = in.nextLine();
//        Stack stack = new Stack();
//
//        for (int i = 0; i < inputString.length(); i++) {
//            stack.push(inputString.charAt(i));
//        }
//
//        String reverseString = "";
//
//        while (!stack.isEmpty()) {
//            reverseString = reverseString + stack.pop();
//        }
//
//        if (inputString.equals(reverseString))
//            System.out.println("\n" + reverseString.toUpperCase() + " jest palindromem.");
//        else
//            System.out.println("\n" + reverseString.toUpperCase() + " nie jest palindromem.");
//        {
//
//        }

    }
}

