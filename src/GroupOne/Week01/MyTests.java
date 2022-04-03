package GroupOne.Week01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MyTests {
    public static void main(String[] args) {
        int mySize = 75;
        String myCode = "c";
        System.out.println("Cup size: " + mySize + myCode);

        long a = 10 + 10 + 10L;
        long b = 20 + 20 + 20L;
        System.out.println(b / a);

        System.out.println("");

        char c = 'c';
        char bigC = 'C';
        char newLine = '\n';
        char plus = '+';
        System.out.println(bigC + newLine + c);
        System.out.println("Why is it showing 176?");
        System.out.println("Display should read 'C' on 1 line and 'c' just below:");
        System.out.println(" " + bigC + newLine + " " + c);

        System.out.println("");

        /* length counts amount of text in speech marks*/

        System.out.println("Lee has a wife named Ania!".length());

        String text = "Lee has a wife named Ania!";
        text.toUpperCase();
        text.toLowerCase();
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        /* substring shows text from chosen numbers */
        System.out.println(text.substring(04, 15));

        System.out.println("");

            /* date and time */


        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println("");

        /* Maths */

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.floor(5.99d));

        byte byteValue = 56;
        Byte byteObject = new Byte(byteValue);
        System.out.println("byteValue = " + byteValue);

        System.out.println("");

        boolean booleanValue = true;
        System.out.println("It is = " + booleanValue);

        System.out.println("");

        System.out.println("############################");
        System.out.println("#                          #");
        System.out.println("#           A&A            #");
        System.out.println("#    al. Woj Polskiego     #");
        System.out.println("#      10-229 Olsztyn      #");
        System.out.println("#                          #");
        System.out.println("############################");

        System.out.println("");

        int x = 5;
        System.out.println("The result is: " + x);
        System.out.print(x++);
        System.out.print(++x);
        System.out.print(--x);
        System.out.println(x--);

        System.out.println("");

        int i = 5, j = 5;
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < 24);
        System.out.println(j != 5);
        System.out.println(i >= 8);
        System.out.println(i <= 8);

        System.out.println("");

        /* operators - t/f, same as, different to, higher, lower than */

        String dupa = "arse", tylek = "bum";
        System.out.println(dupa == tylek);
        System.out.println(dupa != tylek);

        System.out.println("");

        /*  */

        int twoHundredValue = 200;
        Integer twoHundredObject = 200;
        System.out.println(twoHundredValue == twoHundredObject);

        System.out.println("");

        int e = 50;
        e -= 40;
        System.out.println(e);

        System.out.println("");

        int r = 100;
        int s = 200;
        int t = 300;
        int u = 400;
        int v = 500;
        s -= r;
        t *= u;
        v += v;
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);

        System.out.println("");

        int myPlus1 = 10;;
        System.out.println(++ myPlus1);
        System.out.println(-- myPlus1);
        System.out.println(myPlus1 == 6 + 4);
        System.out.println(myPlus1 == 2*5);
        System.out.println(myPlus1 == 20/3);

        System.out.println("");

        boolean myValue1 = true;
        boolean myValue2 = false;
        System.out.println(myValue1 && myValue2);
        System.out.println(myValue1 || myValue2);
























    }
}
