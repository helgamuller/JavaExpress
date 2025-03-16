package ExceptionsPractice.errors;

public class StackOverflowErrorExample {
    public static void recursivePrinter(int num) {
        System.out.println(num);
        recursivePrinter(num+1);
    }

    public static void main(String[] args) {
        recursivePrinter(1);
    }
}

