package practice5.generics;
//Работа с числами: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
public class NumberBox<T extends Number> implements Container<T>{
    @Override
    public void add(T item) {
        this.number = item;
    }

    @Override
    public void get() {
        System.out.println(number);
    }

    private T number;
    private T number2;

    public NumberBox(T number, T number2){
        this.number = number;
        this.number2 = number2;
    }

    private <T> double sumOfNumbers() {
        double sum = number.doubleValue() + number2.doubleValue();
        return sum;

    }

    public static void main(String[] args) {
        NumberBox<Double> box = new NumberBox(1.3,3.2);
        System.out.println(box.sumOfNumbers());
        box.add(10.1);
        box.get();

    }
}
