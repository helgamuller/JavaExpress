package Collections.collections.TreeSetTasks;
//Реализуйте сортировку пользователей по имени с TreeSet и Comparator.

import java.util.TreeSet;

public class UsersSorting {
    private static TreeSet<String> names;
    static {
        names = new TreeSet<>();
    }
    private static void print(TreeSet<String> set){
        for(String name: set){
            System.out.println(name);
        }
    }
    private static TreeSet<String> reverseTree(){
    TreeSet<String> reversedNames = new TreeSet<>(names.reversed());
    return reversedNames;
    }


    public static void main(String[] args) {
        names.add("Anna");
        names.add("pet");
        names.add("Pet");
        print(names);
        reverseTree();
        print(reverseTree());
    }
}
