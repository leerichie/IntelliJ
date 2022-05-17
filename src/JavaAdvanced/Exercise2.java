package JavaAdvanced;

//todo: własna klasa wyjątku

class NotEvenException extends IllegalArgumentException {   // make own exception

}
class Exercise2 {
    static int half(int n) {
        if (n % 2 == 1) {
            throw new NotEvenException();
        }
        return n / 2;
    }
    public static void main(String[] args) {
        try {
            System.out.println(half(2));
            System.out.println(half(1));
        } catch (NotEvenException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}