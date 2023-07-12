package genric.custom;

import genric.custom.domain.Laptop;

public class Demo {
    public static void main(String[] args) {

        Laptop<Object> laptop = new Laptop<>("soni");

        laptop.getData(1);

        System.out.println(laptop.val());

    }
}
