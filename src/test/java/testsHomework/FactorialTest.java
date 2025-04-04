package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends TestCommon{
    /**
     * 0! = 1
     * Маленькие числа (1!, 5!, 7!)
     * Отрицательные числа (должно выбрасываться исключение)
     *
     * Positive:
     *      0 -> 1 - corner case
     *      1-> 1
     *      5 ->120
     *      7 - >5040
     * Negative:
     *  -7 - > IllegalArgumentException("Negative numbers not allowed")
     */
    public static Stream<Arguments> validFactorialInputs(){
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("validFactorialInputs")
    public void userCanCalculateFactorial(int factorialBase, int expectedResult){
        int actualResult = testingCode.factorial(factorialBase);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotCalculateFactorialForNegativeNumber(){
        assertThrows(IllegalArgumentException.class, ()->{
            testingCode.factorial(-7);

        });
    }
}
