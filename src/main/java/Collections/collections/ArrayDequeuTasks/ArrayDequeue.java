package Collections.collections.ArrayDequeuTasks;

import java.util.ArrayDeque;

//Создайте ArrayDeque, добавьте 5 элементов и выведите их.
//Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
//Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
//
//Дополнительные по желанию:
//Реализуйте систему отмены и повтора действий с ArrayDeque.
//Реализуйте метод, который проверяет симметричность строки (палиндром) с использованием ArrayDeque.
public class ArrayDequeue {
    private static ArrayDeque<Integer> ad;

    static { ad = new ArrayDeque<>();
    }
    private static void returnStackLike(){
        while (!ad.isEmpty()){

            System.out.println(ad.pollLast());
        }
    }
    //Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
    private static void returnLast(){
            System.out.println(ad.peekLast());

    }
    private static void addLast(Integer num){
        ad.addLast(num);
       // System.out.println(ad.getLast());
    }
    private static void returnFirst(){
        System.out.println(ad.peekFirst());

    }
    private static void addFirst(Integer num){
        ad.addFirst(num);
     //   System.out.println(ad.getLast());

    }


    public static void main(String[] args) {
       /* ad.addLast(1);
        ad.addLast(2);
        ad.addLast(3);
        ad.addLast(4);
        ad.addLast(5);
        ad.forEach(System.out::println);
        System.out.println();
        */

        //returnStackLike();
        addLast(6);
        addFirst(0);
        ad.forEach(System.out::println);
        System.out.println();
        returnLast(); //6
        returnFirst(); //0
        //ad.forEach(System.out::println);
        System.out.println();
        ad.pollLast();
        ad.pollFirst();
        ad.forEach(System.out::println); //1-5;



    }
}
