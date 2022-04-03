package GroupOne.Week01;

public class YetAnother{
    public static void main(String[] args) {

       /* int array[] = new int[]{11, 4, 83, 96, 938, 839, 27, 1, 333, 20};
        int i, j, k;
        int counter=0;
        System.out.println("Zawartosc tablicy: ");

        for (j = 0; j < array.length-1; j++) {
            for (i = 0; i < array.length-1; i++) {
                counter ++;
                if (array[i] > array[i + 1]) {
                    k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                    counter ++;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("counter wynosi " + counter );




        //   String i

        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann" };

        int arrays = 6;
        for(int i=0; i < strings.length; i++) {
            if(strings[i].startsWith("J")) {
                System.out.println(strings[i]);
            }
            if (strings[i].endsWith("m")) {
                System.out.println(strings[i]);
            }
*/
                    /*      // int i (j)
            int a = 10;
            int b = 20;

            for (int j = a; j <= b; j++) {
                 System.out.println(j);
            }

         */

        int sum = 0;
        int count = 0;
        for (int i=10; i<=200; i++) {
            sum += i;
            count++;
            if (i > 150 && i < 170) {
                continue;
            }
            System.out.println("total: " + i);
        }


            /*
        String[] text = {"Bring", "me", "a", "beer"};
            for(String i : text) {
                System.out.print(i + " ");

                String[] text1 = {"one", "two", "three", "four"};
                for(String j : text1)
                    System.out.print(j + " ");

 */
        }

    }
