package ExceptionsPractice.exceptions.HW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Контрольный finally: Напишите метод с try-catch-finally, в котором finally выполняется даже при наличии return внутри try.
class Finally {

    public static void main(String[] args) {
        BufferedReader reader=null;

        try{
            String s = "no such file";
            reader = new BufferedReader(new FileReader("example.txt"));
            System.out.println(s);
            return;

        } catch (FileNotFoundException e) {
            System.err.println("No file has been found "+ e.getMessage());
        } finally {
            try {
                if (reader!= null){
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Program has been closed " + e.getMessage());;
            }
        }
    }
}
