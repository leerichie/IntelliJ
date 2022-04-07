package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Scanner;

public class Banknotes {
//    public static void countCurrency(int amount) {
//        int[] notes = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
//        int[] noteCounter = new int[9];
//
//        // count notes
//        for (int i = 0; i < 9; i++) {
//            if (amount >= notes[i]) {
//                noteCounter[i] = amount / notes[i];
//                amount = amount - noteCounter[i] * notes[i];
//            }
//        }
//
//        // Print notes
//        System.out.println("Currency count ->");
//        for (int i = 0; i < 9; i++) {
//            if (noteCounter[i] != 0) {
//                System.out.println(notes[i] + " : "
//                        + noteCounter[i]);
//            }
//        }
//    }
//
//    // driver function
//    public static void main(String argc[]) {
//        int amount = 868;
//        countCurrency(amount);
//        System.out.println("Amount to calculate into notes: " + amount);
//    }
public void dispense(int amount) {                              // ver. lesson
    int denomination[] = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
    int i = 0;

    while (amount > 0) {
        if (amount / denomination[i] > 0)
            System.out.println(amount / denomination[i] + " x " + denomination[i]);
        amount %= denomination[i++];
    }
}

    public static void main(String args[]) {        //  scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in change: ");
        int amount = input.nextInt();

//        if (amount > 99999) {                         // not needed
//            System.out.println("Invalid Amount");
//            return;
//        }

        String inWords = getAmountInWords(amount);
        System.out.println(inWords);
        System.out.println("PLN denomination:");

        int notes[] = {200, 100, 50, 20, 10, 5, 2, 1};
        int t = amount;
        for (int i = 0; i < notes.length; i++) {
            int c = t / notes[i];
            if (c != 0)
                System.out.println(notes[i] + "\t*\t"
                        + c + "\t=\t" + (c * notes[i]));
                            t = t % notes[i];
        }
    }

    public static String getAmountInWords(int sum) {
        StringBuffer buff = new StringBuffer();

        while (sum != 0) {
            int d = sum % 10;
            sum /= 10;
            switch (d) {
                case 0:
                    buff.insert(0, "Zero ");
                    break;

                case 1:
                    buff.insert(0, "One ");
                    break;

                case 2:
                    buff.insert(0, "Two ");
                    break;

                case 3:
                    buff.insert(0, "Three ");
                    break;

                case 4:
                    buff.insert(0, "Four ");
                    break;

                case 5:
                    buff.insert(0, "Five ");
                    break;

                case 6:
                    buff.insert(0, "Six ");
                    break;

                case 7:
                    buff.insert(0, "Seven ");
                    break;

                case 8:
                    buff.insert(0, "Eight ");
                    break;

                case 9:
                    buff.insert(0, "Nine ");
                    break;

                default:
                    System.out.println("Invalid digit");
            }
        }

        return buff.toString();
    }
}
