package streamAPIpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiAggregation {
    public static void main(String[] args) {
        //Дано: List<Integer> numbers = Arrays.asList(4, 12, 7, 9, 15);
        //Найдите максимальное число.
       List<Integer> numbers1 = Arrays.asList(1,2,4,6);

                Integer max = numbers1.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
                System.out.println(max);


        List<Integer> numbers = Arrays.asList();
        //Find min value
        Optional<Integer> min =numbers.stream().min(Comparator.naturalOrder()) ;
        System.out.println(min.orElse(0));


        List<Integer> numbers2 = Arrays.asList(4, 12, 7, 9, 15);
        IntStream stream = numbers2.stream()//create a stream of primitive ints
                .mapToInt(n->n);

        System.out.println(stream.sum());



        //* Найдите первое имя, начинающееся на "Б".
        List<String> names = Arrays.asList("Алексей", "Антон", "Борис", "Анна");
        String firstFoundName = String.valueOf(names.stream()
                .filter(str->str.startsWith("Б"))
                .findFirst()
                .orElse("Not Found"));
        System.out.println(firstFoundName);


        //Проверка, содержит ли список хотя бы один элемент по условию
//Дано: List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
// Проверьте, есть ли хотя бы одно четное число (anyMatch()).
        List<Integer> numbers3 = Arrays.asList(1, 3, 4, 7, 9);
        Integer evenNumber = numbers3.stream()
                .filter(n->n%2==0)
                .findAny()
                .orElse(0);
        System.out.println(evenNumber);



    }
}
