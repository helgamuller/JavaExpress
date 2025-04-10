package FinalTasks.UserGrade;

import FinalTasks.UserGrades.GradeService;
import org.junit.jupiter.api.BeforeEach;

public class GradeServiceBeforeEach {
    GradeService<Integer> service;
    @BeforeEach
    public void setup() {

        service = new GradeService<>();
    }

}
