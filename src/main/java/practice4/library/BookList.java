package practice4.library;

public class BookList {
    final static int INITIAL_AMOUNT = 100;
    private static int counter = INITIAL_AMOUNT;

    public static int getCounter() {
        return counter;
    }
    public static void increaseBookAmount(){
        counter++;
        System.out.println("Current amount of books in the library is" + counter);
    }
    public static void decreaseBookAmount(){
        counter--;
        System.out.println("Current amount of books in the library is" + counter);
    }

}
