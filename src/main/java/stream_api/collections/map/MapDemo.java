package stream_api.collections.map;

import domain.Student;
import stream_api.collections.StaticData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Student> studentList = StaticData.addStaticData();

        Map<Integer, Student> map = new HashMap<>();
        int index =0;

        studentList.forEach(s-> map.put(s.getId(), s));

        map.forEach((k,v) -> System.out.println(k+" "+v));

        Map<Integer, String> map1 = studentList.stream().collect(Collectors.toMap(
                Student::getId,
                Student::getName,
                (k,v) -> k+","+v,
                HashMap::new
        ));

        System.out.println(map1);
    }
}
