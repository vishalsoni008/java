package collection_framework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "vishal");
        map.put(2, "satya");
        map.put(3, "saket");

        System.out.println(map);

        //itrating a map

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
