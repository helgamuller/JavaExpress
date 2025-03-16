package Collections.collections.ArrayList.LinkedhashMap;

//Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
//Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
//Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
//Напишите метод, который отсортирует LinkedHashMap по значениям.
//Реализуйте LRU-кэш (Least Recently Used) на основе LinkedHashMap.
public class Main {
    public static void main(String[] args) {
   /*SimpleLinkedHashMap phoneBook = new SimpleLinkedHashMap();
    phoneBook.add("Masha", 1111111);
    phoneBook.add("Petya", 222222);
    phoneBook.findContact("Masha");
    phoneBook.findContact("Ivan");

        phoneBook.deleteContact("Masha");
        phoneBook.deleteContact("Ivan");


        LastVisitedPages pages = new LastVisitedPages();
        pages.add("1");
        pages.add("2");
        pages.add("3");
        pages.add("4");
        pages.add("5");
        pages.add("6");
        pages.add("7");
        pages.add("8");
        pages.add("9");
        pages.add("10");
        pages.print();
        pages.add("12");
        pages.print();

        LinkedHashMapSorting sort = new LinkedHashMapSorting();
        sort.add("test",3);
        sort.add("test1", 2);

        LinkedHashMap<String, Integer> orderedList = sort.sort();
        sort.print(orderedList);

        */
        LRUCache cache = new LRUCache();
        cache.add("First", 23);
        cache.add("Second", 33);
        cache.add("Third", 44);
        cache.add("Forth", 66);
        cache.print();
        cache.get("Second");
        cache.print();
    }
}
