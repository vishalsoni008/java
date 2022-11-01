package collection_framework.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

// this is store of preserve order.
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(33);
        set.add(22);
        set.add(44);
        set.add(94);
        set.add(55);
        set.add(22);

        System.out.println(set);
    }
}
