package practice3;

import java.util.Scanner;

import static practice3.Planet.MERCURY;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        //dayOfWeek();
        //planetDescription();
        calulateResult();
    }
    public static void dayOfWeek() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number from 1-7 range: ");
        int day = console.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednsday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Try number from 1 to 7");
        }
    }

    public static void planetDescription() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a planet: ");
        Planet planet = Planet.valueOf(console.nextLine());
        int number = 0;
        double size =0.0;
        switch (planet) {
            case MERCURY:  number = 1; size = 0.5 ;
            break;
            case VENUS: number=2; size=0.7;
            break;
            case EARTH: number = 3; size = 1;
            break;
            case MARS: number=4; size=1.1;
            break;
            case SATURN: number=5; size=1.5;
            break;
            case URANUS:number = 6; size = 2;
            break;
            case NEPTUNE: number=7; size=3;
            break;
            case JUPITER: number=8; size=5;
            break;
            default:
                System.out.println("Incorrect value");
        }
        System.out.println("Order from the Sun is: "+ number + ", size is " + size);
    }

    public static void calulateResult() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = console.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = console.nextInt();
        console.nextLine();
        System.out.print("Enter the operator: ");
        String operator = console.nextLine();
        switch (operator) {
            case "+":
                System.out.println("Sum of the first number and the second number is: " + (numberOne+numberTwo));
                break;
            case "-":
                System.out.println("Substraction result of the first number and the second number is: " + (numberOne-numberTwo));
                break;
            case "*":
                System.out.println("Result of multiplication is: " + numberTwo*numberOne);
                break;
            case "/":
                System.out.println("Result of division is: " + (double)((double)numberOne/(double) numberTwo));
                break;
            default:
                System.out.println("Wrong operator");
                break;
        }

    }
}


