package practice5.exceptions;
//Безопасное деление: Реализуйте метод деления чисел с обработкой ArithmeticException, если происходит деление на ноль.
//Работа с несколькими catch: Напишите метод, который вызывает несколько исключений (NullPointerException, ArithmeticException, NumberFormatException) и обрабатывает их разными catch.
public class ZeroDivision {
    private static void division(int number1, int number2){
        if(number2==0) {
            throw new ArithmeticException("Division by zero is prohibited!");
        }
        if(number1==0) {
            throw  new RuntimeException("Do not use zero here");
        }

    }

    public static void main(String[] args) {
        try {division(0,1);}
        catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

    }
}
