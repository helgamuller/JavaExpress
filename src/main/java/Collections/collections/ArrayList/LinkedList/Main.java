package Collections.collections.ArrayList.LinkedList;

//Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
//Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
//Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 //       Напишите метод, который удаляет каждый второй элемент из LinkedList.
  //      Реализуйте метод, который находит и удаляет все дубликаты в LinkedList.
public class Main {
    public static void main(String[] args) {

       // Task1 task = new Task1();
        //task.addElements("we","wewe", "rtrt", "wewewwew", "11");
        //task.print();

       /* Task2 task = new Task2();
        task.addNewTask("1");
        task.addNewTask("2");
        task.addNewTask("3");
        task.print();
        task.processNextTask();
        task.print();
        task.processNextTask();
        task.print();
        task.processNextTask();
        task.print();
 */

        //IteratorForList list = new IteratorForList();
        //list.addElemets("1", "2", "3");
        //list.iterateForward();
        //list.iterateBack();

       /* ListDeleteEverySecond list = new ListDeleteEverySecond();
        list.addElements(1,2,4,5,7,8,9,0);
        list.removeEvens();
        list.print();*/

        ListWoDuplicates list = new ListWoDuplicates();
        list.addElements(1,3,4,1,6,3,8,0,1,4,3,0,9,5,2);
        ListWoDuplicates list1 = new ListWoDuplicates();
        list1.addElements(1,3,4,1,6,3,8,0,1,4,3,0,9,5,2);
        list.deleteDuplicates();
        list.print();
        list.deleteDuplicatesWithHash();
        list.print();



    }
}
