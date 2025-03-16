package Collections.collections.LinkedHashMapTasks;

import java.util.LinkedHashMap;
import java.util.Map;

//Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
//Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
public class LHMSimpleTasks {
    private Map<String, Integer> map;

    public LHMSimpleTasks(){
        this.map = new LinkedHashMap<>();
    }
    protected  void print() {
        map.forEach((key, value) -> System.out.println("Key is " + key + "value is " + value));
        System.out.println();
    }
    protected void add(String str, Integer num){
        map.put(str, num);
    }
    protected void remove(String str) {
        if (map.containsKey(str)){
            map.remove(str);
        }
        else {
            System.out.println("We don;t have this contact in our DB");
        }

    }
    protected void checkIfContains(String str) {
        if (map.containsKey(str)){
            System.out.println("Yes, conact exists");
        }
        else {
            System.out.println("Ww can't find contact");
        }
    }

}
