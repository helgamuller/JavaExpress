package practice6.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SortedUniqueElements {
    //list with duplicates
    //i need to return unique values sorted
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 4, 2, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .peek(n->System.out.println("distinct " + n))
                .sorted()
                .peek(n->System.out.println("sorted " + n))
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }
}