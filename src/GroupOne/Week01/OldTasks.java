package GroupOne.Week01;

public class OldTasks {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = 0;

        if (b > a) {

            for (int i = a; i <= b; i++) {
                sum += i;

            }
            System.out.println(sum);
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);
        }

    }
}