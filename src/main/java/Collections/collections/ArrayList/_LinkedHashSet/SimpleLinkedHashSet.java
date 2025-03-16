package Collections.collections.ArrayList._LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

//Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
//Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
public class SimpleLinkedHashSet {
    private LinkedHashSet<String> linkedSet;
    public SimpleLinkedHashSet(){
        this.linkedSet = new LinkedHashSet<>();
    }
    public void addElements(String... elements){
        Collections.addAll(linkedSet, elements);
    }
    public void addUniqueElement(){
        Scanner console = new Scanner(System.in);
        String newElement = console.nextLine();
        if (!linkedSet.contains(newElement))
        {linkedSet.add(newElement);
            print();}
        else{
            System.out.println("Element has been added before");
        }
    }
    public void print(){
        linkedSet.forEach(System.out::println);
    }

}
