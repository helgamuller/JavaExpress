package ExceptionsPractice.exceptions.HW;

import java.util.Scanner;

//Работа с несколькими catch: Напишите метод, который вызывает несколько исключений (NullPointerException, ArithmeticException, NumberFormatException) и обрабатывает их разными catch.
class MultipleCatchings {
    int num;

    private static void testMethod(int x){
        try {
            int num;
            String s = null;
            Scanner console = new Scanner(System.in);
            num = console.nextInt();
            Integer.parseInt(" ");
            double result =x/num;
            //int d = s.length();
        } catch (NullPointerException e) {
            System.err.println("Oops, her is nothing " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.err.println("Arithmetic problem" + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Problem with parsing " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        testMethod(7);
    }
}
