package org.oops.inheritance;


class A{
    void sum(){
        System.out.println("sum from super class");
    }
}
class B extends A {
    @Override
    void sum() {
        System.out.println("sum from sub class");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.sum();
        A sc = new B();
        sc.sum();
    }
}
