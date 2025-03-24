package practice6.functionalInterfaces;

public class MainForChecker {
    public static void main(String[] args) {
        Checker isPositive=n->n>0;
        isPositive.printIfValid(5);
        isPositive.printIfValid(-1);
    }

}
