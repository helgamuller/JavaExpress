package practice5.generics;
//Обобщённый интерфейс: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
public interface Container <T>{
    void  add(T item);
    void get();
}
