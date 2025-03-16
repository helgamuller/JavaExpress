package practice5.generics;
//Сортировка с Comparable<T>: Напишите класс Box<T extends Comparable<T>>, который хранит объект и умеет сравнивать его с другим.
public class Box <T extends Comparable<T>>{
   private T item;

   public Box(T item) {
       this.item = item;
   }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box(1);
        Box<Integer> box2 = new Box<>(0);
        if (box1.getItem().compareTo(box2.getItem())>0)
        {   System.out.println("First item is bigger");

            return;
        }



    }
}
