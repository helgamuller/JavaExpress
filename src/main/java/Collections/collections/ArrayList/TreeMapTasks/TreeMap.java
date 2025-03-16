package Collections.collections.ArrayList.TreeMapTasks;
//Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
//Найдите минимальный и максимальный ключ в TreeMap.
//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

public class TreeMap {
    private java.util.TreeMap<String, Integer> tree;

    public TreeMap(){
        this.tree = new java.util.TreeMap<>();
    }
    public void add(String str, Integer num) {
        tree.put(str, num);
    }
    public void print(){
        tree.forEach((key, value) -> System.out.println(key +"->"+ value));
    }
    public String maxKey(){
        return tree.lastKey();
    }
    public String minKey(){
        return tree.firstKey();
    }
    public void nextBigger(String key){
         String next = tree.higherKey(key);
        System.out.println("A next bigger id: " + next );
    }

}
