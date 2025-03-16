package Collections.collections.HashMapTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
//Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.
public class NameAndAge {
    private Map<String,Integer> names;

    protected NameAndAge(){
        this.names = new HashMap<>();
    }
    protected void add(String name, Integer age){
        names.put(name,age);
    }
    protected void print(){
        names.forEach((name, age)-> System.out.println("Name is: " + name + " age is: " + age));
    }
    //Проверьте, есть ли определённое имя в HashMap.
    protected void isNameExists(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = console.nextLine();

        boolean isExists = names.containsKey(name);
        if(isExists) {
            System.out.println("Yes, we have " + name);
        }
            else{
                System.out.println("No, we don't have " + name);
            }



    }
    //Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.
    protected void removeIfYoung(){
        names.values().removeIf((value)->value<18);
    }
}
