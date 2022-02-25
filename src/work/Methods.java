package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(Predicate) it returs true,false
            //boolean value function
            //e->e>10

        //map(Function) it returns value

        List<String> names = List.of("Sanjay", "Arshad", "Usama", "Munesh", "Salman");
        List<String> collect = names.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> num = List.of(2, 8, 6, 4, 7);
        List<Integer> numbers = num.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(numbers);

        names.stream().forEach(e ->{
            System.out.println(e);
        });

        collect.stream().forEach(System.out::println);

        //Sorted
        num.stream().sorted().forEach(System.out::println);

        //find minimum number in list
        Integer integer = num.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min : "+integer);

        //find maximum number in list
        Integer integer1 = num.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max : "+integer1);

    }
}
