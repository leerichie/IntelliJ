package GroupOne.Week01;

public class OneDimArrayTest {
    public static void main(String[] args) {

        /* working One Dimensional Array (tablica) */

        String[] array = new String[6];
        array[0] = "ash";
        array[1] = "bash";
        array[2] = "lee";
        array[3] = "skiego";
        array[4] = "richie";
        array[5] = "bongle";

        String x = array[0];
        System.out.print(x + "-");

        String y = array[1];
        System.out.println(y);

        String z = array[2];
        System.out.println("Better known as: " + z);

        String ppp = array[5];
        System.out.println("Never been called that");
        System.out.println("Table Array size: " + array.length);

        System.out.println();
    }

}
