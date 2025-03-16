package Collections.collections.ArrayList.LinkedhashMap;
//Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

import java.util.LinkedHashMap;
import java.util.Map;

/// /Напишите метод, который отсортирует LinkedHashMap по значениям.
public class LastVisitedPages {
    private LinkedHashMap<String, Long> pages;

    public LastVisitedPages(){
        this.pages = new LinkedHashMap<String, Long>(10, 0.75f)
        {
            @Override
            protected boolean removeEldestEntry (Map.Entry < String, Long > eldest){
            return size() > 10;
//
        }
        };
    }

    public void add(String str){
        pages.put(str, System.currentTimeMillis());

    }
    public void print(){
        pages.forEach((key, value)-> System.out.println("Page " + key + "was visited at " + value ));
        System.out.println();
    }

}
