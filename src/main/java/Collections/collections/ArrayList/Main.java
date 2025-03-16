package Collections.collections.ArrayList;

public class Main {
    public static void main(String[] args) {
      //  Task1 task = new Task1();
       // task.print();
        //task.addNumber(6);
        //task.print();

        //Task2 task = new Task2();
        //task.print();
        //task.removeEven();
        //task.print();

        //Task3 task = new Task3();
        //task.print();

    //Task4 task1 = new Task4();
    //Task4 task2 = new Task4();
    //task1.addElements(1,4,5,6,7,8);
    //task2.addElements(0,3,5,7,8);
    //task1.mergeArrayLists(task1.getList(), task2.getList());
    //task1.print();

        Task5 task = new Task5();
        task.addElements(5,6,3,8,1,0);
        task.returnSortedList(task.getList());
        task.print();


    }
}
