package genericsPractice.HW;

import java.util.ArrayList;
import java.util.List;

//Работа с числами: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
class NumberBox <T extends Number>{
    private T number1;
    private T number2;

    public NumberBox(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public <T> double sum(){
        double result = number1.doubleValue() + number2.doubleValue();
        return result;
    }
//Ограничение сверху: Напишите обобщённый метод, который принимает List<? extends Number> и вычисляет сумму элементов.

    public <T> void  listSum(List<? extends  Number> list) {
        double result = 0.0d;
        for (Number element : list) {
            result = result + element.doubleValue();
        }
        System.out.println(result);
    }
    //Ограничение снизу: Реализуйте метод, который принимает List<? super Integer> и добавляет в него несколько чисел.

    public <T> void listFilling(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);


    }

    public static void main(String[] args) {
        NumberBox<Integer> boxOfNumber = new NumberBox<>(1,5);

        /*System.out.println(boxOfNumber.sum());
        List list;
        list = new ArrayList<>(List.of(1,2,3,5));
        boxOfNumber.listSum(list);

         */
        List<Integer> list2;
        list2 = new ArrayList<>();
        boxOfNumber.listFilling(list2);
        ListPrinter.listPrinter(list2);
    }
}
