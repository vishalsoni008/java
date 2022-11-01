package stream_api.basic;

// steam is divided into 3 parts 1. stating  2 intermidiate 3 terminal operation.
// in that we widely use lambda and method refrence.

import java.util.stream.Stream;

public class Intro {

    public static void main(String[] args) {

        String name = "Vishal";

        Stream.of(name)
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);
    }
}
