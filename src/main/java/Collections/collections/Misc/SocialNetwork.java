package Collections.collections.Misc;

import java.util.HashMap;
import java.util.HashSet;

public class SocialNetwork {
    private static HashMap<String, HashSet<String>>  friends;
    private  static HashSet<String> f;

    static {
        friends = new HashMap<>();
        f= new HashSet<>();

    }
    private static void createUser(String name){
        friends.put(name, null);
        friends.forEach((key, value)-> System.out.println(key + " " + value));
        System.out.println();
    }
    private static void addFriend(String name, String friend){
        f.add(friend);
        friends.put(name, f);
        friends.forEach((key, value)-> System.out.println(key + " " +value));
    }

    public static void main(String[] args) {
        createUser("Olga");
        addFriend("Olga", "Andrey");
        addFriend("Olga", "Ann");

    }
}
