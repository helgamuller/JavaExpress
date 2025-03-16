package Collections.collections.ArrayList.TreeSet;
//Используйте TreeSet для хранения уникальных слов из текста в отсортированном порядке.

import java.util.Collections;
import java.util.TreeSet;

public class UniqueWords {
    private TreeSet<String> words;

    public UniqueWords(){
        this.words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    }
    public void addWords(String... elements){
        Collections.addAll(words, elements);
    }
    public void print(){
        words.forEach(System.out::println);
    }

}
