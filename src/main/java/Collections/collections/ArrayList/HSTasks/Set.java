package Collections.collections.ArrayList.HSTasks;

import java.util.*;

public class Set {
    private HashSet<String> set;
    private HashSet<Integer> numset;


    public Set(){
        this.set = new HashSet<>();
        this.numset = new HashSet<>();
    }
    public void addElements(String... elements){
        Collections.addAll(set, elements);
    }
    public void addRandoms(){
        Random random = new Random();
        int size = 10;
        while(numset.size() <size) {
            numset.add(random.nextInt(100));
        }
    }
    protected ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> fillAnArray(String... elements){
        Collections.addAll(list, elements);
        return list;
    }


    public void printSet() {
        set.forEach(System.out::println);
    }
    public void printNumSEt() {
        numset.forEach(System.out::println);
    }


    public void isContainNumber(){
       Scanner console = new Scanner(System.in);
        System.out.print("Input an integer number: ");
       int num = console.nextInt();
        if (numset.contains(num))
            System.out.println("Set contains " + num);
        else {
            System.out.println("Set doesn't contain " + num);
        }
    }

    public HashSet<String> convertListInToSet(List<String> list) {
        list.forEach(set::add);

        return set;
    }

}
