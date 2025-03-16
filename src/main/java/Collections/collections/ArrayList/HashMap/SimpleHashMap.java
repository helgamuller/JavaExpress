package Collections.collections.ArrayList.HashMap;

import java.util.HashMap;

public class SimpleHashMap {
    //Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
//Проверьте, есть ли определённое имя в HashMap.
    //      Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.
    HashMap<String, Integer> names;
    public SimpleHashMap(){
        this.names = new HashMap<>();
    }
    public void add(String str, Integer num){
        names.put(str, num);
    }
    public void print(){
        names.forEach((key, value)->System.out.println("The key is: "+ key +" The value is: "+ value));
    }
    public boolean isContain(String str) {
         return names.containsKey(str);
    }
    public void removeYoung(){
    names.values().removeIf(value->value<18);    }

}
