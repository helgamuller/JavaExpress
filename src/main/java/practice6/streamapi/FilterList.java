package practice6.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

 class FilterList {
    public static void main(String[] args) {
        //1. Create a list of integer numbers, filter out all evens and sum them
        //Interim operation: filtration by evenness
        //Terminal operation: summarising

        List<Integer> numbers = Arrays.asList(1, 2,3,4,5,6);
        IntStream stream= numbers.stream()
                .filter(n->{
                    System.out.println("filter: " +n);
                    return n%2==0;
                })
                .mapToInt(n->{
                    System.out.println("mapToInt");
                    return n;
                });
        System.out.println("Stream is created but terminal method hasn't been called yet");
               int sum = stream.sum();

        System.out.println(sum);

    }

}
