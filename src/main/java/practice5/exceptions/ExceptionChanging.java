package practice5.exceptions;

import java.util.ArrayList;
import java.util.List;

//Цепочка исключений: Создайте метод, который выбрасывает одно исключение, но перехватывает его и выбрасывает другое (Exception Chaining).
public class ExceptionChanging {
    //method 1 throw exception1
    private static void twoExceptions(int n){

       try {
           List<Integer> list = new ArrayList<>();
           if (list.isEmpty()) {
               throw new NullPointerException("No any elements in a list");
           }
           list.get(n);
       } catch (NullPointerException e) {
           throw new RuntimeException("Can't get index because " + e.getMessage());
       }
    }

    //method 2, catch exception 2 and add exception 1 in a message
    //main - catch second exception

    public static void main(String[] args) {
        try{
            twoExceptions(3);
        } catch (RuntimeException e) {
            System.err.println("Here is a problem " + e.getMessage());        }

    }
}
