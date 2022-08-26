package collection_framework.set.sortedset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SortedSetDemo {
    public static void main(String[] args) {
      //  SortedSet<Integer> set = new LinkedHashSet<>(); // error beacuse is have only treeset

        SortedSet<Integer> set = new TreeSet<>();
        SortedSet<Integer> set1 = new ConcurrentSkipListSet<>();

        set.add(33);
        set.add(22);
        set.add(44);
        set.add(94);
        set.add(55);
        set.add(22);

        System.out.println(set);
    }
}
