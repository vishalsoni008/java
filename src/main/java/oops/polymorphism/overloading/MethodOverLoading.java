package oops.polymorphism.overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();

        methodOverLoading.add(1, 2);

        methodOverLoading.add(2.0, 3.0);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}
