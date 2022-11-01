package comparable;

import domain.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        //  Student student = new Student();

        List<User> users = new ArrayList<>();

        users.add(new User(1, "vishal", 1200.0));
        users.add(new User(2, "indra", 1600.0));
        users.add(new User(3, "harish", 1100.0));
        users.add(new User(4, "sai", 1800.0));

        Collections.sort(users);

        for (User user : users) {
            System.out.println(user);
        }
    }

}
