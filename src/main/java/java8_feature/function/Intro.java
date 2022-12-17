package java8_feature.function;



import java.util.function.Function;

public class Intro {
    public static void main(String[] args) {
        /*
        having two genric
        1. first genric is work as T
        2. second one is defne return type of this function interface.
         */
        Function<Integer, Double> fun = a -> a/10.0;

        //apply funtion use to apply some value
        System.out.println(fun.apply(20));

        // andThen() use for update value after its creation
        // we can update as our requirement
        fun = fun.andThen(a-> a*2);
        System.out.println(fun.apply(20));
         //null pointer exception occuring
        //fun = fun.andThen(null);

    }
}
