package practice4.restaurant1;

public class Manager {
    protected void addMeal() {
        System.out.println("New meal was added");
    }
    protected void printDescription(Meal meal) {
        System.out.println(meal.getName() + " is served " + meal.getServingConditions());
    }
}
