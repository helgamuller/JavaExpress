package Collections.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    private ArrayList<Integer> list;

    public Task4(){
        this.list = new ArrayList<>();
    }
    //Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
    //Напишите программу, которая удаляет все чётные числа из ArrayList.
    //Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
    //Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
    //Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
    //merge and delete duplicates
    public void addElements(Integer... elements){
        Collections.addAll(list, elements);
    }

    public void mergeArrayLists(ArrayList list1, ArrayList list2){
        for (int i =0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) {
                list1.add(list2.get(i));
            }
        }
    }
    public void print() {
        list.forEach(System.out::println);
    }
    public ArrayList<Integer> getList(){
        return this.list;
    }
}
