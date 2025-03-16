package practice2;

public class University {
    public static String universityName;
    private final int studentID;
    private String studentName;

    University(int studentID, String studentName) {
      this.studentID = studentID;
      this.studentName = studentName;
    }
    public static void changeUniversityName(String newName) {
        universityName = newName;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public void printStudentInfo() {
        System.out.println("University is: " +universityName +" Student name is: " + this.studentName + " StudentID is: " + this.studentID);
    }

}
