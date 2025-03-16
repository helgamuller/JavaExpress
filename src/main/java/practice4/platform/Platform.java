package practice4.platform;

public class Platform {
    public void addUser(User user, Course course){
        System.out.println(user.getName()+ " was added to " + course.getName());

    }
    public void checkProgress(Students student) {
        System.out.println("The progress of " + student.getName() + " is " + student.getProgress());
    }
}
