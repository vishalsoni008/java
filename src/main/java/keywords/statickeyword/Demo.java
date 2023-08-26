package keywords.statickeyword;

public class Demo {
    int age = 10;

    static{
        Demo demo = new Demo();
        demo.age = 11;
        System.out.println(demo.age);
    }

    public static void main(String[] args) {

    }
}
