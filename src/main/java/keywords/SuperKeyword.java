package keywords;

class Parent{
    int age = 20;
    String name = "vishal";

    public Parent(){
        System.out.println("parent class Constructor");
    }

    public void print(){
        System.out.println("calling print method from parent class");
    }
}

class Child extends Parent{

    int age = 11;
    String name = " soni";

    public Child(){
        super();
        System.out.println("child class constractor");
        System.out.println("parent name : "+super.name);
        System.out.println("parent age : "+super.age);
        System.out.println("child name : "+name);
        System.out.println("child age : "+age);
    }

    public void cc(){
        super.print();
        System.out.println("method from child class");
    }


}

public class SuperKeyword {
    public static void main(String[] args) {

        Child child = new Child();

        child.cc();


    }
}
