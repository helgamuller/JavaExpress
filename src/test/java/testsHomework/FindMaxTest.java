package testsHomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxTest extends TestCommon{
/**
 * Обычный массив ([3, 5, 7, 2])
 * Один элемент в массиве
 * Отрицательные числа
 * Пустой массив (должно выбрасываться исключение)
 *
 * Positive cases:
 * ([3, 5, 7, 2]) - > 7
 * Corner cases:
 * [3] ->3
 * ([-3, -5, -7, -2]) ->-2
 * Negative case:
 * [] -> NoSuchElementException
 */
public static Stream<Arguments> arraysForPositiveFindMax(){
    return Stream.of(
            Arguments.of(new int[]{3, 5, 7, 2}, 7),
            Arguments.of(new int[]{3}, 3),
            Arguments.of(new int[]{-3, -5, -7, -2}, -2)
    );
}

@ParameterizedTest
@MethodSource("arraysForPositiveFindMax")

    public void userCanFindMaxValueInArray(int [] initialArray, int expectedResult) {
        int actualResult = testingCode.findMax(initialArray);
        assertEquals(expectedResult, actualResult);
}

@Test
    public void userCanNotFindMaxValueInArray(){
    Assertions.assertThrows(NoSuchElementException.class, ()-> {
        int[] number = new int[0];
        testingCode.findMax(number);

    });
}
}
