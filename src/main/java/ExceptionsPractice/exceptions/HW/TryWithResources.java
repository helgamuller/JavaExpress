package ExceptionsPractice.exceptions.HW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Обязательное закрытие ресурсов: Напишите метод, который открывает файл и читает данные, используя try-with-resources, чтобы гарантированно закрывать ресурс.
class TryWithResources {
    private static void getNumber(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = console.nextLine();
        if(input.isEmpty()) {
            throw  new IllegalArgumentException("Input correct value(a number)!");
        }

            int number = Integer.parseInt(input);
            System.out.println(number);



    }

    public static void main(String[] args) {
      /*  try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while((line= reader.readLine())!=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Can't find a file " + e.getMessage());;
        } catch (IOException e) {
            System.err.println("Can't read a file " + e.getMessage());;
        }
        */
       getNumber();
    }

}

