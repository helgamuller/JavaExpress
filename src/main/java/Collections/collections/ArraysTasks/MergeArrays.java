package Collections.collections.ArraysTasks;

import java.util.ArrayList;
//Реализуйте метод, который объединяет два ArrayList в один и удаляет дубликаты.
public class MergeArrays {
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    protected static ArrayList<Integer> mergeArrays(){
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))){
                list1.add(list2.get(i));
            }

        }
        return list1;
    }
    protected static void  print(){
        list1.forEach(System.out::println);
    }
}
