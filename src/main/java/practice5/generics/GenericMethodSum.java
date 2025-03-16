package practice5.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Ограничение сверху: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.
//Ограничение снизу: Реализуйте метод, который принимает List<? super Integer> и добавляет в него несколько чисел.
public class GenericMethodSum {

    private static void sumOfElements(List<? extends Number> list) {
        double sum =0.0d;

        for (Number element: list) {
        sum += element.doubleValue();
        }
        System.out.println(sum);

    }

    private static void addValues(List<? super Integer> list, Integer item, Integer item2) {
        list.add(item);
        list.add(item2);


    }

    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Collections.addAll(list, 1,2,3,5);
    sumOfElements(list);
    List<Integer> list2 = new ArrayList<>();
    addValues(list2, 3,5);
    list2.forEach(System.out::println);
    }


}
