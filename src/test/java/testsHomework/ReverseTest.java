package testsHomework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseTest extends TestCommon{

    /**
     * Обычные строки
     * Пустую строку
     * null (должно возвращаться null)
     *
     * Positive case:
     *      "lambda" -> "adbmal"
     *      "LAmb" -> "bmAL"
     *  Corner case:
     *      "" -> ""
     *  Negative case:
     *  null -> null
     *
     */
    public static Stream<Arguments> validStringsToReverse(){
       return Stream.of(
                Arguments.of("lambda", "adbmal"),
                Arguments.of("LAmb", "bmAL"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String resultString) {
        String reversedString = testingCode.reverse(initialString);
        assertEquals(resultString, reversedString);
    }

    @Test
    public void userCanNotReverseNullString(){
        assertNull(testingCode.reverse(null));
    }
}
