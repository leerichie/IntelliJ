package GroupTwo.PodstawyB1;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));
        System.out.println(isPrime(16));
        System.out.println(isPrime(21));
    }
    //zadanie 1: funkcja ktora sprawdza czy liczba jest liczba pierwsza
    // (tzn czy dzieli sie tylko przez 1 i sama siebie,
    // albo inaczej (^-^) czy nie dzieli sie przez zadna liczbe pomiedzy 2 a liczba-1)

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        boolean result = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}