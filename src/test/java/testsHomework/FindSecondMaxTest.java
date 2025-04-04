package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends TestCommon{
    /**
     * Обычные массивы
     * Массив с одинаковыми числами
     * Один элемент в массиве (должно выбрасываться исключение)
     * Array with duplicates
     *
     * Positive case:
     *      {1,2,3,4} - >3
     *  Corner cases:
     *
     *      {1,2,3,3,4} ->3 ()
     * Negative case:
     *  {1} -> NoSuchElementException
     *  {1,1,1} - > NoSuchElementException
     */

    public static Stream<Arguments> validArraysToFindSecondMax() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4}, 3),
                Arguments.of(new int[] {1,2,3,3,4}, 3) //actually method doesn't work correct here because we take a length of initial array here
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysToFindSecondMax")
    public void userCanFindSecondMaxInArray(int[] initialArray, int expectedResult){

        int actualResult = testingCode.findSecondMax(initialArray);
        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> inValidArraysToFindSecondMax() {
        return Stream.of(
                Arguments.of(new int[] {1}),
                Arguments.of(new int[] {}),
                Arguments.of(new int[] {1,1, 1})
                );
    }

    @ParameterizedTest
    @MethodSource("inValidArraysToFindSecondMax")
    public void userCanNotFindSecondMaxInArray(int[] initialArray){
        assertThrows(NoSuchElementException.class, ()-> {testingCode.findSecondMax(initialArray);},
                "No second  max element int this array");
    }

    }
