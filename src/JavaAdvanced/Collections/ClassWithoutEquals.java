package JavaAdvanced.Collections;

import java.util.ArrayList;
import java.util.List;


class ClassWithoutEquals {

    private static class Data {
        final int x;

        Data(int x) {
            this.x = x;
        }
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
        List<Data> list = new ArrayList<>();
        Data d1 = new Data(7);
        Data d2 = new Data(7);

        list.add(d1);

        System.out.println(list.contains(d1));
        System.out.println(list.contains(d2));

        list.remove(d2);
        System.out.println(list);
    }
}