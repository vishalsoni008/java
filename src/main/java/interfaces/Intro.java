package interfaces;

interface Provide{
    public static void main(String[] args) {
        System.out.println("main inside interface");
    }
    default void hello(){
        System.out.println("hello ");
    }
}

public class Intro implements Provide{
    public static void main(String[] args) {
        System.out.println("main in side class");

        Provide provide = new Intro();
        provide.hello();
        Provide.main(null);
    }
}
