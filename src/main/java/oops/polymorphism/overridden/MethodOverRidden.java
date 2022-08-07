package oops.polymorphism.overridden;

class Parent{
    void add(int a, int b){
        System.out.println("parent class add method ");
        System.out.println(a+b);
    }

    void show(){
        System.out.println("parent show method");
    }
}
class Child extends Parent{

    void add(double a, double b) {
        System.out.println("child class add method ");
        System.out.println(a+b);
    }
    void show(){
        System.out.println("child show method");
    }
}
public class MethodOverRidden {
    public static void main(String[] args) {
    Parent parent = new Parent();
    parent.add(2,1);

    Child child = new Child();
    child.add(2.0,3.0);

    Parent pc = new Child();
    //pc.add(2.2,3); // error it is indicat first add method not second one.
        pc.show();
    }
}
