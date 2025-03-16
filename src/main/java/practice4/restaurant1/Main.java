package practice4.restaurant1;

public class Main {
    public static void main(String[] args) {
        Meal drink = new Beverage();
        Meal hotMeal = new HotMeal();
        Manager manager = new Manager();
        manager.addMeal();
        manager.printDescription(hotMeal);
        manager.printDescription(drink);

    }
}
