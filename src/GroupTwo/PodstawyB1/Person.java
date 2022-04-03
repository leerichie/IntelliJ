package GroupTwo.PodstawyB1;

public class Person {
    public static void main(String[] args) {
        System.out.println("Hello world (from main)"); // main method
        sayHello(24, "March");

    }

    private static void sayHello(int n, String s) { // signature
        for (int i = 0; i <= n; i++) {
            System.out.println("Hello world (from method)");
        }
    }
}
