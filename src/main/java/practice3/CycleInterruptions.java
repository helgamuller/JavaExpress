package practice3;

import java.util.Scanner;

public class CycleInterruptions {
    public static void main(String[] args) {
       // summariseEnteredNumbers();
       // skipDividedByThree();
        firstTenDividedByTwoAndFive();
    }
    public static void summariseEnteredNumbers() {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number: ");
            int number = console.nextInt();
            if (number<0) {
                break;
            }
            sum= sum + number;
            System.out.println("The sum is: " + sum);
        }
    }

    public static void skipDividedByThree() {
        for (int i = 1; i <=20 ; i++) {
            if (i%3==0) {
                continue;
            }
            System.out.println(i);


        }
    }

    public static void firstTenDividedByTwoAndFive() {
        int number=0;
        int count = 0;
        while (number < (int)Integer.MAX_VALUE) {

            if ((number%2==0) && (number%5==0)) {
                System.out.println(number);
                count++;
            }
            number++;
            if (count==10) {
                break;
            }

        }
    }
}
