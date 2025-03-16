package Collections.collections.ArrayList.LinkedhashMap;

import java.util.LinkedHashMap;
///Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
////Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
public class SimpleLinkedHashMap {
    private LinkedHashMap<String, Integer> phoneBook;

    public SimpleLinkedHashMap(){
        this.phoneBook = new LinkedHashMap<>();
    }

    public void add(String str, Integer number){
        phoneBook.put(str, number);
    }
    public void print(){
        phoneBook.forEach((key,value)-> System.out.println("name is " + key + " phone is " + value));
    }
    public void findContact(String str){
        if (phoneBook.containsKey(str)) {
            phoneBook.get(str);
            System.out.println(("name is " + str + " phone is " + phoneBook.get(str)));
        }
        else {
            System.out.println("We don't have any information about this contact in our database");
        }
    }
    public void deleteContact(String str){
        if (phoneBook.containsKey(str)) {
            phoneBook.remove(str);
            System.out.println("Contact " + str + " has been removed from our phoneBook ");
        }
        else {
            System.out.println("We don't have any information about this contact in our database");
        }
    }
}
