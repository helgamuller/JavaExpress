package Collections.collections.ArrayList._LinkedHashSet;

public class Main {
    public static void main(String[] args) {
  /*  SimpleLinkedHashSet set = new SimpleLinkedHashSet();
    set.addElements("11", "22", "3", "4", "5");
    set.print();
    set.addUniqueElement();
    set.print();


    LCache cache = new LCache();
    cache.addElements("1","2", "3","4","5");
    cache.print();
    cache.addElement("6");
    cache.print();

     IntersectionOfTwoSets.addElements(set1, 1,2,3,4,5,6);
     IntersectionOfTwoSets.addElements(set2, 1,29,8,7,5,6);
     IntersectionOfTwoSets.commonElements();
     printCommon();
     */

   UniqueActionStorage actions = new UniqueActionStorage();
   actions.addActions(1,2,3,4,5,6,7,8);
   actions.printActions();
   actions.addSingleAction(10);
   actions.printActions();
    }
}
