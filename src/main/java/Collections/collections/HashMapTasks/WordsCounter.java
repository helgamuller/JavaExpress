package Collections.collections.HashMapTasks;
//Создайте HashMap, где ключ – слово, а значение – количество его вхождений в тексте.

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    private Map<String, Integer> words;

    public WordsCounter(){
        this.words = new HashMap<>();
    }
    //
    protected void wordsCount(String word){
        if (words.containsKey(word)) {
        Integer wordsCounter = words.get(word);
        wordsCounter++;
            words.put(word,wordsCounter);
        }
        else {
            words.put(word, 1);
        }

    }
    protected void print(){
        words.forEach((key, value)-> System.out.println("Word: " + key + " has been met "+ value+ " times."));
    }
}

