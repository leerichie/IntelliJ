package JavaAdvanced.oop;

import java.util.Random;
import java.util.Scanner;

interface IntProvider {
    int provide();
}

class AverageCalculator {
    static int average(IntProvider provider) {
        int i1 = provider.provide();
        int i2 = provider.provide();
        int i3 = provider.provide();
        return (i1 + i2 + i3) / 3;
    }
}

class ConsoleIntProvider implements IntProvider {
    @Override
    public int provide() {
        return new Scanner(System.in).nextInt();
    }
}

class SupplierExample {

    public static void main(String[] args) {
        System.out.println(
                AverageCalculator.average(new ConsoleIntProvider())
        );

        System.out.println(
                AverageCalculator.average(
                        new IntProvider() {
                            @Override
                            public int provide() { //getAsInt
                                return new Random().nextInt();
                            }
                        }
                )
        );
        System.out.println(
                AverageCalculator.average(()->7)
        );
    }
}

