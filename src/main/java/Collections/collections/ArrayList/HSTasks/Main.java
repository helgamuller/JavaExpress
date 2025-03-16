package Collections.collections.ArrayList.HSTasks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    /*Set set = new Set();
    set.addElements("2,4,6,8,3,4,2,9,null,61,2","232","232323");
    set.printSet();
    set.addRandoms();
    set.printNumSEt();
    set.isContainNumber();?
   Set set1= new Set();
        ArrayList<String> list = set1.fillAnArray("123", "123", "1234", "1", "2", "2");
        list.forEach(System.out::println);

        HashSet<String> strings = set1.convertListInToSet(list);
        strings.forEach(System.out::println);
        */
     TwoSets.addElements1(1,2,3,4,5,6,7,8,9,0);
        System.out.println(TwoSets.set1);

     TwoSets.addElements2(0, 1);
        System.out.println(TwoSets.set2);
     System.out.println("Does sets have common elements? " + TwoSets.isSetContains());


      /* Cache cache = new Cache(5000);
       cache.add(10);
       Thread.sleep(3000);
       cache.add(20);
        Thread.sleep(3000);
        cache.add(30);
        Thread.sleep(3000);

        cache.print();
        cache.add(35);

        Thread.sleep(3000);


        cache.print();
*/
    }
}
