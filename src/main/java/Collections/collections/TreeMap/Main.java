package Collections.collections.TreeMap;
//Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
//Найдите минимальный и максимальный ключ в TreeMap.
//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
//
//Дополнительные по желанию:
//Напишите метод, который объединяет два TreeMap, удаляя дубликаты.
//Реализуйте механизм кэширования, где ключи автоматически удаляются, если они устарели.
public class Main {
    public static void main(String[] args) {
      /*  TreeMapTasks map = new TreeMapTasks();
        map.add("Kate", 9);
        map.add("Olga", 6);
        map.add("Anton", 4);
        map.add("Ivan", 1);
        map.add("Ann", 3);
        map.print();
        map.manAndMax();

       */
        Employees map = new Employees();
        map.addEmployee(4, "Ivan");
        map.addEmployee(7,"Kate");
        map.addEmployee(3, "Ann");
        map.nextLarger(3);
    }
}
