package collection_framework.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        for (int number : list) {
            System.out.println(number);
        }

        System.out.println(list.isEmpty());
    }
}
