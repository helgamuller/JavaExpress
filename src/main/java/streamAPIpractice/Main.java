package streamAPIpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Дано: List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Functional");
        //Оставьте только строки длиной больше 5.
       /* List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Functional");
        List<String> longWords=words.stream()
                .filter(str->str.length()>5)
                .collect(Collectors.toList());

        System.out.println(longWords);
        */
    //Дано: List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20);
        //Оставьте только числа, кратные 5.
       /* List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20);
        List<Integer>numbersModuloFive = numbers.stream()
                .filter(n->n%5==0)
                .collect(Collectors.toList());
        System.out.println(numbersModuloFive);


        //Дано: List<String> words = Arrays.asList("apple", "banana", "cherry");
        //Преобразуйте List<String> в List<Integer> (длины строк).

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengthOfWords = words.stream()
                .map(w->w.length())
                .collect(Collectors.toList());
        System.out.println(lengthOfWords);


        //Дано: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //Получите List<Integer>, содержащий квадраты этих чисел.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareOfNumbers = numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
                System.out.println(squareOfNumbers);

        //Дано: List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 4);
        //Отсортируйте числа по убыванию.
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 4);
        List<Integer>sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
                System.out.println(sortedNumbers);


        //Дано: List<String> words = Arrays.asList("banana", "apple", "cherry");
        //Отсортируйте список в алфавитном порядке.
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedWords);


        //Дано: List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        //Посчитайте, сколько имен начинается на "А".
        List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        int count = (int) names.stream()
                .filter(str->str.startsWith("А"))
                .count();
        System.out.println(count);


        //Дано: List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        //Получите список уникальных чисел.
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer>uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);


        */
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer>uniqueNumbers = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println(uniqueNumbers);
    }
}
