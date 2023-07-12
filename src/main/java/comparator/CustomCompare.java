package comparator;

import domain.Student;

import java.util.Comparator;

public class CustomCompare implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getName().compareTo(t1.getName());
    }
}
