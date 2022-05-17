package JavaAdvanced;

public class Finally {
    static void f() {
//        throw new NullPointerException();
        System.out.println('f');
    }

    public static void main(String[] args) {
        try {
            f();
            System.out.println("coś dalej");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec");
        }
        System.out.println("Po finally");
    }
}