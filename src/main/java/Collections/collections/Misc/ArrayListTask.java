package Collections.collections.Misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListTask {
    private static List<Integer> list;
    private static Map<String, Integer> words;
    static {
        list = new ArrayList<>();
        words = new HashMap<>();
    }
    private static void addWord(String word) {
        if(words.containsKey(word))
        {
            Integer count = words.get(word);
            words.replace(word, ++count);
        }
        else {
            words.putIfAbsent(word, 1);
        }
    }

    public static void main(String[] args) {
       /* list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        list.set(1,345);
        list.forEach(System.out::println);
        */

        addWord("Monkey");
        addWord("Monkey");
        addWord("Cat");
        words.forEach((key, element) -> System.out.println(key + " " + element));
    }
}
