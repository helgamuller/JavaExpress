package practice5.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Обязательное закрытие ресурсов: Напишите метод, который открывает файл и читает данные, используя try-with-resources, чтобы гарантированно закрывать ресурс.
public class TryWithResources {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            while(reader.readLine()!=null) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
