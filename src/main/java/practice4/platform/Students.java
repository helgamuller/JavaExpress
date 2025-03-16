package practice4.platform;

public class Students extends User{
    private int progress = 0;

    public Students(String name) {
        super(name);
    }
    public void study(Course course){
        System.out.println("I just started a course " + course.getName());
    }
    public void makeProgress(int progress){
        this.progress=progress;
        System.out.println("My progress on course is " + this.progress);

    }

    public int getProgress() {
        return progress;
    }
}
