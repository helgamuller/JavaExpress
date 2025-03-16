package ExceptionsPractice.exceptions.HW;

import java.util.Scanner;

//Безопасное деление: Реализуйте метод деления чисел с обработкой ArithmeticException, если происходит деление на ноль.
//Массив и выход за границы: Напишите программу, которая запрашивает у пользователя индекс массива и обрабатывает ArrayIndexOutOfBoundsException.
 class ArithmeticExc {

    static int[] array = {1,2,3};
     private static void requestIndex(){
         Scanner console = new Scanner(System.in);
         try{
             System.out.println("Enter index: ");
             int index = console.nextInt();
             System.out.println(array[index]);
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("This index doesn't exist " + e.getMessage());
         }
     }

    private static double divideNumbers(int num1, int num2) throws ArithmeticException {
        double result = num1 / num2;
        if (num2!=0) {
            return result;
        } else {throw new ArithmeticException("Cannot divide by ZERO");}
        }



    public static void main(String[] args) {
       // Double result = divideNumbers(100, 0);
        //System.out.println(result);
        requestIndex();
    }
}
