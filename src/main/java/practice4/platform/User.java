package practice4.platform;

public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
