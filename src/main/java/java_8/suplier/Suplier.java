package java_8.suplier;

import java.util.function.Supplier;

public class Suplier {
    public static void main(String[] args) {

        Supplier<String> s = () -> "vishal";

        System.out.println(s.get());
    }
}