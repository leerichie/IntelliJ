package MyTests;

import java.util.Scanner;

public class MyMethodTests {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        // scanner

//        System.out.println("Enter no.1:");          // add
//        int num = sc.nextInt();
//        System.out.println("Enter no.2:");
//        int num2 = sc.nextInt();
//
//        int sum = getTotal(num, num2);
//        System.out.println("Total is: " + sum);
//        sc.nextLine();
//
//        System.out.println("Enter a word to join: ");       // concat string
//        String word1 = sc.nextLine();
//        System.out.println("Enter second word: ");
//        String word2 = sc.nextLine();
//
//        String joined = getWord(word1, word2);
//        System.out.println("Those 2 words together: " + joined);
//        sc.nextLine();
//
//        System.out.println("Enter a number: ");             // even OR odd -- true OR false
//        int isEven = sc.nextInt();
//        boolean result = isEven(isEven);
//        System.out.println(result);
//        sc.nextLine();
//
//        System.out.println("Enter a letter: ");        // check vowel
//        char maybeVowel = sc.next().charAt(0);
//        boolean vowelResult = isVowel(maybeVowel);
//        System.out.println("Is it a vowel: " + vowelResult);
//        sc.nextLine();
//
//        System.out.print("Enter a string: ");           // count vowels in string
//        String sentence;
//        sentence = sc.nextLine();
//        int count = 0;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            if (isVowel(sentence.charAt(i))) {
//                count++;
//            }
//        }
//        System.out.println("Vowels: " + count);
//        sc.nextLine();

        System.out.println("Enter number to check if PRIME: ");     //  PRIME or composite number
        int maybePrime = sc.nextInt();
        boolean primeResult = isPrime(maybePrime);
        System.out.println("Is " + maybePrime + " prime: " + primeResult);
        sc.nextLine();

        for(int i = 1; i <= 500; i++)                           // show PRIME numbers upto...(500)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }


    }           // METHODS HERE ---->>>>>

    public static int getTotal(int num, int num2) {
        return num + num2;
    }

    public static String getWord(String one, String two) {
        return one.concat(two);
    }

    public static boolean isEven(int evenNo) {
        if (evenNo % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static boolean isPrime(int numPrime) {
        for (int i = 2; i <= numPrime / 2; ++i) {
            if (numPrime % i == 0) {
                return false;
            }
        }
        return true;
    }
}