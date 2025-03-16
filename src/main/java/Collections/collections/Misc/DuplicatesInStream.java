package Collections.collections.Misc;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatesInStream {
    private static HashSet<Integer> stream;
    static {
        stream = new HashSet<>();
    }
    private static void addElement(){
        System.out.print("Enter an integer: ");
        Scanner console = new Scanner(System.in);
        Integer num = console.nextInt();
        checkIfElementHasReceived(num);
        stream.add(num);
    }
    private static void checkIfElementHasReceived(Integer num){
        if (stream.contains(num)) {
            System.out.println("We already has this element");
        }

    }


    public static void main(String[] args) {
        addElement();
        addElement();
        addElement();


    }
}
