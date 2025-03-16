package Collections.collections.ArrayList.TreeSet;
//Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
//Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
//Найдите ближайшее большее и меньшее число к заданному в TreeSet.
//Реализуйте сортировку пользователей по имени с TreeSet и Comparator.
//Используйте TreeSet для хранения уникальных слов из текста в отсортированном порядке.
public class Main {
    public static void main(String[] args) {
        /*TreeSetTasks tree = new TreeSetTasks();
        tree.addElement(4,5,1,0,-2,-2);
        tree.printTree();
        tree.lessAndGreater(6);
*/
        UserNameSorting names = new UserNameSorting();
        names.add("Ivan");
        names.add("Kira");
        names.add("Tom");
        names.createReversedList();
        names.print();
        /*
        UniqueWords words = new UniqueWords();
        words.addWords("Ivan", "Ivan", "Case", "stool","car");
        words.print();

        */
    }
}
