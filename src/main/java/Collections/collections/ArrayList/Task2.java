package Collections.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    private ArrayList<Integer> list;

    public Task2(){
        this.list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,0);
    }
    public void removeEven(){
        list.removeIf(number->number%2==0);
    ;}
    public void print(){
        list.forEach(System.out::println);
    }

}