package practiceProblemSolving;

//Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.
//15

public class DebugTask2 {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}