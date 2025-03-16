package Collections.collections.ArraysTasks;

import java.util.ArrayList;
import java.util.Collections;

//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
public class SimpleArray {
    private ArrayList<Integer> array;

    public SimpleArray(){
        this.array = new ArrayList<>();
    }
    public void printArray(){
        array.forEach(System.out::println);
        System.out.println();
    }
    public void addElements(Integer... elements){
        Collections.addAll(array,elements);
        }
     //Напишите программу, которая удаляет все чётные числа из ArrayList.
    public void removeEven(){
        array.removeIf(element ->(element%2==0));
    }
    //Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
    public ArrayList<Integer> sortArray(){
        for (int i = 0; i < array.size()-1; i++) {
            for (int j = 0; j < array.size()-i-1; j++)
                if(array.get(j)> array.get(j+1)){
                    int temp = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1,temp);
                }
            }
        return array;
        }

    }


