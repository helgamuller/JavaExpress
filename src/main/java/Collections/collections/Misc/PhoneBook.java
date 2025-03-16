package Collections.collections.Misc;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String, Integer> phoneBook;
    static  {
        phoneBook = new HashMap<>();
    }
    private static void addContact(String name, Integer phone) {
        phoneBook.put(name, phone);
    }
    private static void findContact(String name) {
        Integer number = phoneBook.get(name);
        System.out.println(name + " "+number);
    }

    public static void main(String[] args) {
        addContact("Ivan", 111);
        addContact("Igor", 2222);
        findContact("Igor");
    }
}
