package MyTests;

import java.util.Random;
import java.util.Scanner;

public class Testtt {

//    static Scanner scanner = new Scanner(System.in);      // number guess with play again
//
//    public static void main(String[] args) {
//        int playAgain = 1;
//        do {
//            loadGame();
//            System.out.println("Type 0 to finish.");
//            playAgain = loadNumber();
//        } while(playAgain!=0);
//    }
//
//    static int generateNumber(){
//        System.out.println("Number generation...");
//        return new Random().nextInt(10);
//    }
//
//    static int loadNumber(){
//        System.out.print("? ");
//        return scanner.nextInt();
//    }
//
//    static void loadGame(){
//        int randomNumber = generateNumber();
//        int loaded = loadNumber();
//        while(loaded!=randomNumber){
//            System.out.println("Number too " + (loaded>randomNumber? "high" : "low"));
//            loaded = loadNumber();
//        }
//        System.out.println("Success!");
//    }
//}

//        Scanner input = new Scanner(System.in);     // my calculator
//        System.out.print("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Choose an option: \n" +
//                "1 - add\n" +
//                "2 - subtract\n" +
//                "3 - multiply\n" +
//                "4 - divide");
//        int math = input.nextInt();
//        switch (math) {
//            case 1:
//                System.out.print("Addition: " + (num1 + num2));
//                break;
//            case 2:
//                System.out.print("Subtraction: " + (num1 - num2));
//                break;
//            case 3:
//                System.out.print("Multiplication: " + (num1 * num2));
//                break;
//            case 4:
//                System.out.println("Division: " + (num1 / num2));
//            {
//                if (num1 < num2) {
//                    System.out.println("Unable to divide");
//                }
//                break;
//            }
//            default:
//                System.out.println("Invalid choice");
//
//        }
//    }
//}
//
//        int random = new Random().nextInt(10);           // my own guess number game!!
//        int num = 0;
//        int play = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Guess a random number: ");
//        num = input.nextInt();
//        while (num != random) {
//            if (num < random) {
//                System.out.println("Too low, try higher!");
//            }
//            if (num > random) {
//                System.out.println("Too high, try lower!");
//            }
//            num = input.nextInt();
//            if (num == random) {
//                System.out.println("Well done! :)");
//            }
//        }
//    }
//}

//        int a = 1;
//        int b = 5;
//        int bc = 10;
//        char c = '!', d = 'f', e = 'u';
//        String str = "howdy partner";
//
//        checkNumber(a);
//        checkNumber(b);
//        checkSymbol(c);
//        checkSymbol1(d);
//        checkString(str);
//        writeAsciiMsg(111);
//
//        System.out.println("2 num here, 3 in method: " + addNumbers(a, b)); // 2 num here, 3rd added in method
//        System.out.println(isEqual(a, b));
//        System.out.println(isDivisible(bc, b));
//
//        int add = addNumbers(10, 20);
//        boolean divide = isDivisible(10, 2);
//
//        System.out.println(add + " - is the result.");
//
//        fun(5);
//        fun(2);
//
//
//    }
//    static void fun(int x){
//        switch (x){
//            case 1: case 6:
//                System.out.println("Apple");
//                break;
//            case 2:
//                System.out.println("Banana");
//                break;
//            case 3:
//                System.out.println("Orange");
//                break;
//            default:
//                System.out.println("Kiwi");
//        }
//    }
//    static boolean isDivisible(int num1, int num2){
//        return num1 % num2 == 0;
//    }
//    static int addNumbers(int num1, int num2){
//        return num1 + num2 + 10;    // added permanent 3rd number to method
//    }
//    static boolean isEqual(int num1, int num2){
//        return num1 == num2;
//    }
//    static void writeAsciiMsg(int asciiNumber){
//        System.out.println((char) asciiNumber + " yeah !");
//    }
//
//    static void checkSymbol1(char asciiMessage){
//        System.out.println(asciiMessage + 117 + 99 + 107 + " yeah !");
//    }
//    static void checkString(String message){
//        System.out.println(message + " this is my msg");
//    }
//
//    static void checkNumber(int number) {
//        System.out.println("Is a even and between 0 and 10 (even incremented)? " + (number % 2 == 0 && number >=
//                0 && (number + 1) <= 10));
//        System.out.println(number);
//    }
//
//    static void checkSymbol(char sym) {
//        System.out.println("Is 'c' between a and z: " + (sym >= 97 && sym <= 122));
//    }
//}

//        System.out.println("a = 1\nb = 5");
//        System.out.println("Is 'a' bigger than b : " + (a > b));
//        System.out.println("Is 'a' equal to b: " + (a == b));
//        System.out.println("Is 'a' between 0 and 10: " + (a < 10 && a > 0));
//        System.out.println("Is 'a' between 0 and 10 +1: " + (a < 10 && a > 0 + 1));
//        System.out.println("Is 'a' an even number: " + (a % 2 == 0));
//        System.out.println("Is 'a' an odd number: " + !(a % 2 == 0));
//        System.out.println("Is 'c' between a and z: " + (c >= 97 && c <= 122)); // ascii


//        String result = " strang "
//                .substring(1)   // prints from index no.
//                .replace("a", "i")
//                .concat("!")        // add suffix
//                .toUpperCase()
//                .trim();    // empty spaces
//
//        String result2 = " learning ";
//
//        System.out.println(result);
//        System.out.println(result.contains("N"));
//        System.out.println(result.equals(result2));
//
//        char extract;       // reverse string
//        String result3 = "";
//        for (int i=0; i<result2.length(); i++) {
//            extract = result2.charAt(i);
//            result3 = extract + result3;
//        }
//        System.out.println(result3);
//    }
//}
//        Scanner input = new Scanner(System.in);

//        String myArray[][] = {
//                {"Hi", "bye", "yo"},
//                {"you", "me", "tak", "nie"},
//        };
//        System.out.println(myArray[0].length);
//        System.out.println(myArray[1].length);
//
//        for (int i = 0; i < myArray.length; i++){       // for loops inner and outer
//            for (int j = 0; j < myArray[i].length; j++) {
//                System.out.print(myArray[i][j]);
//            }
//        }
//        for (String[] innerArray : myArray) {            // OR for - each loops
//            for (String outerArray : innerArray) {
//                System.out.print(outerArray);
//            }

//        ArrayList<Integer> integersarrayList = new ArrayList<>();
//        ArrayList<String> languages = new ArrayList<>();
//        languages.add("Polish");
//        languages.add("English");
//        languages.add("Spanish");
//        System.out.println("ArrayList:\t" + languages );
//
//        languages.remove(1);
//        System.out.println("Removed 1:\t" + languages);
//        languages.add(1, "British");
//        System.out.println(languages);
//
//        languages.set(2, "French");
//        System.out.println("Modified 1:\t" + languages);
//
//        String text = languages.get(0);
//        System.out.println("Printed 1:\t" + text);
//
//        for (String loop : languages){
//            if (loop == "British");
//            System.out.println("test: " + loop);
//            continue;
//        }


//        double num = 0.0;
//        double sum = 0.0;
//        while (true){
//            System.out.println("enter number");
//            num = input.nextDouble();
//
//            if (num <= 0.0){
//                break;
//            }
//            sum += num;
//        }
//        System.out.println("sum " + sum);


//        String names[] = {"Ashley", "Ania", "Richards", "Jęsiak"};
//        for (int i = 0; i < 4; i++) {
//            System.out.print(names[i]);
//            if (i == 0) ;
//            break;
//        }
//        byte a = 13;
//        short b = 40;
//        int c = 10;
//        double d = 20.2;
//        long e = 12345678;
//        float f = 987654321;
//        boolean isReal = true;
//        char myChar = 'a';
//        char myChar2 = 65;
//        int z = (double) d;
//        System.out.println(z);


//        // Scanner Class                      // guess random number with user input
//        Scanner sc = new Scanner(System.in);
//
//        // Generate the numbers
//        int number = 1 + (int) (10 * Math.random());
//
//        // Given K trials
//        int K = 5;
//        int i, guess;
//
//        System.out.println(
//                "A number is randomly chosen"
//                        + " between 1 and 10.\n\n"
//                        + "Guess the number"
//                        + " in 5 tries.\n");
//
//        // Iterate over K Trials
//        for (i = 0; i < K; i++) {
//
//            System.out.println(
//                    "Enter a number:");
//
//            // Take input for guessing
//            guess = sc.nextInt();
//
//            // If the number is guessed
//            if (number == guess) {
//                System.out.println(
//                        "Congratulations! You guessed the number.");
//                break;
//            } else if (number > guess
//                    && i != K - 1) {
//                System.out.println(
//                        "The number is greater than " + guess);
//            } else if (number < guess
//                    && i != K - 1) {
//                System.out.println(
//                        "The number is less than " + guess);
//            }
//        }
//
//        if (i == K) {
//            System.out.println(
//                    "You have used all 5 guesses.");
//
//            System.out.println(
//                    "The number was " + number);
//        }
//
//    }
//}


//        int z = 5;
//
//        int returnedValue = methodToAlwaysReturn1(10, 20);
//        System.out.println(returnedValue + " plus this: " + z);
//    }
//
//    static int methodToAlwaysReturn1(int x, int y) {
//        return x + y;
//    }
//}

//        int aa = 0;             // A
//        int bb = 1;
//        int cc = 5;
//        int dd = 10;
//
//        checkNum(aa);
//        checkNum(bb);
//        checkNum(cc);
//        checkNum(dd);
//    }
//
//    static void checkNum(int number) {
//        System.out.println("Is 'aa' even and between 0 and 10? " + (number % 2 == 0 && number >= 0 && (number + 1) <= 10));
//    }

//        int returnedValue = methodToReturn(10, 10, 10);        //  B
//        System.out.println(returnedValue + " reply");
//    }
//
//    static int methodToReturn(int x, int y, int z) {                     // can print in main
//        x = 10 + 10;
//        y = 50 - 51;
//        z = 20 * 5;
//        return z;
//

//    myAnimal("Lee", "Ania");
//    myAnimal("Charles", "Wendy");
//
//
//    }
//    static String myAnimal(String name, String name1) {
//        System.out.println(myAnimal("King", "Choco"));
//        return name;
//    }
//
//
//    {
//        likeBeer("ale");            // C
//        likeBeer("lager");
//        likeBeer("sex");
//
//    }
//
//    static void likeBeer(String taste) {               // only prints with parameter 'taste' in () in sout
//        System.out.println("I think about " + (taste) + " on a regular basis."); // () needed
//    }
//}


//        int a = 0;
//        int b = 1;
//        int c = 2;
//        int d = 3;
//        char e = 'e';
//        char f = 'f';
//        char g = 'g';
//
//        System.out.println(a>b);
//        System.out.println(a==b);
//        System.out.println(c/b);
//        System.out.println(c%b);
//        System.out.println(c%b==2);
//        if (c%b==0){
//            System.out.println("is even");
//        } else{
//            System.out.println("is odd");
//        }
//        if (e<f && g>f){
//            System.out.println("e is before f and f is after g");
//        } else{
//            System.out.println("incorrect ");
//        }

//        int i = 3;
//        i++;    //4
//        System.out.println(i);  //4
//        i++;    // 5
//        System.out.println(i);  //5
//        System.out.println(++i);    //6
//        System.out.println(i++);    //6
//        System.out.println(i);  //7

//        String a = "Hello";
//        for (int i = 0; i < a.length(); i++) {
//            if (i == 2) {
//                break;
//            }
//            System.out.println(a);
//        }
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.print(i);
//        }

//        double a = 6.3;
//        int b = 4;
//        System.out.println(a + b);
//        System.out.println(5 + 5 + "5");
//        System.out.println(5 + 'c' + 5);

////        for (int i=0; i<5; i++){
////            System.out.println(i);
////        }
//        for (int j=0; j<5; ++j){
//            System.out.println(j);
//        }

//        String a = "hello";
//        int count = 10;
//        for (int i=1; i<=10; i++){
//                System.out.println(a);
//        }
//        for (int i=10; i>0; i--){ // REMEMBER - increment & decrement
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("total is : " + sum);    // 10+9+8+7+6+5+4+3+2+1+0;
//
//        System.out.println();
//
//        for (int i = 1; i <= 10; i++) {
////            System.out.println("i=" + i + ", i^2=" + (i*i));
//            System.out.println((i * 1) + " " + (i * 2) + " " + (i * 3) + " " + (i * 4));    // loop times table
//        }
//        System.out.println();
//
//        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // easy print digits :
//        for (int i : digits) {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n");
//
//        String[] names = {"Ania", "Ashley", "A&A", "Richards"};   // easy print names :
//        for (String a : names) {
//            System.out.print(a + " ");
//        }
//        System.out.println("\n");
//
//        int sums=0;
//        int count=0;
//        for (int i=1; i<=200; i++) {
//            sums += i;
//            count++;
//            if (sum >= 50) {
//                break;
//            }
//        }
//        System.out.println("Suma = " + sum);
//        System.out.println("Liczba zsumowanych wartości = " + count);
//
//        System.out.println();
//
//        for (int i=1; i<=20; i++) {
//            if (i>=13 && i<=14) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }


//        String str = "--Hello my name is Lee--";
//        System.out.println(String.valueOf(10));
//        System.out.println(str.endsWith("Lee"));
//
//        int a = 10;
//        int b = 20;
//        int c = 5;
//        int d = a + b + c;
//        System.out.println(Math.pow(5, 10));
//
//        int e = 3;
//        int f = 6;
//        boolean word = true;
//        boolean word1 = false;
//        if (e > f) {
//            System.out.println("...");
//        } else if (!(e > f)) {
//            System.out.println(". . . . .");
//        }
//        for (int i = 0; i < f; i++) {
//            for (int j = 0; j > f; ++i) ;
//            if (f == 3) ;
//            System.out.println("stop");
//            System.out.println(); // space
//            System.out.println(e + f);
//        }
//        System.out.println(); // space
//        System.out.println(e + f);
//
//        System.out.println();
//
//        System.out.println();
//        String text = "Lee" + "has" + "a";
//        String text1 = "wife" + "called" + "Ania";
//        int count = 5;
////        System.out.println(text + count + text1);
////        for (int i=0; i<=text.length(); i++) {
////            System.out.println(text);
////        }
//        for(int j=0; j<=text1.length(); j++) {
//            System.out.println(text1);
//        }
//        System.out.println();
//        int age = 38;
////        String text2 = age >= 18 ? "an adult" : "a minor";      // alternative for if else
//        Scanner ageScan = new Scanner(System.in);
//        System.out.println("Enter age: ");
//        age = ageScan.nextInt();
//
//        if (age >= 18) {
//            System.out.println(age + " - an adult");
//        } else {
//            System.out.println(age + " - a minor");
//        }
//
//        System.out.println();
//
//        int result = (int) (Math.random() * 6 + 1);
//        System.out.println(result);
//
//        if(result==1){
//            System.out.println("odd");
//        } else if (result==3) {
//            System.out.println("odd");
//        } else if (result==5){
//            System.out.println("odd");
//        } else{
//            System.out.println("even");
//        }
//
//        switch (result) {
//            case 1:
//                System.out.println("odd");
//                break;
//            case 2:
//                System.out.println("even");
//            default:
//                    System.out.println("");
//        }
//        int resultA = result;
//        resultA = true ? 1 : 6;
//        resultA = true ? 2 : 3;
//        System.out.println(resultA);
//
//        LocalTime.now();
//        double time = 18.51;
//        if(time>12)
//            System.out.println(time + " - it's afternoon");
//        else
//            System.out.println(time + " - it's morning");
//
//        System.out.println(LocalTime.now());
//
//        String value = "money";
//        String formatted = String.format("Value for %s!", value);
//
//        System.out.println(formatted);

        /*
        int[] numbers = new int[5];
        int[] luckyNumbers = {25, 5, 15, 10, 20};
        String[] names = new String[10];
        String[] names1 = {"Lee", "Pete", "Ania"};
        String[] seasons = {"Wiosna", "Lato", "Jesień", "Zima"};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(luckyNumbers));
        Arrays.sort(luckyNumbers);
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names1));
        System.out.println(Arrays.toString(seasons));

        System.out.println(luckyNumbers);
        System.out.println(seasons);
        System.out.println(luckyNumbers[3]);

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        String message = "I am Lee";
        message = "Kocham Ania";
        System.out.println(message);

        System.out.println(message.substring(7,11)); //7-11 letters of message
        System.out.println("James Bond".substring(0,5) + " is " + "007".substring(0,3));

        System.out.printf("answer for %d divided by %d is %d", 10, 2, 10/2);
        */

// times table
//
//        int a;
//        int b;
//
//        for (a = 1; a <= 10; ++a) {
//            for (b = 1; b <= 10; ++b) {
//                System.out.printf("%4d", (a * b));
//            }
//            System.out.println(); // goes to next line after 10
//        }
//        // easy left angle triangle
//
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

//  triangle tree

//        System.out.println();
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" "); }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("* "); }
//            System.out.println(); }
//
//        // left angle triangle
//        for(int i =0;i<=5;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }




        /*
        String[] cats = new String[3];
        cats[0] = "King";
        cats[1] = "Choco";
        cats[2] = "Ski";

        System.out.println(cats[1]);
        System.out.println("the word has " + cats[1].length() + " letters.");
        String value;
        value = cats[0];
        int sum;
        sum = -1; //removes 1 from array - "Ski"
        System.out.println(value + cats[2]);
        for (int i = 0; i < cats.length; i++)
            System.out.println(i + sum);

        String first = "Lee";
        String second = "Lee";
        System.out.println(first == second); //memory location difference
        System.out.println(first.equals(second)); //same word

        double first1 = 123;
        double second1 = 123;
        System.out.println(first1 == second1);



        // new group

        Scanner sc = new Scanner(System.in);

        int number = 0;
        int[] myArray = new int[number];
        String name;
        String jobTitle;

        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("enter profession: ");
        jobTitle = sc.nextLine();
        System.out.println("how many arrays? ");
        number = sc.nextInt();

        System.out.println("---------------------------");
        System.out.println("Your name: " + name + "\n"
                            + "Your job: " + jobTitle + "\n"
                            + "You have asked for " + number + " arrays.\n"
                            + "Programme will now end.\n"
                            + "---------------------------");


        // boxed - unboxed

        int unboxed = 123;
        Integer boxed = unboxed;
        System.out.println(unboxed);


         */