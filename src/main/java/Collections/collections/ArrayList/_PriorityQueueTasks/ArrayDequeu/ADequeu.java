package Collections.collections.ArrayList._PriorityQueueTasks.ArrayDequeu;

import java.util.ArrayDeque;

//Создайте ArrayDeque, добавьте 5 элементов и выведите их.
//Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
//Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
//
//Дополнительные по желанию:
//Реализуйте систему отмены и повтора действий с ArrayDeque.

//Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
public class ADequeu {
    private static ArrayDeque<Integer> numbers;

    static{
        numbers = new ArrayDeque<>();
    }

    //        System.out.println(numbers.getFirst());


    public static void main(String[] args) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for(Integer number: numbers) {
            System.out.println(number);
        }
        System.out.println();
        //numbers.forEach((number)-> System.out.println(numbers.poll()));
        //numbers.peek();
        numbers.addFirst(0);
        numbers.addLast(6);
        for(Integer number: numbers) {
            System.out.println(number);
        }
        System.out.println();
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        System.out.println();




    }

}
