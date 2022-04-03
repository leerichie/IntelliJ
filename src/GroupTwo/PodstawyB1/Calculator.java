package GroupTwo.PodstawyB1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide first number(s): ");
        int number1 = scanner.nextInt();
        System.out.println("Provide second number(s): ");
        int number2 = scanner.nextInt();
        System.out.println("Provide maths symbol: ");
        scanner.next();

        String yesNo;
        char answer;
        System.out.println("Want to see the results? Y-yes, N-no");
        yesNo = scanner.nextLine();
        answer = yesNo.charAt(0);
        scanner.next();

        // numbers 5 20
        // + / - * !
        char operation = scanner.next().charAt(0);

        int result = add(number1, number2);
        int result1 = divide(number1, number2);
        int result2 = subtract(number1, number2);
        int result3 = multiply(number1, number2);

//        if(operation == '+')
//            System.out.println("Result: " + result); --OR--   result = add(number1, number2);
//        if(operation == '/')
//            System.out.println("Result: " + result1);
//        if(operation == '-')
//            System.out.println("Result: " + result2);
//        if(operation == '*')
//            System.out.println("Result: " + result3);

//              ---- above and below are the same alternative ----

        switch (operation) {
            case '+':
                System.out.println("Result: " + result); // --OR-- result = add(number1, number2);
                break;
            case '/':
                System.out.println("Result: " + result1);
                break;
            case '-':
                System.out.println("Result: " + result2);
                break;
            case '*':
                System.out.println("Result: " + result3);
                break;
            default:
        }
    }

    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    private static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    private static int divide(int number1, int number2) {
        return number1 / number2;
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }


}
