package JavaAdvanced.Collections;

import java.util.*;
class CollectionsExample1 {
    public static void main(String[] args) {
        String[] stringsArr = new String[100];
        stringsArr[0] = "a";
        stringsArr[1] = "b";
        stringsArr[2] = "c";
        stringsArr[3] = "d";
        stringsArr[4] = "e";
        stringsArr[2]=null;
        for (int i = 0; i < 5; ++i) {
            System.out.println(stringsArr[i]);
        }
        System.out.println("======================");
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("a");
        stringsList.add("b");
        stringsList.add("c");
        stringsList.add("d");
        stringsList.add("e");
        stringsList.set(2, "z");
        stringsList.retainAll(List.of("c", "e", "f"));
        System.out.println(stringsList);
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
//        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        list.set(1, "z");
        list.add("d");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        Collection<String> l = new HashSet<>();
    }
}
