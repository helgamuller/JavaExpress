package streamAPIpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;


public class StreamApiGrouping {
    public static void main(String[] args) {
        //* Дано: List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");
        //* Разбейте слова по первой букве (используйте Collectors.groupingBy()).
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");

        Map<String, List<String>>wordsGroupedByFirstLetter=words.stream()
                .collect(Collectors.groupingBy(word->{
                System.out.println(word.substring(0, 1));
                return word.substring(0, 1);},
                Collectors.mapping(word->{
                    System.out.println(word);
                    return word;
                },
                        Collectors.toList())));
        System.out.println(wordsGroupedByFirstLetter);


        //Группировка чисел по четности
        //* Дано: List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8);
        //* Разделите числа на четные и нечетные.

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8);

        Map<String, List<Integer>> numbersByEveness = numbers.stream()
                .collect(Collectors.groupingBy(n-> String.valueOf(n%2==0)));
        System.out.println(numbersByEveness);


        //3.Объединение строк через запятую
        //* Дано: List<String> names = Arrays.asList("Анна", "Борис", "Владимир");
        //* Преобразуйте список в одну строку "Анна, Борис, Владимир".

        List<String> names = Arrays.asList("Анна", "Борис", "Владимир");
        String allNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(allNames);


        //Поиск среднего значения чисел
        //* Дано: List<Integer> numbers = Arrays.asList(4, 8, 10, 6);
        //* Найдите среднее значение (Collectors.averagingInt()).

        List<Integer> numbers1 = Arrays.asList(4, 8, 10, 6);
        Double average = numbers1.stream()
                .collect(averagingInt(n->n));
        System.out.println(average);

        //5.Преобразование списка строк в Map
        //* Дано: List<String> words = Arrays.asList("apple", "banana", "cherry");
        //* Создайте Map<String, Integer>, где ключ – слово, а значение – его длина.

        List<String> words1 = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> fruits = words1.stream()
                .collect(Collectors.toMap(
                        word->word,
                        word->word.length()
                ));
        System.out.println(fruits);
}
}
