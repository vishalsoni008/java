package oops.inheritance;

class Parent{
    void show(){
        System.out.println("Parent show method");
    }
}

class Child extends Parent{
    @Override
    void show() {
        System.out.println("child class show method");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        Parent pc = new Child();
        pc.show();
    }
}
