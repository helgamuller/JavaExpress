package FinalTasks.EntityManager;

public class Entity {
    private int age;
    private String name;
    private boolean isActive;

    public Entity(int age, String name, boolean isActive){
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public int getAge() {
        return age;
    }

    public boolean getStatus() {
        return isActive;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getName() {
        return name;
    }
}
