package Collections.collections.LinkedList;

import java.util.*;

//Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
public class SimpleListTasks {
    private LinkedList<String > list;
    public SimpleListTasks(){
        this.list =new  LinkedList<String>();
    }
    protected void addElements(String... elements){
        Collections.addAll(list, elements);
    }
    protected void print(){
        list.forEach(System.out::println);
        System.out.println();
    }
    ////Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
    //adding single element
    //process tasks
    protected void addOneElement(String str) {
        list.add(str);
    }
    protected void processTask(){
        list.removeFirst();
    }
    ////Используйте ListIterator для прохода по LinkedList в обоих направлениях.
    protected void iterateListForward(){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println();
        }
    }
    protected  void  iterateListBackward(){
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
            System.out.println();
        }
    }
    //Напишите метод, который удаляет каждый второй элемент из LinkedList.
    protected void deleteEverySecondElement(){
        ListIterator<String> iterator= list.listIterator();
        boolean remove = false;
        while(iterator.hasNext()){
            iterator.next();

            if(remove) {
                iterator.remove();
            }
            remove = !remove;
        }
    }
    //Реализуйте метод, который находит и удаляет все дубликаты в LinkedList.
    protected static List<Integer> list1;

    protected static void removeDuplicatesFromList(){
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i+1; j < list1.size(); j++) {
                if(list1.get(i)==(list1.get(j))) {
                    list1.remove(j);
                    j--;
                }

            }

        }
    }
    protected static void print1(){
        list1.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        list1 =new ArrayList<Integer>();
        Collections.addAll(list1,3,4,5,1,2,3,1);
        removeDuplicatesFromList();
        print1();


    }
}
