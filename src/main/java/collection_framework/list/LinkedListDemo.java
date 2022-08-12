package collection_framework.list;

import domain.User;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Map<Integer, User>> mapList = new LinkedList<>();

        Map<Integer, User> userMap = new HashMap<>();
        userMap.put(1, new User(101, "Vishal",2300.0));
        userMap.put(2, new User(102, "shah",2300.0));
        userMap.put(3, new User(103, "satya",2300.0));
        userMap.put(4, new User(104, "saket",2300.0));


        mapList.add(userMap);

        for (Map.Entry<Integer, User> map : userMap.entrySet()){
            System.out.println(map);
        }

       // System.out.println(mapList.stream().collect(Collectors.toList()));
    }
}
