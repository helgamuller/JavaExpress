package practice3;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
       // factorialOfNumber();
        //evenNumbers();
        countDownFromNumber();
    }

    public static void factorialOfNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = console.nextInt();
        // 5, f = 1*2*3*4*5
        //
        int factorial = 1;
        while (number>0) {
            factorial = factorial*number;
            number--;
        }
        System.out.println(factorial);

    }

    public static void evenNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        int i = 1;
        while(i<=number) {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }


    }

    public static void countDownFromNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = console.nextInt();

        while(number>0) {
            System.out.println(number);
            number--;
        }
    }
}
