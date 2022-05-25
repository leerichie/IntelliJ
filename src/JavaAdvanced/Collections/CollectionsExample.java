package JavaAdvanced.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("list 1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println("list 2: " + list2);

        ArrayList<Integer> listCopy = new ArrayList<>(list1);   // added list 1
        listCopy.addAll(list2);

        System.out.println("copied lists 1 and 2: " + listCopy);

        ArrayList<Integer> diff = new ArrayList<>(list1);       // difference between array;lists
        diff.removeAll(list2);

        System.out.println("difference between lists: " + diff);

        ArrayList<Integer> intersection  = new ArrayList<>(list1);      // find
        intersection.retainAll(list2);

        System.out.println("Intersection of lists: " + intersection);

        ArrayList<Integer> symmetricDiff = new ArrayList<>(listCopy);
        symmetricDiff.removeAll(intersection);

        System.out.println("Symmetry of: " + symmetricDiff);




        List<String> list = new ArrayList<String>();

        list.set(1, "z");
        list.add("d");
        System.out.println(list);

        for (String s : list){
            System.out.println(s);
        }

    }
}
