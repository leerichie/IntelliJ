package JavaAdvanced;

import java.util.HashSet;

class Excercise1 {
    public static void main(String[] args) {
        HashSet<Integer> list1= new HashSet<>();
        list1.add(1); // itd.
        list1.add(2); // itd.
        list1.add(3); // itd.
        list1.add(4); // itd.
        list1.add(5); // itd.

        HashSet<Integer> list2= new HashSet<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        HashSet<Integer> sum = new HashSet<>();     // union of Sets --> joins and removes duplicates
        sum.addAll(list1);
        sum.addAll(list2);

        System.out.println(sum);

        HashSet<Integer> diff1 = new HashSet<>(list1);      // difference
        diff1.removeAll(list2);

        System.out.println(diff1);

        HashSet<Integer> intersection = new HashSet<>(list1);       // intersection
        intersection.retainAll(list2);

        System.out.println(intersection);

        HashSet<Integer> symmetricDiff = new HashSet<>(sum);        // symmetry
        symmetricDiff.removeAll(intersection);

        System.out.println(symmetricDiff);
    }
}