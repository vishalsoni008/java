package domain;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private Integer rollNumber;

    public Student(Integer id, String name, Integer rollNumber) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    //need to do this beacuse when we pass key a class in map so it will check with hashcode
    // by default map using key not duplicate so each time hash is diffrent so work efficintly way.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rollNumber);
    }
}
