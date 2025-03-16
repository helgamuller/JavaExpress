package Collections.collections.ArrayList.HashMap;

import java.util.HashMap;
//     Создайте HashMap, где ключ – слово, а значение – количество его вхождений в тексте.

public class HashMapWordsAmount {
    private HashMap<String, Integer> wordsCount;
    public HashMapWordsAmount(){
        this.wordsCount=new HashMap<>();
    }
    public void addElement(String str){

        if(wordsCount.containsKey(str)){
            int value = wordsCount.get(str);
            wordsCount.put(str, value+1);
        }
        else {
            wordsCount.put(str,1);
        }
    }
    public void print(){
        wordsCount.forEach((key, value)-> System.out.println("Word " + key + " has been met in a text for "+ value + " times"));
    }
}
