package singleton;

class Singleton{

    private Singleton(){
    }

    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

public class Intro {
    public static void main(String[] args) {

        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();

        System.out.println(a.hashCode() +"\n"+b.hashCode() +"\n"+ c.hashCode());

        if(a == b && a==c){
            System.out.println("all three have same heap memory allocation");
        }
        else
            System.out.println("all are diffrent ");
    }
}
