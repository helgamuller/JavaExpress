package Collections.collections.LinkedHashMapTasks;

import java.util.*;


////Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
public class PagesHistory {
    private Map<String, Integer> pages;

    public PagesHistory(){
        this.pages = new LinkedHashMap<String, Integer>()
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size ()>3;
        }


        };
        }
        protected   void sortMap(){
            List<Map.Entry<String, Integer>> arrayList = new ArrayList<>(pages.entrySet());
            arrayList.sort(Map.Entry.<String, Integer>comparingByValue());
            pages.clear();
            //LinkedHashMap<String, Integer> orderedPages = new LinkedHashMap<>();
            for(Map.Entry<String,Integer> entry :arrayList) {
                pages.put(entry.getKey(), entry.getValue());
            }

        }

        protected void add(String str, Integer order){
        pages.put(str, order);
        }
        protected void print(){
        pages.forEach((key, value)-> System.out.println(key + " " + value));
            System.out.println();
        }
    }

