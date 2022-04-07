package GroupOne.Week01;

import java.util.Scanner;

public class ScanYesNo {
    public static void main(String[] args) {

        Scanner YesNo = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz Twoj wiek:");

        int myInt = scanner.nextInt();
        scanner.nextLine();

        if (myInt==30) {
            System.out.println("sprawdzam...");
        } else {
            System.out.println("Kłamczuch :P");
        }
        System.out.println();


        System.out.println("Idziemy na szota? - pisz 'tak' albo 'nie'");
        String yesno = YesNo.next();


        if (yesno.equals("tak")) {

            System.out.println("Super, też mi podaj");

        } else if (yesno.equals("nie")) {

            System.out.println("Trudno, próbuj jeszcze raz :P");
        }
        scanner.close();


    }
}
