package practice3;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
     //  numberDescription();
     //   maxNumberofTwo();
        markPrinting();
    }
    //number>0 >> positive
    //number<0 >> negative
    //number ==0 >> zero
    public static void numberDescription() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        }
        if (number <0) {
            System.out.println("Number is negative");
        }
        if (number==0) {
            System.out.println("Number is zero");
        }

    }
    public static void maxNumberofTwo() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = console.nextInt();
        System.out.print("Enter the second number: ");
        int b = console.nextInt();
        int max = a;
        if (max>b) {
            System.out.println("Maximum is " + max);
        }
        if (max<b) {
            System.out.println("Maximum is " + b);
        }
    }
    public static void markPrinting() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a mark: ");
        int number = console.nextInt();
        if(number ==5) {
            System.out.println("Excellent!");
        }
        if (number==4) {
            System.out.println("Good.");
        }
        if (number==3) {
            System.out.println("Bad");
        }
        if (number==1 || number==2) {
            System.out.println("Awful");

        }   else if(number<1 || number>5) {
            System.out.println("Mark is out of range");
        }

    }
}
