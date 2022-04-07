package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long binaryNumber, decimalNum = 0, j = 1, remain;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) {
            remain = binaryNumber % 10;
            decimalNum = decimalNum + remain * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNum);


        //  no scanner

        long num = 23874623;        // input binary number here

        // call method by passing the binary number
        int decimal = convertBinaryToDecimal(num);
        System.out.println();
        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);
    }

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }


    public int binaryToDecimal(String binary) {     // ver. easy
        char[] chars = binary.toCharArray();
        int power = binary.length() - 1;
        int result = 0;

        for (char c : chars) {
            if (c == '1') {
                result += Math.pow(2, power);
            }
            power--;
        }

        return result;
    }
}