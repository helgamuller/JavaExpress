package Collections.collections.ArraysTasks;

import java.util.ArrayList;
import java.util.Collections;

////Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
public class LongestString {
    private ArrayList<String> list;

    public LongestString(){
        this.list = new ArrayList<>();
    }
    protected void addElement(String... elements){
        Collections.addAll(list, elements);
    }
    protected void theLongestString(){
        String longest = list.getFirst();
        int length = longest.length();
        for (int i = 1; i <list.size() ; i++) {
            if(list.get(i).length()>length){
                longest = list.get(i);
            }

        }
        System.out.println("The longest string in Array is: " + longest);
    }

}
