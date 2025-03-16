package ExceptionsPractice.exceptions.HW;

import ExceptionsPractice.exceptions.library.exceptions.InvalidBookException;

//Проверка ввода: Создайте собственное исключение InvalidInputException, которое выбрасывается при вводе некорректного значения (например, отрицательного числа).
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message){
        super(message);
    }
}
