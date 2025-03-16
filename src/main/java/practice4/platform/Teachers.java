package practice4.platform;

public class Teachers extends User{

    public Teachers(String name){
        super(name);
    }
    public void checkTask(Students student){
        System.out.println("I checked a task for student: " + student.getName());

    }
}
