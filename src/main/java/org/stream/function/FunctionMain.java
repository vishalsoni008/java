package org.stream.function;

import java.util.List;
import java.util.function.Function;

public class FunctionMain implements Function<Integer, String> {
    public static void main(String[] args) {

        Function<Integer, String> stringConvert = (integer) -> {
            return Integer.toString(integer);
        };

        System.out.println(stringConvert.apply(12));

        List<Integer> integerList = List.of(1,2,3,4,5,6,7);
        System.out.println(integerList.get(0).getClass());

        List<String> converted = integerList.stream().map(stringConvert).toList();

        System.out.println(converted.get(0).getClass());
        System.out.println(converted);
    }


    @Override
    public String apply(Integer integer) {
        return Integer.toString(integer);
    }
}
