package genericsPractice.HW;

import genericsPractice.Book;

//Сортировка с Comparable<T>: Напишите класс Box<T extends Comparable<T>>, который хранит объект и умеет сравнивать его с другим.
 class Box <T extends Comparable<T>> implements Comparable<Box<T>>{
    private T item;

    public Box (T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public  void compareItemsAreEqual(T item) {
        if (this.item.compareTo(item)==0) {
            System.out.println(this.item + " and " + item + " are equal" );
        }
        else {
            System.out.println(this.item + " and " + item + " are  DIFFERENT" );

        }
    }


        @Override
        public int compareTo(Box<T> o) {
            return this.item.compareTo(o.item);
        }

        @Override
        public String toString() {
            return "Box{" +
                    "item=" + item +
                    '}';
        }


    public static void main(String[] args) {
        Box<Book> box1 = new Box(new Book("1111"));
        Box<Book> box2 = new Box(new Book("2222"));
        Box<Book> box3 = new Box(new Book("2222"));

        //box2.setItem(new Book("Task"));
        //box1.setItem(new Book("Ivan"));
        box2.compareItemsAreEqual(box3.getItem());
    }


}
