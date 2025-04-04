package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends TestCommon{
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных
    /**
     * Positive cases:
     * "hello" -> 2
     * "AEIOU" -> 5
     *
     * Corner cases:
     * "ddt" ->0
     *      *  "" -> 0
     *
     *
     *  Negative cases:
     *  null-> IllegalArgumentException
     */
    public static Stream<Arguments> validStringsToCountVowels(){
        return Stream.of(
                //happy path
                Arguments.of("hello", 2),
                Arguments.of("AEIOU", 5),
                //corner cases
                Arguments.of("ddt", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToCountVowels")
    public void userCanCountVowelsInValidString(String initialString, int expectedResult){
        int actualResult = testingCode.countVowels(initialString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanNotCountVowelsIfStringIsNull() {
        assertThrows(IllegalArgumentException.class, ()-> {
            testingCode.countVowels(null);
        },
                "Input string can not be null");

    }
}
