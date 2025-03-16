package practice5.generics;
//Использование нескольких параметров типа: Реализуйте обобщённый класс Pair<K, V>, который хранит пару значений разного типа.
public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(4,"Ivan");
    }

}
