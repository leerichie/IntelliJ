package JavaAdvanced;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> num = new HashMap<>();
        num.put(1, "One");          // create map entries
        num.put(2, "Two");
        System.out.println(num);

        num.replace(1, "once");         // replace a value in a key
        System.out.println(num);

        num.put(3, "three");        //  add another entry
        System.out.println(num);

        num.clear();                // clear map entries
        System.out.println("cleared map num: " + num);

//        for (Integer key : num.keySet()){     // clears map BUT cannot edit map later
//            num.remove(key);
//            }
//            System.out.println(num);

    }
}
