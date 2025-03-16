package Collections.collections.LinkedList;
//Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
//Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
//Используйте ListIterator для прохода по LinkedList в обоих направлениях.
//Напишите метод, который удаляет каждый второй элемент из LinkedList.
//Реализуйте метод, который находит и удаляет все дубликаты в LinkedList.
public class Main {
    public static void main(String[] args) {
        SimpleListTasks list = new SimpleListTasks();
        list.addElements("1","2", "3", "4", "5", "1", "4");
        list.print();

      //  list.addOneElement("6");
      //  list.addOneElement("7");
       // list.addOneElement("8");
     //   list.print();
     //   list.processTask();
     //   list.print();
       // list.processTask();
       // list.print();
          //  list.iterateListForward();
           // list.iterateListBackward();
          //  list.deleteEverySecondElement();
            list.print();
            list.removeDuplicatesFromList();
            list.print();

    }
}
