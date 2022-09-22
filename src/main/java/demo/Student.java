package demo;

public class Student {
    int i;
    private Student(){
    }

    public Student(int i){
        this.i = i;
    }

    public void nonStatic(){
        System.out.println("this is non static method");
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("this a static method");
        Student student = new Student();
        //student.nonStatic();
    }

    public static void main(String[] args) {
      //  staticMethod();
        Student student = new Student();
        student.nonStatic();

        Object o= new Object();
    }
}
