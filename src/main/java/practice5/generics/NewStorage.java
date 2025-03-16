package practice5.generics;
//Обобщённый класс: Создайте класс Storage<T>, который хранит элемент и возвращает его.
//Ограничение сверху: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.
public class NewStorage<T>{
    private T item;


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public static void main(String[] args) {
        NewStorage<String> storage = new NewStorage<>();
        storage.setItem("Item");
        System.out.println(storage.getItem());

    }

}
