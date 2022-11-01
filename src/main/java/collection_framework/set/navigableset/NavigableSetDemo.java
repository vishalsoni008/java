package collection_framework.set.navigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new ConcurrentSkipListSet<>();

        set.add(33);
        set.add(22);
        set.add(44);
        set.add(94);
        set.add(55);
        set.add(22);

        System.out.println("original set is " + set);

        Set<Integer> set1 = set.descendingSet();
        System.out.println("decending set is " + set1);

        System.out.println("poll last element " + set.pollLast());

        System.out.println("poll first element " + set.pollFirst());

        System.out.println("original set is " + set);
    }
}
