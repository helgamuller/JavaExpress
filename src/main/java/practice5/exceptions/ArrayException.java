package practice5.exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Массив и выход за границы: Напишите программу, которая запрашивает у пользователя индекс массива и обрабатывает ArrayIndexOutOfBoundsException.
public class ArrayException {
   private static List<Integer> list;
    static {list = new ArrayList<>();
        Collections.addAll(list,1,2,3);
    }
    private  static void getElement(int index) {
        System.out.println(list.get(index));
    }

    public static void main(String[] args) {
        try {
            getElement(6);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
