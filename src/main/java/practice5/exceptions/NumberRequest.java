package practice5.exceptions;
//Запрос ввода у пользователя: Реализуйте метод, который запрашивает у пользователя число, но не принимает null или пустую строку, выбрасывая IllegalArgumentException.

public class NumberRequest {
    private static String s;
    private static void getNumber(String s){

        if ((s.equals(null)||(s.equals(" ")))) {
            throw new IllegalArgumentException("Enter Integer number");

        }
    }

    public static void main(String[] args) {
        getNumber(" ");
    }
}
