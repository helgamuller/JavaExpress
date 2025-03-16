package practice3;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
       // waitingForPositiveNumber();
       // passwordRequest();
        numbersPrint();
    }

    public static void waitingForPositiveNumber() {
        Scanner console = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please, enter a number: ");
            number = console.nextInt();
        }
        while(number<=0);
    }

    public static void passwordRequest() {
        Scanner console = new Scanner(System.in);
        String pwd = "123";
        String pwdAttempt;
        do{
            System.out.print("Enter a password: ");
            pwdAttempt = console.nextLine();
            //console.nextLine();
        }
        while (!pwdAttempt.equals(pwd));
    }

    public static void numbersPrint() {

        int number = 1;
        do {
            System.out.println(number);
            number++;
        }
        while (number<=10);
    }
}
