package Collections.collections.TreeSetTasks;
//Используйте TreeSet для хранения уникальных слов из текста в отсортированном порядке.

import java.util.TreeSet;

public class UniqueWords {
    private static TreeSet<String> words;
    static {
        words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    }
    private static void print(){
        for(String word:words) {
            System.out.println(word);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        words.add("Ivan");
        words.add("ivan");
        words.add("kkk");
        print();
    }
}
