package GroupOne.Week01;

public class LogicServices {
    public static void main(String[] args) {
        int a = 100;
        int b = 45;
        boolean result = a < b;
        System.out.println(result);
        result = (a * b) > b;
        System.out.println(result);
        result = b < a + 6 && b > a - 2;
        System.out.println(result);
        result = a * b % 2 == 0;
        System.out.println(result);

        double firstNumber = 5.6;
        double secondNumber = 55.4;

        System.out.println("Liczba 1: " + firstNumber + " + " + "Liczba 2: " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("Liczba 1: " + firstNumber + " - " + "Liczba 2: " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("Liczba 1: " + firstNumber + " * " + "Liczba 2: " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("Liczba 1: " + firstNumber + " : " + "Liczba 2: " + secondNumber + " = " + (firstNumber / secondNumber));

        int myInt = 1430;
        char myChar = (char) myInt;
        long longNumber = myInt;
        byte myByte = (byte) myInt;
        System.out.println(myInt);
        System.out.println(myByte);
        System.out.println(myChar);
    }
}