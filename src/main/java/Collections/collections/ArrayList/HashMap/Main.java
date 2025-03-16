package Collections.collections.ArrayList.HashMap;
//Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
//Проверьте, есть ли определённое имя в HashMap.
  //      Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.
   //     Создайте HashMap, где ключ – слово, а значение – количество его вхождений в тексте.
//Реализуйте механизм кеширования данных в HashMap с ограничением по времени хранения.
public class Main {
    public static void main(String[] args) throws InterruptedException {

      /*  SimpleHashMap names = new SimpleHashMap();
        names.add("Anna", 5);
        names.add("Inna", 6);
        names.add("Avan", 7);
        names.add("Olga", 43);
        names.add("Andrey", 38);

        names.print();
        boolean contain = names.isContain("Olga");
        System.out.println(contain);
        names.removeYoung();
        names.print();



        HashMapWordsAmount words = new HashMapWordsAmount();
        words.addElement("Ivan");
        words.addElement("Ivan");
        words.addElement("Petr");
        words.print();

*/
        CacheHashMap cache = new CacheHashMap();
        cache.add("1");
        Thread.sleep(3000);
        cache.add("2");
        cache.print();
        Thread.sleep(1000);
        cache.print();
        cache.add("3");
        Thread.sleep(1000);
        cache.print();
        Thread.sleep(3000);
        cache.print();


    }
}
