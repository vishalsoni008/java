package collection_framework.set.hastset;

import java.util.Set;

// hash set store data in hasing machanism and not have preserve order.
// and its not storing duplicacy of data
public class HashSet {
    public static void main(String[] args) {

        Set<Integer> set = new java.util.HashSet<>();

        set.add(33);
        set.add(22);
        set.add(44);
        set.add(94);
        set.add(55);
        set.add(22);

        System.out.println(set);
    }
}
