package practiceProblemSolving;

//Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.

public class DebugTask4 {
    public static void main(String[] args) throws NullPointerException {
        System.out.println(isPalindrome("null"));
    }

    public static boolean isPalindrome(String str) {

        if (str != null) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
        return false;
    }
}

