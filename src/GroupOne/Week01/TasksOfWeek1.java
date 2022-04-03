package GroupOne.Week01;

public class TasksOfWeek1 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("--Task 1--");
        System.out.println("");

        System.out.println("Hello lee");

        String name = "Lee";
        System.out.println("Your name is: " + name);

        int age = 39;
        System.out.println("Your age is: " + age);

        final long pesel = 84011920191L;
        System.out.println("Your Personal ID No. is: " + pesel);

        char firstInitialOfName = 'L';
        System.out.println("The first initial of your name is: " + firstInitialOfName);

        double PI=3.1416d;
        System.out.println("PI is equal to: " + PI);

        boolean is18YearsOld = true;
        System.out.println("You are over 18 years old: " + is18YearsOld);

        double mySalary = (18453.67d);
        System.out.println("Your salary as an example: " + mySalary);

        System.out.println("");
        System.out.println("--Task 2--");
        System.out.println("");
        // Task 2

        int a = 10;
        int b = 20;
        boolean result = a<b;
        System.out.println(result);
        result = (a*b) >b;
        System.out.println(result);
        result = b < a + 6 && b > a - 2;
        System.out.println(result);

        // same 2 examples below %
        result = a * b % 2 == 0;
        System.out.println(result);

        if (a % 2 == 0){
            System.out.println("Given number is even.");
        }else{
            System.out.println("Given number is odd.");
        }
        int dupa = 5;
        dupa = (dupa >= 2) ? 2 : 1;
        System.out.println("dupa: " + dupa);

























    }
}
