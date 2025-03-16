package Collections.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    private ArrayList<String> list;
//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
//Напишите программу, которая удаляет все чётные числа из ArrayList.
//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
//Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
//Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
    public Task3() {
        this.list = new ArrayList<>();
        Collections.addAll(list, "1234555", "454", "554545454544", "");
    }

    public String findTheLongest() {
        int length = list.get(0).length();
        String theLongest=list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > length) {
                length = list.get(i).length();
                theLongest = list.get(i);
            }
        }

        return theLongest;
    }

        public void print() {
            System.out.println(findTheLongest());
        }
    }



