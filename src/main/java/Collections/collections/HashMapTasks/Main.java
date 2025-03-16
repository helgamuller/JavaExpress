package Collections.collections.HashMapTasks;
//Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
//Проверьте, есть ли определённое имя в HashMap.
//Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.
//Создайте HashMap, где ключ – слово, а значение – количество его вхождений в тексте.
//Реализуйте механизм кеширования данных в HashMap с ограничением по времени хранения.
public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* NameAndAge names = new NameAndAge();
        names.add("Olga", 43);
        names.add("Ann", 13);
        names.add("Antony", 18);
        names.add("Ivan", 14);
        names.add("Kate", 35);
        names.print();
        names.isNameExists();
        names.removeIfYoung();
        names.print();


        WordsCounter words = new WordsCounter();
        words.wordsCount("123");
        words.wordsCount("123");
        words.wordsCount("123");
        words.wordsCount("333");
        words.print();

*/
        MapCache cache = new MapCache();
        cache.addKey("First");
        Thread.sleep(3000);
        cache.addKey("Second");
        cache.print(); //1,2
        Thread.sleep(3000);
        cache.print(); //2
    }
}
