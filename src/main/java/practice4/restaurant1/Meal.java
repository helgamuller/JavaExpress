package practice4.restaurant1;

public abstract class Meal {
   private String name;
   private String servingConditions;

   protected Meal(String name, String servingConditions) {
       this.name = name;
       this.servingConditions = servingConditions;
   }
    public String getName() {
        return name;
    }

    public String getServingConditions() {
        return servingConditions;
    }
}
