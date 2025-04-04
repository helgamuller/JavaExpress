package practiceTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest{

    /**
     * Test for string reverse:
     * happy path: olga -> aglo
     * corner cases:
     * ""->""
     * "a"-> "a"
     * null-> illegal argument Exception
     */

    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                //happy path: olga -> aglo
                Arguments.of("olga", "aglo"),
                //corner case: ""->""
                Arguments.of("", ""),
                Arguments.of("a", "a")
        );
    }
//we made it parametrized because all steps are equal
    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {

        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString, "We expected result: " + expectedString + " but happened: " + reversedString);
    }

    //     * null-> illegal argument Exception
    //negative ALWAYS separate!!
    @Test
    public void userCanNotReverseNullString() {
        assertThrows(IllegalArgumentException.class, ()->{
            stringProcessor.reverse(null);

        },
        "Reversing of string should lead to IllegalArgumentException");
    }
}


