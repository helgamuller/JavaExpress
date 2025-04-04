package practiceTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.MethodSources;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateLengthTest extends StringProcessorTest{
    /**
     * Test for length validation
    *   positive cases:
     *   "abba", 3-> "abba"
     *   "abba", 4 -> ""abba
     * negative case:
     *   "abba", 5 ->IllegalArgumentException
     * corner cases:
     *  "abba", 0 -> "abba"
     *  "", 0-> ""
     *  "hello", -1 -> IllegalArgumentException
     *
    */
    public static Stream<Arguments> stringForValidationPositiveCases(){
        return Stream.of(
                //positive cases
                Arguments.of("abba", 3),
                Arguments.of("abba", 4),
                //corner cases
                Arguments.of("abba", 0),
                Arguments.of("", 0)
        );
    }
    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCases")
    public void userCanValidateStringWithLengthMoreOrEqualToMInValue(String initialString, int minValue){
        String expectedResult = stringProcessor.validateLength(initialString, minValue);
        assertEquals(expectedResult, initialString);
    }

    public static Stream<Arguments> stringForValidationNegativeCases(){
        return Stream.of(
                //negative case
                Arguments.of("abba", 5),
                //corner case
                Arguments.of("hello", -1)

        );
    }
    @ParameterizedTest
    @MethodSource("stringForValidationNegativeCases")
    public void userCanNotValidateStringWithLengthLessThenMInValue(String initialString, int minValue){
        assertThrows(IllegalArgumentException.class, () ->{
                    stringProcessor.validateLength(initialString, minValue);
                }, "Validation of String with length less than initial value leads to exception"
                );

    }
}
