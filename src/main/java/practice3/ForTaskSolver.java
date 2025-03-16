package practice3;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
       // numbersDividedByThree();
       // sumOfNumbers();
        multiplicationTable();
    }
    public static void  numbersDividedByThree() {
        // if (number%3)
        // increment=3 - looks wrong
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0) {
                System.out.println(i);
            }

        }
    }
    public static void sumOfNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();
        int sum = 0;
        for (int i = 1; i <=number; i++) {
            sum = sum +i;

        }
        System.out.println(sum);
    }

    public static void multiplicationTable() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        //
        for (int i = 1; i <=10 ; i++) {
            int mult = number*i;
            System.out.println(number + " x " + i + " = " + mult);
        }
    }
}
