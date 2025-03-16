package Collections.collections.ArrayList.TreeMapTasks;
//Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
//Найдите минимальный и максимальный ключ в TreeMap.
//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
//Напишите метод, который объединяет два TreeMap, удаляя дубликаты.
//Реализуйте механизм кэширования, где ключи автоматически удаляются, если они устарели.
public class Main {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.add("Katya", 5);
        map.add("Anna",4);
        map.add("Olga", 6);
        map.add("Igor",2);
        map.print();
        System.out.println(map.maxKey());
        System.out.println(map.minKey());
        map.nextBigger("Anna");
    }
}
