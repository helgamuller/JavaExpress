package Collections.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
//Напишите программу, которая удаляет все чётные числа из ArrayList.
//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
//Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
//Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
public class Task1 {
    private ArrayList<Integer> list;


    public Task1(){
        this.list = new ArrayList<>(5);
        Collections.addAll(list,1,2,3,4,5);
    }
    public void addNumber(Integer number){
        list.add(number);
    }
    public void print(){
        list.forEach(System.out::println);
    }

}
