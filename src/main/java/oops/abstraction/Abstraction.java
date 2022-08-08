package oops.abstraction;
/*
abstraction is way where we get only set of services
where we only get service without knowing there internal implemention
*/
@FunctionalInterface
interface Demo{
    int add(int a, int b);
   // void show();
}
public class Abstraction implements Demo{
    public static void main(String[] args) {

        Demo d = (a,b) -> {
            return 2+4;
        };

        System.out.println(d.toString());

        Abstraction abstraction = new Abstraction();
        System.out.println(abstraction.add(1,2));

    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
