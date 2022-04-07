package MyTests;

public class Testtt {
    public static void main(String[] args) {
        int aa = 0;             // A
        int bb = 1;
        int cc = 5;
        int dd = 10;

        checkNum(aa);
        checkNum(bb);
        checkNum(cc);
        checkNum(dd);
    }

    static void checkNum(int number) {
        System.out.println("Is 'aa' even and between 0 and 10? " + (number % 2 == 0 && number >= 0 && (number + 1) <= 10));
    }

//    public static void main(String[] args) {
//
//        String a = "Beer";          // B
//        String b = "fosters";
//
//        String returnedValue = methodToReturn();
//        System.out.println(returnedValue);
//    }
//
//    static String methodToReturn() {                     // can print in main
//        return "(No sys.out needed in main) stout";


    {
        likeBeer("ale");            // C
        likeBeer("lager");
        likeBeer("sex");

    }

    static void likeBeer(String taste) {               // only prints with parameter 'taste' in () in sout
        System.out.println("I think about " + (taste) + " on a regular basis."); // () needed
    }
}


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
