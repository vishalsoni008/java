package stream_api.map;

/*
map is a intermidate operator its a lazy also but when applied
terminal operator its get good quality

map used to transform data into one form to another form
*/

import java.util.ArrayList;
import java.util.List;

public class Intro {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.stream() // intial step
                .map(values -> values+10) // intermidate peration
                .forEach(System.out::println); // terminal operation

    }
}
