package practiceTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testsHomework.TestCommon;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CountWordsTest extends TestCommon {
    /**
     * Пустую строку
     * null
     * Строку с несколькими пробелами
     *
     * Positive tests:
     *      "hello world!" - > 2
     *      "hello" -> 1
     *      "I am happy" - > 3
     * Corner cases:
     *      "two  spaces" -> 2
     *      ""           -> 0
     * Negative case:
     *      null - >0
     *
     */
    public static Stream<Arguments> validStringsForWordsCount(){
        return Stream.of(
                Arguments.of("hello world!", 2),
                Arguments.of("hello", 1),
                Arguments.of("I am happy", 3),
                Arguments.of("two  spaces", 2),
                Arguments.of("", 0)
        );
    }

@ParameterizedTest
@MethodSource("validStringsForWordsCount")
    public void userCanCountWords(String initialString, int expectedResult) {
        int actualResult = testingCode.countWords(initialString);
        assertEquals(expectedResult, actualResult);
}
@Test
    public void userCanCountWords(){
        assertNull(testingCode.countWords(null));
}
}
