package equals_hashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Student, String> studentmap = new HashMap<>();
        Student student = new Student(1);
        Student student1 = new Student(1);

        studentmap.put(student, "1");
        studentmap.put(student1,"1");

        System.out.println(studentmap.size());

        Integer integer = new Integer(1);
        Integer integer1 = new Integer(1);

        Map<Integer,String> map = new HashMap<>();
        map.put(integer, "1");
        map.put(integer1, "1");
        System.out.println(map.size());
    }
}
