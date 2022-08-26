package collection_framework.set.treeset;

import java.util.Set;
import java.util.TreeSet;
// taking data in sorted form.
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(33);
        set.add(22);
        set.add(44);
        set.add(94);
        set.add(55);
        set.add(22);

        System.out.println(set);
    }
}
