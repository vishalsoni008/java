package domain;

import java.util.ArrayList;
import java.util.List;

public class User implements Comparable<User> {
    private Integer id;
    private String name;
    private Double salary;

    List<String> list = new ArrayList<>();

    public User(Integer id, String name, Double salary, List<String> list) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.list = list;
    }

    public User(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(User user) {
        return (int) (this.salary-user.salary);
    }
}
