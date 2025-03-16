package Collections.collections.LinkedHashMapTasks;
//Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
//Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
//Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
//Напишите метод, который отсортирует LinkedHashMap по значениям.
//Реализуйте LRU-кэш (Least Recently Used) на основе LinkedHashMap.
public class Main {
    public static void main(String[] args) {
       /* LHMSimpleTasks map = new LHMSimpleTasks();
        map.add("first", 1);
        map.add("second", 2);
        map.add("third", 3);
       // map.print();
        map.remove("first");
        map.print(); // second and third
        map.checkIfContains("second"); //yes
        map.checkIfContains("first"); //no


        PagesHistory pages = new PagesHistory();
        pages.add("first",1);
        pages.add("second",2);
        pages.add("forth",5);
      //  pages.print();
        pages.add("4",4);
       // pages.print();//2,3,4
        pages.sortMap();
        pages.print();

        *

        */
    LRUCache lru = new LRUCache();
    lru.addLru("first", 1);
    lru.addLru("second", 2);
    lru.addLru("third", 3);
    lru.print();//1,2,3
    lru.takeO("second");
    lru.print(); //1,3,2
    lru.addLru("new",5);
    lru.print(); //3,2,5
    }
}
