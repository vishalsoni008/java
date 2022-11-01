package collection_framework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // List list = new ArrayList();  //lit without genric

        List<Integer> list = new ArrayList<>(); // list with genric

        String s = "121";
        list.add(Integer.parseInt(s));
        list.add(1);
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.getClass());

    }
}
