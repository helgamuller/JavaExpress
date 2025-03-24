package LambdasAndStreamAPI.lamdaPractice.streamAPIpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class APIAggregationTasks {
    public static void main(String[] args) {


        //Finding max element
       List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
       /*
        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(max);

        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(min);


        IntStream stream = numbers.stream()
                .mapToInt(n->n);
        System.out.println(stream.sum());


        List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        String firstName =names.stream()
                .filter(str -> str.startsWith("Б"))
                .findFirst().orElse("Nothing");
        System.out.println(firstName);
        */
        boolean isEven = numbers.stream()
                .anyMatch(n-> n%2==0);
        System.out.println(isEven);

    }
}
