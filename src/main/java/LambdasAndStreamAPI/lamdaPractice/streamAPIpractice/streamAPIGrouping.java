package LambdasAndStreamAPI.lamdaPractice.streamAPIpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPIGrouping {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        Map<String, List<String>>namesGrouped = names.stream()
                .collect(Collectors.groupingBy(str->str.substring(0,1),
                        Collectors.mapping(str -> str,
                                Collectors.toList()))
                );
        System.out.println(namesGrouped);

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Map<String, List<Integer>> groupedNumber = numbers.stream()
                .collect(Collectors.groupingBy(n->String.valueOf(n%2==0)));
        System.out.println(groupedNumber);

        Double average = numbers.stream()
                .collect(Collectors.averagingInt(n->n));
        System.out.println(average);
    }
}
