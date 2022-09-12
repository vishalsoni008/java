package genric.custom;

import genric.custom.domain.Laptop;

public class Demo {
    public static void main(String[] args) {
        Laptop<Integer> laptop = new Laptop();

        laptop.setCompany("msi");
        laptop.setName("gtx");

        System.out.println(laptop);
    }
}
