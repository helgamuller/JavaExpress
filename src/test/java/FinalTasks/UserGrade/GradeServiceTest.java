package FinalTasks.UserGrade;

import FinalTasks.UserGrades.Exceptions.InvalidGradeException;
import FinalTasks.UserGrades.GradeService;
import FinalTasks.UserGrades.StudentGrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest extends GradeServiceBeforeEach{
    /**
     * add grade:
     *  Positive cases:
     *
     *      StudentGrade<Integer> grade3 = new StudentGrade<>("Danila", "Eng", 3) -> added
     *      StudentGrade <Integer>grade4 = new StudentGrade<>("Andrey", "Math", 5)-> added
     *  Corner cases:
     *         StudentGrade <Integer>grade1 = new StudentGrade<>("Anna", "Math", 10) -> added
     *         StudentGrade<Integer> grade2 = new StudentGrade<>("Ivan", "Math", 1) - >added
     *  Negative cases:
     *         StudentGrade <Integer>grade1 = new StudentGrade<>("Anna", "Math", 0) -> Not added
     *         StudentGrade<Integer> grade2 = new StudentGrade<>("Ivan", "Math", 15) - >Not added
     *
     */

    //positive and corener tests for addaGrade method
public static Stream<Arguments> studentsWithValidGrade(){
    return Stream.of(
            //positive
            Arguments.of(new StudentGrade<Integer>("Danila", "Eng", 3)),
            Arguments.of(new StudentGrade<Integer>("Andrey", "Math", 5)),
            //corner
            Arguments.of(new StudentGrade<Integer>("Anna", "Math", 10)),
            Arguments.of(new StudentGrade<Integer>("Ivan", "Math", 1))
    );
}

    @ParameterizedTest
    @MethodSource("studentsWithValidGrade")
    @DisplayName("user Can Add Student With Valid Grade")
    public void userCanAddStudentWithValidGrade(StudentGrade<Integer> grade){
        service.addGrade(grade);
        assertTrue(service.getList().contains(grade)) ;
    }

    //negative tests for addaGrade method
    public static Stream<Arguments> studentsWithInValidGrade(){
        return Stream.of(

                //negative
                Arguments.of(new StudentGrade<Integer>("Anna", "Math", 0)),
                Arguments.of(new StudentGrade<Integer>("Ivan", "Math", 15))
        );
    }

    @ParameterizedTest
    @MethodSource("studentsWithInValidGrade")
    @DisplayName("user Can Not Add Student With inValid Grade")
    public void userCanAddStudentWithInValidGrade(StudentGrade<Integer> grade){
    assertThrows(InvalidGradeException.class, ()->service.addGrade(grade));

    }
/**
 * tests for countAverageGrade method
 *  Positive:
 *      ("Anna", "Math", 10), ("Ivan", "Math", 1)), Math ->5.5
 *
 *  Negative:
 *      When no grades for subject
 *      ("Anna", "Math", 10), ("Ivan", "Math", 1)), Eng ->0.0
 *
 */
      public static Stream<Arguments> studentsWithGradesForMath(){
          return Stream.of(
                  Arguments.of(
                          new StudentGrade<>("Anna", "Math", 10),
                            new StudentGrade<>("Ivan", "Math", 1))
          );
      }


    @ParameterizedTest
    @MethodSource("studentsWithGradesForMath")
    @DisplayName("user Can Count Average Grade Per Subject")
    public void userCanCountAverageGradePerSubject(StudentGrade grade1, StudentGrade grade2){
          service.addGrade(grade1);
          service.addGrade(grade2);
          Double actualResult = service.countAverageGrade("Math");
          assertEquals(5.5, actualResult);

    }

    public static Stream<Arguments> studentsWithoutGradesForMath(){
        return Stream.of(
                Arguments.of(
                        new StudentGrade<>("Anna", "Eng", 10),
                        new StudentGrade<>("Ivan", "Rus", 1))
        );
    }


    @ParameterizedTest
    @MethodSource("studentsWithoutGradesForMath")
    @DisplayName("user Can NOT Count Average Grade Per Subject")
    public void userCanNotCountAverageGradePerSubject(StudentGrade grade1, StudentGrade grade2){
        service.addGrade(grade1);
        service.addGrade(grade2);
        Double actualResult = service.countAverageGrade("Math");
        assertEquals(0.0, actualResult);

    }
}
