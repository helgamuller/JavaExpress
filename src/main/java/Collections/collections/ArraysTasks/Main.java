package Collections.collections.ArraysTasks;

import java.util.ArrayList;

//Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
//Напишите программу, которая удаляет все чётные числа из ArrayList.
//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
//Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
//Напишите метод, который принимает ArrayList<Integer> и возвращает новый список с числами в отсортированном порядке без использования Collections.sort().
public class Main {
    public static void main(String[] args) {
    /*   SimpleArray array = new SimpleArray();
        array.addElements(1,2,3,4,5);
        array.printArray();
        array.addElements(6);
        array.printArray();
        array.removeEven();
        array.printArray();

        LongestString string = new LongestString();
        string.addElement("123","345677","1");
        string.theLongestString();


        MergeArrays.list1.add(1);
        MergeArrays.list1.add(2);
        MergeArrays.list1.add(3);
        MergeArrays.list2.add(1);
        MergeArrays.list2.add(4);
        MergeArrays.mergeArrays();
        MergeArrays.print();
*/
        SimpleArray array = new SimpleArray();
        array.addElements(5,3,6,8,1);
        ArrayList<Integer> list = array.sortArray();
        list.forEach(System.out::println);


    }
}
