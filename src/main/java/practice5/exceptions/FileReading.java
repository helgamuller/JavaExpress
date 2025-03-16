package practice5.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Обработка файла: Напишите метод, который читает файл и обрабатывает FileNotFoundException и IOException.
public class FileReading {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("task1.txt"));
            while(reader.readLine()!=null) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("No such file " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Problem with reading a file: " + e.getMessage());;
        } finally {
            try {
                if(reader !=null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Can't close file");
            }
        }

    }
}
