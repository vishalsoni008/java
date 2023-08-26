package stream_api.collections;

import domain.Student;

import java.util.List;
import java.util.stream.Stream;

public class StaticData {
    public static List<Student> addStaticData(){
        return Stream.of(
                new Student(1,"vishal",124),
                new Student(2,"indrajit",1234),
                new Student(3,"dusang",2124),
                new Student(4,"satya",13324),
                new Student(5,"arvind",132324),
                new Student(6,"saket",12124)
        ).toList();
    }

    private StaticData(){

    }
}
