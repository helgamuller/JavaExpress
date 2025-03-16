package ExceptionsPractice.exceptions.unchecked;

public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5]; //index doesn't exist

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Attempt to access to an element out of array " + e.getMessage());
        }
    }
}

