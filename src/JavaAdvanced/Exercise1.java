package JavaAdvanced;

import java.io.IOException;
import java.util.Random;

class Exercise1 {
    private static final Random random = new Random();

    static String libraryCall() throws IOException {
        // nie modyfikujemy tej metody
        return switch (random.nextInt(4)) {
            case 0 -> "asdf";
            case 1 -> throw new IllegalArgumentException("tralala");
            case 2 -> throw new IOException("trololo");
            case 3 -> throw new ArrayIndexOutOfBoundsException("niespodzianka");
            default -> throw new AssertionError();
        };
    }

    public static void main(String[] args) {
        /*Zadanie:
         * Wypisz na konsolę wartość zwróconą przez metodę libraryCall().
         * Jeśli metoda rzuci IllegalArgumentException, wypisz "Błąd: " oraz komunikat zawarty w wyjątku.
         * Jeśli metoda rzuci IOException, wypisz "IOException: " oraz komunikat błędu, a następnie wyrzuć wyjątek z metody main().
         * Nie spodziewamy się rzucenia ArrayIndexOutOfBoundsException, więc nie obsługujemy tego przypadku.
         * Niezależnie od tego, co się stanie, na koniec wypisujemy na konsoli komunikat "Koniec".
         * */
        try {
            System.out.println(libraryCall());
        } catch (IOException e) {      // (IOException | IllegalArgumentException e)
            System.out.println("Błąd: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        } finally {
            System.out.println("Koniec");
        }
    }
}