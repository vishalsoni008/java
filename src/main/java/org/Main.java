package org;


import java.util.List;

public class Main{
    public static void main(String[] args) {

        Demo demo = (a,b) -> {
            if(a%b == 0){
                return true;
            }
            return false;
        };

        System.out.println(demo.isData(4,2));

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> even = list.stream().filter( i -> i%2==0).toList();

        System.out.println(even);

    }
}