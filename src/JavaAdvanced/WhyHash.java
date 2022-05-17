package JavaAdvanced;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

@SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "ResultOfMethodCallIgnored"})
class WhyHash {
    private static final Random rand = new Random();

    private static class Data {
        final int x = rand.nextInt();

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Data data = (Data) o;
//            return x == data.x;
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(x);
//        }
    }

    public static void main(String[] args) {

        Collection<Data> set = new HashSet<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; ++i) {
            set.add(new Data());
        }
        long stop = System.nanoTime();

        System.out.println(stop - start);

        start = System.nanoTime();
        for (int i = 0; i < 10000000; ++i) {
            set.contains(new Data());
        }
        stop = System.nanoTime();

        System.out.println(stop - start);
    }
}