package practice1;

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name=name;
        this.subject = subject;
    }
    public String getName() {
        return  this.name;
    }
    public  String getSubject() {
        return  this.subject;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher: "+ this.name +", Subject " + this.subject);
    }
}
