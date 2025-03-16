package Collections.collections.HashSetTasks;

import java.util.*;

//Создайте HashSet из 5 чисел и выведите его содержимое.
//Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
public class SimpleHashSet {
    private static HashSet<Integer> intset = new HashSet<>();

    private static void addElements(HashSet<Integer> set, Integer... elements){
        Collections.addAll(intset, elements);
    }

    private static void print(HashSet<Integer> intset){
        intset.forEach(System.out::println);
    }
    //Добавьте в HashSet 10 случайных чисел. Проверьте, содержит ли он заданное число.
    //Random
    private static void addTenRandoms(){
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            intset.add(rand.nextInt(20));
        }
    }
    private static boolean isHashSetContainsANumber(){
    Scanner console = new Scanner(System.in);
    System.out.println("Enter an int number: ");
    int number = console.nextInt();
    if (intset.contains(number)){
        return true;
        }
    else {return  false;}
    }

    //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    //create List and fill it
    private static List<String> list;
    //create a method to iterate through list and add all values into set
    private  static Set<String> convertListIntoSet(List<String> list){
        Set<String> set = new HashSet<>();
        list.forEach(set::add);
        return set;
    }
    private static void printStringSet(Set<String> set){
        set.forEach(System.out::println);
    }
//Напишите метод, который проверяет, содержит ли HashSet все элементы из другого Set.
    private static void ifSetContainsOtherSet(Set<Integer> set1, Set<Integer> set2){

        System.out.println(set1.containsAll(set2));
    }


    public static void main(String[] args) {
    /*addElements(intset, 1,2,3,4,5);
        print(intset);
        intset.clear();
        addTenRandoms();
        print(intset);
        System.out.println(isHashSetContainsANumber());


        list = new ArrayList<>();
        Collections.addAll(list,"1", "2", "3","1");
        Set<String> set;
        set = SimpleHashSet.convertListIntoSet(list);
        printStringSet(set);

*/      addTenRandoms();
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2, 13,15,346);
        ifSetContainsOtherSet(intset, set2);
    }

}
