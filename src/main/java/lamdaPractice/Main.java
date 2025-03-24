package lamdaPractice;

import java.util.function.*;

import static java.lang.System.*;

//Реализуйте его с помощью лямбда-выражений (+, -, *, /).
public class Main {
    public static void main(String[] args) {
      /*  MathOperations add = (a,b)->a+b;
        int result = add.operate(4,6);
        System.out.println(result);
        System.out.println("-------");
        MathOperations sub = (a,b)->a-b;
        int result1 = sub.operate(4,6);
        System.out.println(result1);
        System.out.println("-------");
        MathOperations mult = (a,b)->a*b;
        int result3 = mult.operate(4,6);
        System.out.println(result3);
        System.out.println("-------");
        MathOperations div = (a,b)->a/b;
        int result4 = div.operate(12,6);
        System.out.println(result4);


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello form anonymous class!");

            }
        };
        r1.run();

        Predicate<Integer> isEven = x->x%2==0;
        System.out.println(isEven.test(5));

        //Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String, Integer> strLength = str ->str.length();
        System.out.println(strLength.apply("Olga"));

        //Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printer = System.out::println;
        printer.accept("Hello, world!");

       Predicate<Integer> isBiggerThanTen = x->x>10;
       Predicate<Integer> isEven = x->x%2==0;
       boolean resultWithAnd = (isBiggerThanTen.test(12)&&isEven.test(12));
        System.out.println(resultWithAnd);
        System.out.println("------");
        boolean resultWithOr = (isBiggerThanTen.test(9)||isEven.test(9));
        System.out.println(resultWithOr);
         */
        // BiPredicate<Integer, Integer> isBiggerAndEven = (x,y)->x>10&&y%2==0;
        //System.out.println(isBiggerAndEven.test(12,12));
        //  Напишите BiFunction<String, Integer, String>, который принимает имя и возраст, а возвращает строку "Имя: ..., Возраст: ..."
        BiFunction<String, Integer, String> strConcatenation = (name, age) -> {
            return ("Name is: " + name + ", Age is: " + age);
        };
        System.out.println(strConcatenation.apply("Olga", 43));
    }
}