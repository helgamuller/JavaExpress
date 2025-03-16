package Collections.collections.ArrayList.TreeSet;

import java.util.*;

//Реализуйте сортировку пользователей по имени с TreeSet и Comparator.
public class UserNameSorting {
    public  TreeSet<String> names;
    public  TreeSet<String> reversedNames;
    public UserNameSorting(){
        this.names = new TreeSet<>();
        this.reversedNames = new TreeSet<>(Comparator.reverseOrder());
    }
    public void add(String str) {
        names.add(str);
    }

    public  void createReversedList(){
        List<String> namesList = new ArrayList<>(names);
        namesList.sort(Comparator.reverseOrder());
        reversedNames.addAll(namesList);
    }


    public void print(){
        names.forEach(System.out::println);
        reversedNames.forEach(System.out::println);
    }



}
