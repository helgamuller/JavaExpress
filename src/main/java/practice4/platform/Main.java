package practice4.platform;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Chemistry");
        User student = new Students("petya");
        User teacher = new Teachers("Maria Ivanovna");
        Teachers teacher1 = new Teachers("Ivan Ivnaych");
        Students student1 = new Students("sidoroff");
        Platform platform = new Platform();
        platform.addUser(student, course);
        platform.addUser(teacher, course);
        student1.study(course);
        teacher1.checkTask(student1);
        platform.checkProgress(student1);
        student1.makeProgress(30);
        platform.checkProgress(student1);

    }
}
