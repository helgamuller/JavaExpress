package Collections.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task5 {
    private ArrayList<Integer> list;

    public Task5(){
        this.list = new ArrayList<>();
    }

    public ArrayList<Integer> getList() {
        return list;
    }
//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
//Напишите программу, которая удаляет все чётные числа из ArrayList.
//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
//Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
//Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
    public void addElements(Integer... elements) {
        Collections.addAll(list, elements);
    }
    public ArrayList<Integer> returnSortedList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                if(list.get(j)> list.get(j+1)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);

                }

            }

        }

        return list;
    }
    public void print(){
        System.out.println(list);
    }
}


