package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        //Create a list and filter all even number from list

        List<Integer> list = List.of(2, 8, 7, 6, 9, 24);

       /* List<Integer> list2 = new ArrayList<>();
        list2.add(65);
        list2.add(54);
        list2.add(34);
        list2.add(13);
        System.out.println(list2);*/

       /* List<Integer> list3 = Arrays.asList(90, 80, 70, 55, 30, 20);
        System.out.println(list3);*/

        //without stream
        List<Integer> evenList = new ArrayList<>();

        for (Integer i:list) {
            if (i%2==0){
                evenList.add(i);
            }

        }
        System.out.println(list);
        System.out.println(evenList);

        //using stream
        /*Stream<Integer> stream = list.stream();
        List<Integer> count = stream.filter(i -> i %2== 0).collect(Collectors.toList());
        System.out.println(count);*/

        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = list.stream().filter(i -> i > 6).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
