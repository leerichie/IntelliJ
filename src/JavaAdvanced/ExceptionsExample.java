package JavaAdvanced;

@SuppressWarnings("SameParameterValue")
class ExceptionsExample {

    static void fifthLetter(String s) {
        System.out.println("fifthLetter - start");
        try {
            System.out.println(s.charAt(4));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("fifthLetter - end");
    }

    public static void main(String[] args) {
        System.out.println("main - start");
        try {
            fifthLetter("a");
            System.out.println("main - środek");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main - end");
    }
}
