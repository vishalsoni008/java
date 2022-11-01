package comparator;

import domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "vishal", 101));
        students.add(new Student(2, "indra", 110));
        students.add(new Student(3, "harish", 107));
        students.add(new Student(4, "sai", 115));

        Collections.sort(students, new java.util.Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if (student.getRollNumber().compareTo(t1.getRollNumber()) != 0)
                    return student.getRollNumber().compareTo(t1.getRollNumber());
                return 0;
            }
        });

        Collections.sort(students, new CustomCompare());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
