package testsHomework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountWordsTest extends TestCommon {
    /**
     * Пустую строку
     * null
     * Строку с несколькими пробелами
     * Positive cases:
     *      "olga" - >1
     *      "olga melnikova" -> 2
     * Corner cases:
     *      " space" - >1
     *      " two spases " ->2
     *      "two  spaces   between" - >3
     *      "   -threespaces"-> 1
     *      "" -> 0
     *      "   " ->0
     * Negative cases:
     *      null
     */
    public static Stream<Arguments> validStringsToCountWords(){
        return Stream.of(
                Arguments.of("olga", 1),
                Arguments.of("olga melnikova", 2),
                Arguments.of(" space", 1),
                Arguments.of(" two spases ", 2),
                Arguments.of("two  spaces   between", 3),
                Arguments.of("   -threespaces", 1),
                Arguments.of("", 0),
                Arguments.of("   ", 0)
        );
    }


    @ParameterizedTest
    @MethodSource("validStringsToCountWords")
    @DisplayName("User can count words in a valid string")
    public void userCanCountWordsInValidString(String initialString, int expectedResult){
        int actualResult = testingCode.countWords(initialString);
        assertEquals(expectedResult, actualResult);
    }

}
