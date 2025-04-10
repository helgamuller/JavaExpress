package FinalTasks.UserGrades;

import FinalTasks.UserGrades.Exceptions.InvalidGradeException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class GradeService <T extends Number>{
    private List<StudentGrade<T>> list;

    public GradeService(){
        this.list = new LinkedList<>();
    }

    public List<StudentGrade<T>> getList() {
        return list;
    }

    public synchronized void addGrade(StudentGrade<T> studentGrade){
        //valid range [1-10]
        double studentGradeD =  studentGrade.getGrade().doubleValue();
        if((studentGradeD <1.0)||(studentGradeD>10.0) ) {
            throw new InvalidGradeException("Grade is out of range");
        }
        else {
            list.add(studentGrade);
        }
    }
    public Double countAverageGrade(String subject){
        Double average = list.stream()
                .filter(studentGrade->studentGrade.getSubject().equals(subject))
                .mapToDouble(studentGrade ->studentGrade.getGrade().doubleValue())
                . average()
                .orElse(0.0);
        System.out.println("Average grade for subject " + subject + " is " + average);
        return average;
    }

    @Override
    public String toString() {
        return "GradeService{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
       StudentGrade grade1 = new StudentGrade<>("Anna", "Math", 10);
       StudentGrade grade2 = new StudentGrade<>("Ivan", "Math", 1);
       StudentGrade<Integer> grade3 = new StudentGrade<>("Danila", "Eng", 3);
      StudentGrade grade4 = new StudentGrade<>("Andrey", "Math", 5);

        GradeService<Integer> service = new GradeService();
    service.addGrade(grade1);
       service.addGrade(grade2);
        service.addGrade(grade3);
      service.addGrade(grade4);
        System.out.println(service);
        service.countAverageGrade("Math");






    }


}
