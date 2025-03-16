package ExceptionsPractice.exceptions.HW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Обработка файла: Напишите метод, который читает файл и обрабатывает FileNotFoundException и IOException.
 class FileNFExceptionExample  {
    //we need to process exceptions, so I need to implement method with checked exceptions
    static BufferedReader reader = null;


    private static void readFile(String fileName) {
        try {
            FileReader file = new FileReader(fileName);
            reader = new BufferedReader(file);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
           catch (FileNotFoundException e) {
             System.err.println("File not found " + e.getMessage());

        }
        catch (IOException e) {
            System.err.println("File reading error " + e.getMessage());
        } finally {
            try{
                if (reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error while closing file " + e.getMessage());
            }
        }

        }




    public static void main(String[] args) throws FileNotFoundException {
        readFile("111.txt");
    }
    }

