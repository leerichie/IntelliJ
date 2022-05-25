package JavaAdvanced.oop;

import java.util.function.Supplier;

class MyStringSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "TestString";
    }
}

class InterfacesExercise {
    static String substring(Supplier<String> s, int from, int to) {
        return s.get().substring(from, to);
    }

    public static void main(String[] args) {
        System.out.println(
                substring(new MyStringSupplier(), 2, 5)
        );
    }
}