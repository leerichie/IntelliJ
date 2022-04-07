package GroupOne.Week01;

public class Homework4 {
    public static void main(String[] args) {
        double[] array = new double [4];
        array[0] = 10.1234d;
        array[1] = 20.2345d;
        array[2] = 30.3456d;
        array[3] = 40.4567d;

        double a = array[0];
        double b = array[1];
        double c = array[2];
        double d = array[3];

        System.out.println(a+b+c+d);

        if (a>d) {
            System.out.println("a is bigger than d");
        } else {
            System.out.println("a isn't bigger than d");
        }
        if (a==d) {
            System.out.println("a is the same as d");
        } else {
            System.out.println("a isn't the same as d");
        }
        if (d>a) {
            System.out.println("d is bigger than a");
        } else {
                System.out.println("d isn't bigger than a");
            }



    }
}
