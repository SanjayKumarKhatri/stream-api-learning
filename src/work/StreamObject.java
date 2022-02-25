package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API - Collection process
        //Collection / group of objects

        // 1- Blank
        Stream<Object> empty = Stream.empty();

        //2-arrays, Object,Collection
        String names[] = {"Sanjay","Kumar","Khatri"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(e ->{
            System.out.println(e);
        });

        //3-Build
        Stream<Object> build = Stream.builder().build();

        //4-Arrays
        IntStream stream = Arrays.stream(new int[]{2, 3, 5, 8, 9, 6});
        stream.forEach(i -> {
            System.out.println(i);
        });

        //5-List, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(65);
        list2.add(54);
        list2.add(34);
        list2.add(13);

        Stream<Integer> stream1 = list2.stream();
        stream1.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
