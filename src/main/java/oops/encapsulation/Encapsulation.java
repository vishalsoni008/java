package oops.encapsulation;
/*
in user class we can see there some of set of attribute and
there benhaviour into single unit which is user class
that is we called
bind data with his behaviour into single unit called encapsulation
*/

import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Encapsulation {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        User user1 = new User(1, "vishal", 11000.00);
        User user2 = new User(2, "satya", 12000.00);
        User user3 = new User(3, "Dusang", 8000.00);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getSalary());
        }

        List<User> updateSalary = users.stream().map(m -> {
            if (m.getSalary() > 10000) {
                m.setSalary(m.getSalary() + 10);
            }
            return m;
        }).collect(Collectors.toList());

        System.out.println("\nafter updated salary\n");

        for (User user : updateSalary) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getSalary());
        }
    }
}
