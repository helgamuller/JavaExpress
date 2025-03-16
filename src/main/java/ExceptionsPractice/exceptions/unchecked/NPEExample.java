package ExceptionsPractice.exceptions.unchecked;

public class NPEExample {
    public static void main(String[] args) {
        try{
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Attempt to call a null method");        }

    }
}
