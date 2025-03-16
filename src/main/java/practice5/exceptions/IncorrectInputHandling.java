package practice5.exceptions;

import java.util.Scanner;

//Проверка ввода: Создайте собственное исключение InvalidInputException, которое выбрасывается при вводе некорректного значения (например, отрицательного числа).
public class IncorrectInputHandling {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (number<0) {
            throw new InvalidInputException("Program only accepts positive numbers! ");
        }
    }
}
